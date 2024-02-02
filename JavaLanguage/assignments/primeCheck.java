package myJavaPractice.JavaLanguage.assignments;
import java.util.Scanner;

public class primeCheck {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sqrt = (int)(Math.sqrt(num));
        int ans = 0 ;

        for (int i = 2; i <= sqrt; i++) {
            int rem = num % i ;
            if (rem==0){
                ans += 1;
                break;
            }
        }   
        if (ans == 0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        in.close();
   }
}
