package myJavaPractice.JavaLanguage;

import java.util.Scanner;

public class nestedSwtich {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dep = in.next();
         
        switch (empId) {
            case 1 -> System.out.println("Aditya gohil");
            case 2 -> System.out.println("Ishan shah");
            case 3 -> {
                    System.out.println("yash");
                    switch (dep) {
                        case "IT" -> System.out.println(" IT deparment ");

                    }
            }
        }


        in.close();

    }
}