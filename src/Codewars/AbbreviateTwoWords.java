package Codewars;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feenan"));
        System.out.println(abbrevName("Patrick peenan"));
    }
    public static String abbrevName(String name) {
        String name1 = name.toUpperCase();
        String[] words = name1.split(" ");
        return words[0].charAt(0) + "." + words[1].charAt(0);

    }
}
