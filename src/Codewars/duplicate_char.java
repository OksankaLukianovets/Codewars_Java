package Codewars;

public class duplicate_char {
    public static String doubleChar(String s) {
        StringBuilder doubledString = new StringBuilder();
        for (char character : s.toCharArray()) {
            doubledString.append(character).append(character);
        }
        return doubledString.toString();
    }

    public static void main(String[] args) {


        String s = "Hello world!";
        String result = doubleChar(s);
        System.out.println(result);

    }

}

