package dsa.BinarySearch;

public class nRotatedArray {
      public static void main(String[] args) {
      int [] arr = {7, 9, 11, 12, 5};
      int rotation = peakindex(arr);

      System.out.println("Number of Rotations in Array : "+(rotation+1));
      } 
      static int peakindex(int[] arr ){
          int start  = 0; int end = arr.length-1 ;
          while (start<=end) {
            int mid = start + (end-start)/2 ;
            if(mid < end && arr[mid]>arr[mid +1 ]){return mid ;}
            if(mid > start && arr[mid]<arr[mid -1 ]){return mid -1 ;}
            if(arr[mid]<arr[start]){end = mid -1 ;} //mid == 17 > start == 15
            else{start = mid + 1 ;}
          } 
          return -1 ;

      }           
}
