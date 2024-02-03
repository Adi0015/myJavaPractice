public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
    System.out.println(findNumbers(nums));

  }
  static int findNumbers(int[] nums) {
    int count = 0;
    for(int num : nums) { if (even(num)){count++;}}
    return count;  
  }
  static boolean even(int num){
    int digits = 0;
    while (num>0) { digits++; num=num/10; }
    if (digits%2 ==0){return true;}
    else return false ;
  }
}
