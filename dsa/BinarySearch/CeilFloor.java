package dsa.BinarySearch;

public class CeilFloor {
  public static void main(String[] args) {     //   11,12,13                 
    int [] arr = {-16,-8,-3,12,14,17,18,19,24,32,56,73,89,90};
    System.out.println(celing(arr, 70));
    System.out.println(floor(arr, 70));
  }
  static int celing(int[] arr,int target){int start = 0;int end = arr.length-1 ;
    while (start<=end){
      int mid = start +(end-start)/2 ;
      if(target < arr[mid]){end = mid - 1;}
      else if(target > arr[mid]){start = mid + 1;}
      else{return mid;}
    }
    return arr[start];
  }
  static int floor(int[] arr,int target){int start = 0;int end = arr.length-1 ;
    while (start<=end){
      int mid = start +(end-start)/2 ;
      if(target < arr[mid]){end = mid - 1;}
      else if(target > arr[mid]){start = mid + 1;}
      else{return mid;}
    }
    return arr[end];
  }
}
