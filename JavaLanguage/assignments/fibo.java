package myJavaPractice.JavaLanguage.assignments;
import java.util.Scanner;
public class fibo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First and second num : ");
        int first = in.nextInt();
        int sec = in.nextInt();
        System.out.printf("Here is the first and second numbers are %d and %d \n",first,sec);
        System.out.println("give me the Nth place to calculate the ans ");
        int n = in.nextInt();
        int ans = 0 ;

        for (int i = 1; i < (n); i++) {
            ans = first + sec ;
            first = sec;
            sec = ans;
        }
        System.out.printf("Annwer : %d",ans);
        in.close();
    }
}