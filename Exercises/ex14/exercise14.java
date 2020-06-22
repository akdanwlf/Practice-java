package ex14;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int min = scanner.nextInt();
        for( int i = 0 ; i < size - 1; i++) {
            if (scanner.nextInt() <= min) {
                System.out.println(false);
                min = -1;
                break;
            }
        }
        if (min != -1) {
            System.out.println(true);
        }

        scanner.close();
    }
}