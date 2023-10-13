package stringPkg;

import java.lang.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("demo");
        System.out.println(stringBuilder);
        stringBuilder.append("s");
        System.out.println(stringBuilder);
        stringBuilder.delete(2,4);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());  // Size of inetrnal storage.
    }
}

/**
 * javac -cp classes/ -d classes/ src/stringPkg/StringBuilderDemo.java
 * java -cp classes/ stringPkg.StringBuilderDemo
 */
