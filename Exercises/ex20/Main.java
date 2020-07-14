import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        int jump = (int) Math.sqrt(n);

        for (int i = 0; i < n; i++) {
            int checks = 0;
            if (i % jump == 0) {
                checks = i / jump + 1;
            } else
                checks = 2 + (i / jump) + Math.min(((i / jump) + 1) * jump, n - 1) - i;

            System.out.print(checks + " ");
        }
    }
}