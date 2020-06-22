package ex11;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int max = 0, index = 0, buffer = 0;
        for (int i = 0; i < size; i++) {

            buffer = scanner.nextInt();
            if (buffer > max) {
                max = buffer;
                index = i;
            }
        }

        System.out.println(index);
        scanner.close();
    }
}