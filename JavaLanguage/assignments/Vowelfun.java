package myJavaPractice.JavaLanguage.assignments;
import java.util.Scanner;

public class Vowelfun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sent = in.nextLine();
        int[] counts = countVowelsConsonants(sent.toLowerCase());

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        in.close();
    }

    static int[] countVowelsConsonants(String sent){
        int[] counts =  new int[2];
        int vCount = 0 ;
        int cCount = 0 ;
        for (int i = 0; i < sent.length();i++) {
            char ch = sent.charAt(i);
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel (a, e, i, o, u)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
        }else{
            cCount++;      
        }
        }
        }
        counts[0] = vCount;
        counts[1] = cCount;

        return counts;
    }
}
