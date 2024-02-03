
public class MaxIn2DArray {


public static void main(String[] args) {
      int [][] num  ={
               {2,3,4},
               {56,78,90},
               {11,22,33},
               {145,-56}
      };
      // int target = 90;
      System.out.println(max(num));
      System.out.println(max2(num));

}
static int max(int[][] arr ){
            int max = Integer.MIN_VALUE; 
            for (int[] i : arr){
              for(int j : i ){
                if (j > max){
                  max = j;
                }
              }
            } 
            return max;
}
static int max2(int[][] arr ){
            int max = Integer.MIN_VALUE;
            for(int row = 0;row < arr.length ; row++){
              for(int col =0; col <arr[row].length;col++){
                if (arr[row][col] > max){
                  max = arr[row][col];
                }
              }
            }
            return max;
}
} 

