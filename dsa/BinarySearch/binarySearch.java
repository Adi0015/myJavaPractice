package dsa.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
      int [] arr = {-16,-8,-3,12,14,17,18,19,24,32,56,73,89,90};
      System.out.println(binarysearch(arr, 73));
      
    }
    static int binarysearch(int[] arr, int target){
            int start = 0 ;
            int end = arr.length -1 ;
            while (start <= end){
              int mid = start + (end-start)/2;
              if (target < arr[mid]){end = mid - 1;}
              else if(target > arr[mid]){start = mid +1 ;}
              else{return mid;}
            }
            return -1 ;
    }
}
