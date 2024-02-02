package myJavaPractice.JavaLanguage;

public class loops {
    public static void main(String[] args) {
        
        /*
         * Syntax for IF statement
         * 
         * if (boolean expressionn T or F){
         * //body
         * } else {
         * // do this
         * }
         * 
         */
        float salary = 25_000f;
        if (salary > 24000) {
            salary = salary + (salary * 0.10f);
            System.out.println("Salary " + (int) (salary));
        } else {
            salary = salary + (salary * 0.20f);
            System.out.println("Salary " + (int) (salary));
        }

        /*
         * for (intialisation ; condition ; increment/decrement){
         * //body
         * }
         */



        for (int num = 0; num < 5; num++) {
            System.out.println("for loop\n");
        }
        /*
         * While loop
         * while(condition){
         * //body
         * }
         */
        int j = 0 ;
        while(j==0){
            System.out.println("While loop\n");
            j++;
        }


        /* doWhile loop
         * do {
         *  //body
         * }while() 
         */  
        int n = 1;
        do {
            System.out.println("\nthis is do while loop try");
            n++;
        } while(n<5);


    }

}