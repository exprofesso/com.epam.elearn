package branching;

// 2. Найти max{min(a, b), min(c, d)}.
public class Second {
    public static void main(String[] args) {
        System.out.println(max(42,54,245,665));
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}
