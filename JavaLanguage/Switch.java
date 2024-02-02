package myJavaPractice.JavaLanguage;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch(fruit){
            case "Mango" -> System.out.println("King for Fruits");
            case "Orange" -> System.out.println("Round Fruit");
            case "Apple" -> System.out.println("A sweet Red Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("plz enter the vaild fruit");

        }

        

        in.close();
    }
}