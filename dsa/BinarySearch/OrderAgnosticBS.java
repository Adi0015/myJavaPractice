package dsa.BinarySearch;
public class OrderAgnosticBS {

  public static void main(String[] args) {
      int[] arr1 ={90,89,56,46,38,20,19,17,1,-7-11,-28};
      int[] arr2 ={-20,-13,-11,-5,3,7,13,24,32,38,41,59};
      int target = 38;
      System.out.println("Increasing order Binary search : "+binarySearch(arr2, target));
      System.out.println("Decreasing order Bianry search : "+binarySearch(arr1, target));
  }
  static String checkorder(int[] arr){
      if (arr[0] < arr[1]){return "inc";}
      else{return "dec";} 
  }
  static int binarySearch(int[] arr,int target){int start = 0;int end = arr.length -1;
      if (checkorder(arr)=="inc"){int result = incBinarySearch(arr,start,end,target);return result;}
      else{int result = decBinarySearch(arr,start,end,target);return result;}
  }
  static int incBinarySearch(int[] arr,int start,int end, int target){
    while (start<=end){
      int mid  = start +(end-start)/2 ;
      if (target < arr[mid]){end = mid -1;}
      else if(target > arr[mid]){start = mid +1;}
      else{return mid ;}
    }
    return -1 ;
  }
  static int decBinarySearch(int[] arr,int start,int end, int target){
    while (start<=end){
      int mid  = start + (end-start)/2 ;
      if (target < arr[mid]){start = mid + 1;}
      else if(target > arr[mid]){end = mid - 1;}
      else{return mid ;}
    }
    return -1 ;
  }
}
