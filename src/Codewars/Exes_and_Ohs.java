package Codewars;

public class Exes_and_Ohs {
    public static void main(String[] args) {
        System.out.println(getXO("ooxXm"));
    }
    public static boolean getXO (String s) {
        String str = s.toLowerCase();
        int p = 0;
        int c = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'o'){
    p++;
            }
            if(str.charAt(i) == 'x'){
                c++;
            }
        }
        return p == c;
    }

    }
