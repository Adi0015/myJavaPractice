public class RichestCustomerWealth {

  public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
  }
  static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE ;
        for (int[] account : accounts) {int balance = sum(account) ;if (balance > max){max = balance ;}}
        return max;
  }
  static int sum(int[] account){
        int sum = 0;
        for (int num : account){ sum = sum + num ;}
        return sum;
  }
}
