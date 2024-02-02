package myJavaPractice.JavaLanguage;
import java.util.Scanner;
public class FJP{
    public static void main(String[] args) {
        System.out.print("Hello world");
        // this code helps to print and does not enter in next line
        /*
         * output :
         * Hello world
         */

        System.out.println(" hello, Aditya here");
        //this code also print and enters to next line


        //for inoput  we will use Scanner 
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        // This is the basic syntax for input usinf Scanner
        System.out.println(name);
        // and print the the input that is taken from the system


        // Primitive datatypes
        int roll_no = 18;
        char batch =  'A' ; 
        float cgpa = 8.04f;
        double idk = 12345.67890;
        long largeInt =  123456780956787L;
        String Name = "Aditya Gohil";
        boolean resultPass = true;

        System.out.println(roll_no+batch+cgpa+idk+largeInt+Name+resultPass);
        in.close(); 
    }
}