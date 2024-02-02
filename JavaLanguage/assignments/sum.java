package myJavaPractice.JavaLanguage.assignments;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, sum ;

        System.out.println("Enter the 2 numbers:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2 ;
        System.out.println("Answer: " + sum);

        in.close();
        
    }
}
