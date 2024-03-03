package Codewars;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

    public static String highAndLow(String numbers) {

        String[] str = numbers.split(" ");

        int min = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i]) < min) {
                min = Integer.parseInt(str[i]);
            }
        }
        int max = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > max) {
                max = Integer.parseInt(str[i]);
            }
        }
        return Integer.valueOf(max) + " " + Integer.valueOf(min);
    }

}

