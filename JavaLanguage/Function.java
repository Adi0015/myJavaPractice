package myJavaPractice.JavaLanguage;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();

        switch (choice){

        case 1 -> sum();
        case 2 -> {int ans = sum1();
                System.out.println(ans);}
        case 3 -> sum2(5, 6);

        }

        in.close();
 
    }

    // this fucntion does not return anything

    static void sum(){
        int num1, num2, sum ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2 ;
        System.out.println("This is fun without returning value \nAnswer: " + sum);
        in.close();
    }
    

    // this function is example for returning the value
    static int sum1(){
        int num1, num2, sum ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2 ;
        System.out.println("this is the fucntion that returns the value \n");
        in.close();
        return sum;
    } 


    //This fucntion returns and has parameters
    static int sum2(int a , int b){
        int sum = a + b ; 
        System.out.printf("this fucntion has parameters \n %d",sum);
        return sum;
    }
}
