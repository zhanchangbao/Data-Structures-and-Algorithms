package sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(int[] a, int n) {// a表示数组，n表示数组大小
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false; // 提前退出冒泡循环的标志位，当某次冒泡操作已经没有数据交换时，说明已经达到完全有序，不用再继续执行后续的冒泡操作。
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {// 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;// 表示数据交换
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }

    }
}