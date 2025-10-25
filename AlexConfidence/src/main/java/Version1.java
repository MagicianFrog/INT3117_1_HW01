public class Version1 {
    public static String sol(int a, int b, int c) {
        double con = 0;
        for (int i = 1; i <= a; i++) {
            if (i <= 6) {
                con += 8;
            } else if (i <= 13) {
                con += 8 + 2;
            } else {
                con += 8 + 6;
            }
        }
        con -= b * 20;
        if (c >= 2) {
            con += con * 0.15;
        }
        return con >= 80 ? "PASS" : "FAIL";
    }
}
