public class strCompare {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "hello";
        String fullname = msg1 + " " + msg2;

        // this case will work fine
        if (msg1.compareTo(msg2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (msg1 == msg2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // this wont (thats why use compareTo function with strings instead of ==)
        if (new String("hello") == new String("hello")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (new String("hello").compareTo(new String("hello")) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
