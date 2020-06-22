package ex18;

import java.util.Scanner;
import java.io.File;

class Main {
    public static void main (final String[] args) {
        final File file = new File("dataset.txt");
        int maxNum = findMaxInFile(file);
        if (maxNum != -1) {
            System.out.print(maxNum);
        }
        

    }

    protected static int findMaxInFile(final File file) {

        int maxNum = 0;
        try {
            final Scanner scanner = new Scanner(file);
            maxNum = 0;
            while (scanner.hasNext()) {
                final int val = scanner.nextInt();
                maxNum = maxNum > val ? maxNum : val;
            }
            scanner.close();
            return maxNum;
        } catch (final Exception e) {
            System.out.println(e.getClass().getSimpleName());
        } 

        return -1;
    }
}