import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int buffer = 0;
        do {
            buffer = scanner.nextInt();
            
            if (input >= 1000) {
                input = input - 1000;
                break; 
            }
            
            input = input + buffer;
            
                        
        } while (buffer != 0);
        
        System.out.println(input);
        
    }
}