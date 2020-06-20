import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        int size = input.length();
        
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) == 't' && 
                i + 1 < size && input.charAt(i + 1) == 'h' && 
                i + 2 < size && input.charAt(i + 2) == 'e') {
                
                System.out.println(i);
                return;
            
            }
        }
        
        System.out.println(-1);
    }
}