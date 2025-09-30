public class Version1 {
    public static String version1(int a, int b, int c) {
        double confidence = 0;
        confidence += a * 10;
        confidence -= b * 20;
        confidence += confidence * (c * 0.05);
        return confidence >= 80 ? "PASS" : "FAIL";
    }
}