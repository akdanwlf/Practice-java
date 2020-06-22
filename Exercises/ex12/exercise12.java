package ex12;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String[] arrShifted = new String[arr.length];
        int shift = scanner.nextInt() % arr.length;

        for (int i = 0; i < arr.length; i++) {
            arrShifted[(i + shift) % arr.length] = arr[i];
        }

        for (String item: arrShifted) {
            System.out.print(item + " ");
        }

        scanner.close();
    }
}