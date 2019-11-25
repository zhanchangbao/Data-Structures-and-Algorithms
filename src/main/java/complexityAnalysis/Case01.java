package complexityAnalysis;

public class Case01 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = cal2(10000);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
        System.out.println(sum);
    }

    public  static int cal(int n) {
        int sum = 0;
        int i = 1;
        for (;i <= n;i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int cal2(int n) {
        int sum = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; i++) {
            j = 1;
            for (; j <= n; j++) {
                sum = sum + i * j;
            }
        }
        return sum;
    }

    public static int cal3(int n) {
        int sum_1 = 0;


        return sum_1;
    }
}
