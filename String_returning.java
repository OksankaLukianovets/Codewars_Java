public class String_returning {
    public static void main(String[] args) {
               System.out.println(greet("Oksana"));
    }
    public static String greet(String name) {
        return String.format("Hello, " + name +  " how are you doing today?");

    }
}
