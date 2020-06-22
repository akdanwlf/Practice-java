package ex7;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        long m = scanner.nextLong();
        int n = 1;
        
        long fact = 1L;
        
        while (m != 0l && fact <= m) {
            
            fact *= (long) n;
                
            n++;   
        }
        
        System.out.println(n - 1);

        scanner.close();
    }
}