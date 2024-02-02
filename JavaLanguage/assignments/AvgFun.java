package myJavaPractice.JavaLanguage.assignments;
import java.util.Scanner;

public class AvgFun{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(Avg(in.nextInt()));
        in.close();
    }

    static double Avg(int n){
        Scanner in = new Scanner(System.in);
        double ans = 0 ;
        for (int i = 0; i < n; i++) {
            ans += in.nextDouble();
        }
        ans /= n;
        in.close();
        return ans;
        
    }
}
