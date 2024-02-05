package dsa.BinarySearch;



public class infiniteArr {
      public static void main(String[] args) {
        int [] nums = {-16,-8,-3,12,14,17,18,19,24,32,56,73,89,90,91,92,93,94,95,96,97,98,99};
      System.out.println(infiniteArr(nums,91));  
      }
      static int binarySearch(int[]arr , int target, int start,int end){
        while(start <= end){
            int mid =  start + (end- start)/2 ;
            if(target<arr[mid]){end = mid -1;}
            else if(target>arr[mid]){start = mid+1;}
            else{return mid;}
        }
        return -1;
    }
   
    static int infiniteArr(int[] arr , int target){
        int start = 0 ;
        int chunck = 5 ;
        while (target >= arr[start]){
            int end = start + chunck ;
            int ans = binarySearch(arr,target,start,end);
            if (ans == -1) {
                start = end +1 ;
            }
            else{return ans;}
        }
        return -1;
        }
}
