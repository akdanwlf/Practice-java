package ex19;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int searchIndexOfLastOccurrence(int[] numbers, int value) {
        // this function returns index of the last occurance of the value provided
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        final int k;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 10;
        }
        scanner.close();
        System.out.println(searchIndexOfLastOccurrence(numbers, k));
        
    }
}
