package myJavaPractice.dsa.LinearSearch;

public class Main {
  public static void main(String[] args) {
    int[] nums = {24,56,89,45,12,9,92,-2,-4};
    int target = -2 ;
    System.out.println(linearSearch(nums, target));
  }

  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (element == target) {
        System.out.println("got it");
        return i ;
      }
    }
    return -1;
  }
}
