import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] nums = { 24, 56, 89, 45, 12, 9, 92, -2, -4 };
    System.out.println("Enter the Target num");
    int target = in.nextInt();
    System.out.println(linearSearch3(nums, target));
    in.close();
  }

  // ! Linear Search and returning element
  static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int element : arr) {
        if (element == target){

          System.out.println("got it");
          return element;
        }
      
    }
    return Integer.MAX_VALUE;
  }
  // ! Linear Search for Boolean output
  static boolean linearSearch3(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int element : arr) {
        if (element == target){

          System.out.println("got it");
          return true;
        }
      
    }
    return false;
  }
    //! Linear Search returning index
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (element == target) {
        System.out.println("got it");
        return i;
      }
    }
    return -1;
  }
}
