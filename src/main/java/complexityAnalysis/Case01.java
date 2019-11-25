package complexityAnalysis;

public class Case01 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = cal2(10000);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
        System.out.println(sum);
    }

    /**
     * 时间复杂度分析
     * @param n
     * @return
     */
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

    /**
     * 时间复杂度加法法则
     * @param n
     * @return
     */
    public static int cal3(int n) {
        int sum_1 = 0;
        int p = 1;
        for (; p < 100; p++) {
            sum_1 = sum_1 + p;
        }

        int sum_2 = 0;
        int q = 1;
        for (; q < n; q++) {
            sum_2 = sum_2 + q;
        }

        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; i++) {
            j = 1;
            for (; j <= n; j++) {
                sum_3 = sum_3 + i * j;
            }
        }

        return sum_1 + sum_2 + sum_3;
    }

    /**
     * 时间复杂度乘法法则
     * @param n
     * @return
     */
    public static int cal4(int n) {
        int ret = 0;
        int i = 1;
        for (; i < n; i++) {
            ret = ret + f(i);
        }
        return ret;
    }

    public static int f(int n) {
        int sum = 0;
        int i = 1;
        for (; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * 对数复杂度
     * @param n
     */
    public static void cal5(int n) {
        int i = 1;
        while (i <= n) {
            i = i * 2;
        }
    }

    public static int cal6(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        for (; i < m;i++)
    }

}

//    int cal(int m, int n) {
//        int sum_1 = 0;
//        int i = 1;
//        for (; i < m; ++i) {
//            sum_1 = sum_1 + i;
//        }
//        int sum_2 = 0;
//        int j = 1;
//        for (; j < n; ++j) {
//            sum_2 = sum_2 + j;
//        }
//        return sum_1 + sum_2;
//    }