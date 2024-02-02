package myJavaPractice.JavaLanguage.assignments;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n - 1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < i*2; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
        in.close();
    }
}
