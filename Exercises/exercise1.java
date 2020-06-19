import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long input1 = scanner.nextLong();
        long input2 = scanner.nextLong();
        
        long sum = 1L;
        while (true) {
            if (input1 == input2) {
                System.out.println(sum);
                break;
            } else {
                sum *= input1++; 
            }
        }
    }
}
