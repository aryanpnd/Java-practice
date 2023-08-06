import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

public class calculator {

    public static void main(String[] args) {
        String code = "public class DynamicClass {\n" +
                      "    public static void run() {\n" +
                      "        System.out.println(\"Hello from dynamic code!\");\n" +
                      "    }\n" +
                      "}";

        // Compile and execute the provided code
        executeDynamicCode(code);
    }

    public static void executeDynamicCode(String code) {
        try {
            // Get the system Java compiler
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            // Compile the code and store it in memory
            InMemoryJavaFileManager fileManager = new InMemoryJavaFileManager(compiler);
            boolean compilationResult = compiler.getTask(null, fileManager, null, null, null, fileManager.getJavaFileObjectsFromString(code)).call();

            if (compilationResult) {
                // Load the compiled class dynamically
                ClassLoader classLoader = fileManager.getClassLoader(null);
                Class<?> dynamicClass = classLoader.loadClass("DynamicClass");

                // Find and invoke the 'run' method of the dynamic class
                Method runMethod = dynamicClass.getMethod("run");
                runMethod.invoke(null); // Since the 'run' method is static, pass null as the instance
            } else {
                System.out.println("Compilation failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Helper class to capture the compiled class in memory
class InMemoryJavaFileManager extends javax.tools.ForwardingJavaFileManager<javax.tools.StandardJavaFileManager> {
    private JavaClassObject jclassObject;

    public InMemoryJavaFileManager(javax.tools.JavaCompiler compiler) {
        super(compiler.getStandardFileManager(null, null, null));
    }

    public Iterable<? extends JavaFileObject> getJavaFileObjectsFromString(String code) {
        return null;
    }

    public JavaClassObject getJavaClassObject() {
        return jclassObject;
    }

    @Override
    public javax.tools.JavaFileObject getJavaFileForOutput(javax.tools.JavaFileManager.Location location,
                                                           String className,
                                                           javax.tools.JavaFileObject.Kind kind,
                                                           javax.tools.FileObject sibling) {
        jclassObject = new JavaClassObject(className, kind);
        return jclassObject;
    }

    public ClassLoader getClassLoader(javax.tools.JavaFileManager.Location location) {
        return new ClassLoader() {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                byte[] b = jclassObject.getBytes();
                return defineClass(name, b, 0, b.length);
            }
        };
    }
}

// Helper class to capture the compiled class bytes in memory
class JavaClassObject extends javax.tools.SimpleJavaFileObject {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    public JavaClassObject(String name, javax.tools.JavaFileObject.Kind kind) {
        super(java.net.URI.create("string:///" + name.replace('.', '/') + kind.extension), kind);
    }

    public byte[] getBytes() {
        return outputStream.toByteArray();
    }

    @Override
    public OutputStream openOutputStream() {
        return outputStream;
    }
}
