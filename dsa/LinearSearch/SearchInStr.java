package myJavaPractice.dsa.LinearSearch;
import java.util.Arrays;
import java.util.Scanner;

public class SearchInStr {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the word: ");
        String word = in.nextLine();
        System.out.println(Arrays.toString(word.toCharArray()));
        System.out.println("Enter the target");
        char target = in.nextLine().charAt(0) ;
        System.out.println(search2(word, target));
      }

      static boolean search(String str, char target){
          if (str.length() == 0){
            return false ;
          }
          for (int index =0;index < str.length();index ++){
            if (target == str.charAt(index)){
              return true;
            }
          }
          return false ;
      }
      static boolean search2(String str, char target){
          if (str.length() == 0){
            return false ;
          }
          for (char ch :str.toCharArray()){
            if (ch == target){
              return true;
            }
          }
          return false ;
      }
}
