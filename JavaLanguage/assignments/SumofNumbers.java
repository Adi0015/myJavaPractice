package myJavaPractice.JavaLanguage.assignments;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0 ;

        for (int i = 1; i <= n; i++) {
            ans += i ;
        }
        in.close();
        System.out.println(ans);
    }

}
