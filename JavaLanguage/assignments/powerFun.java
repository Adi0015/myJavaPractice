package myJavaPractice.JavaLanguage.assignments;

import java.util.Scanner;

public class powerFun {
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int b = in.nextInt();
            int p = in.nextInt();

            System.out.println(power(b,p));

            in.close();
        }

        static int power(int b,int p){
            int ans = 1 ;
            for (int i = 1; i <= p; i++) {
                ans = ans * b ; 
            }

            return ans;
        }
}
