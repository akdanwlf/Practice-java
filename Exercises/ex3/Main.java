package ex3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int x1 = Math.abs(scanner.nextInt());
        int y1 = Math.abs(scanner.nextInt());
        int x2 = Math.abs(scanner.nextInt());
        int y2 = Math.abs(scanner.nextInt());
        
        if (x1 == x2 || x1 == y2 || y1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}