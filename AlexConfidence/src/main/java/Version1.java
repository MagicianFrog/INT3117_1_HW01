public class Version1 {
    public static String version1(int a, int b, int c) {
        double confidence = 0;
        for (int i = 1; i <= a; i++) {
            if (i <= 6) {
                confidence += 8;
            } else if (i <= 13) {
                confidence += 8 + 2;
            } else {
                confidence += 8 + 6;
            }
        }
        confidence -= b * 20;
        if (c >= 2) {
            confidence += confidence * 0.15;
        }
        return confidence >= 80 ? "PASS" : "FAIL";
    }
}
