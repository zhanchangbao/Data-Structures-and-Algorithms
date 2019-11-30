package recursion;

public class Case01 {
    public static int f(int n) {
        if (n == 1) return 1;
        return f(n-1) + 1;
    }

    public static void main(String[] args) {
        int res = f(3);
        System.out.println(res);
    }
}
