import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var size = scanner.nextInt();
        final var array = IntStream.generate(scanner::nextInt).limit(size).toArray();
        final var target = scanner.nextInt();
        scanner.close();
        final var step = (int) Math.sqrt(size);
        int comparison = 0;

        for (int left = 0, right = 0; left < size;) {
            comparison++;
            if (array[right] >= target) {
                for (int i = right; i > left && array[i] > target; --i) {
                    comparison++;
                }
                break;
            }
            left = right + 1;
            right = Math.min(size - 1, right + step);
        }
        System.out.print(comparison);
    }
}