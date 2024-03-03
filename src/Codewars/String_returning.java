package Codewars;

public class String_returning {
    public static void main(String[] args) {
        System.out.println(greet("Oksana"));
        System.out.println(greet("Polina"));
        System.out.println(greet("Natalia"));
        System.out.println(greet("Yulia"));
        System.out.println(greet("Marina"));
    }

    public static String greet(String name) {
        return String.format("Hello, " + name + " how are you doing today?");

    }
}
