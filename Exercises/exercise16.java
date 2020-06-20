import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parameterA = scanner.nextInt();
        int parameterB = scanner.nextInt();
        int parameterC = scanner.nextInt();
        int parameterN = scanner.nextInt();

        randomPasswordGenerator(parameterA, parameterB, parameterC, parameterN);

    }

    static void randomPasswordGenerator(int capitalLetters, int smallLetters, int digits, int totalLength) {
        for (int i = 0; i < totalLength; i++) {
            if (capitalLetters > 0) {
                if (capitalLetters % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("Y");
                }
                capitalLetters--;
            } else if (smallLetters > 0) {
                if (smallLetters % 2 == 0) {
                    System.out.print("m");
                } else {
                    System.out.print("a");
                }
                smallLetters--;
            } else if (digits > 0) {
                if (digits % 2 == 0) {
                    System.out.print("7");
                } else {
                    System.out.print("3");
                }
                digits--;
            } else if (smallLetters == 0 & digits == 0) {
                if (i % 2 == 0) {
                    System.out.print("M");
                } else {
                    System.out.print("t");
                }
            }
        }
    }
}
