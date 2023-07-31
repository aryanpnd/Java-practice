# points to remember

- 1. "for(;;)" this will make an infinite loop because no ending condition is given.
- 2. use double qoutes ("") for strings and single qoutes ('') for characters.
- 3. we cannot do this -
```java
public class HelloWorld {
    public static void main(String[] args) {
        short x = 20;
        x = x*2;
        System.out.println(x);
    }
}
```
> **output** : error: incompatible types: possible lossy conversion from int to short

>**reason** :  there is a potential issue due to the expression shortValue * 2. When you multiply a short value with an int value (in this case, shortValue is implicitly converted to an int for the multiplication), the result will be of type int. Assigning the result back to shortValue, which is of type short, may cause a compilation error or result in unexpected behavior if the result of the multiplication exceeds the maximum value that can be represented by a short.
- 4. in java, if integer starts with 0 then java will treat it in octal not decimal, for eg - 15 will be treated as 15 but 015 will be treated as 13, because the decimal conversion of octal 15 in decimal will be 13.
- 5.  
