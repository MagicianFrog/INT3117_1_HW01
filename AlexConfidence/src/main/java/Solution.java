import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < 0) || (a > 20) || (b < 0) || (b > 6) || (c < 0) || (c > 4)) {
            System.out.println("INVALID");
            return;
        }

        double confidence = 0;
        for (int i = 1; i <= a; i++) {
            if (i <= 6) {
                confidence += 8;
            } else if (i <= 13) {
                confidence += (8 + 2);
            } else {
                confidence += (8 + 6);
            }
        }

        confidence -= b * 20;

        if (c >= 2) {
            confidence += confidence * 0.15;
        }

        if (confidence >= 80) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
