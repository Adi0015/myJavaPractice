package myJavaPractice.JavaLanguage.assignments ;

public class countOccurence {

    public static void main(String[] args) {
        int n = 456968686;
        int count = 0 ;
        while (n>0){
            int rem = n % 10 ;
            n /= 10;
            if(rem == 6 ){
                count ++ ;
            }
        }
        System.out.println(count);
    }
}