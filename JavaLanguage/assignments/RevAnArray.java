package myJavaPractice.JavaLanguage.assignments;

import java.util.Arrays;

public class RevAnArray {
    public static void main(String[] args) {
        int [] ogArray = {1,2,3,4,5};
        int [] revArray = reverseArray(ogArray.clone());

        System.out.println(Arrays.toString(revArray));

        
    }

    static int [] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed [i] = arr[arr.length-1-i];
        }
        return reversed;
    }
}
