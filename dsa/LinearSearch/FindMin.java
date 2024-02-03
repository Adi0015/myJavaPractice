public class FindMin {
  public static void main(String[] args) {
    int[] nums = {18,12,-5,0,8,-2};
    System.out.println(min(nums)); 
  }
  static  int min(int[] arr) {
    int mini = arr[0];
    for (int element : arr){
      if (element < mini){
        mini  = element;
      }
    }
    return mini ;
    }
}
