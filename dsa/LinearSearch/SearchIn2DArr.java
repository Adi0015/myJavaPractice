import java.util.Arrays;

public class SearchIn2DArr {
public static void main(String[] args) {
      int [][] num  ={
               {2,3,4},
               {56,78,90},
               {11,22,33}
      };
      int target = 90;
      System.out.println(Arrays.toString(search2(num,target)));

}
static int search(int[][] arr , int target){
            for (int[] i : arr){
              // System.err.print(i);
              for(int j : i ){
                if (j == target){
                  System.err.println(j);
                  return j;
                }
              }
            } 
            return -1;
}
static int[] search2(int[][] arr , int target){
            for(int row = 0;row < arr.length ; row++){
              for(int col =0; col <arr[row].length;col++){
                if (arr[row][col] == target){
                  return new int[]{row,col};
                }
              }
            }
            return new int[]{-1,-1};
}
} 
