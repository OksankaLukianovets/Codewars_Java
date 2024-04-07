package Codewars;

public class Plural {
    public static boolean isPlural(float f) {
//        Version 1
//        return (f != 1 );
        //Version 2
        if (f == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPlural(0f)); // true
        System.out.println(isPlural(0.5f)); // true
        System.out.println(isPlural(1f)); //false
        System.out.println(isPlural(100f)); //true
    }

}


