import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        int min = input;
        intmax = input;
        
        while (true) {
            
            if (input == 0) {
                System.out.println(true);
                break;
            } // it has to be at the start to check if there is zero in the second input
            
            input = scanner.nextInt();

            if (max == input || min == input){
                continue;
            } // skip checks for same value input
            
            if (max < input) {
                max = 0;
            } // test for decreasing sequence
            
            if ( min > input) {
                min = 0;
            } //test for increasing sequence
            
            if (max ==0 && min ==0) {
                System.out.println(false);
                break;
            } //breaks if it flips from a inc or dec sequence to the other
            
            
            if (max != 0) {
                max = input;
            } else if (min != 0) {
                min = input;
            } // assign value to min or max based on the seq
            
        }
        
        
    }
}
