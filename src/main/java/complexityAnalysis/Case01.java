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
        for (; i < m;i++) {
            sum_1 = sum_1 + i;
        }
        int sum_2 = 0;
        int j = 1;
        for (; j < n;j++) {
            sum_2 = sum_2 + j;
        }
        return sum_1 + sum_2;
    }

    public static int find(int[] array, int n, int x) {
        int i = 0;
        int pos = -1;
        for (; i < n; i++) {
            if (array[i] == x)
                pos = i;
                break;
        }
        return pos;
    }

    public static void insert(int value) {
        int[] array = new int[10];
        int count = 0;

        if (count == array.length) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            array[0] = sum;
            count = 1;
        }
       array[count] = value;
        count++;
    }
    // add函数时间复杂度分析
    public static void add(int element) {
        int[] array = new int[10];
        int len = 10;
        int i = 0;
        // 往数组中添加一个元素
        if (i > len) {// 数组空间不够了
            // 重新申请一个2倍大小的数组空间
            int[] new_array = new int[len * 2];
            // 把原来array数组中的数据依次copy到new_array
            for (int j = 0; j < len; j++) {
                new_array[j] = array[j];
            }
            // new_array复制给array，array现在大小就是2倍len了
            array = new_array;
            len = len * 2;
        }
        array[i] = element;
        i++;
    }

}