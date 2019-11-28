package queue;
// 用数组实现的队列
public class ArrayQueue {
    private String[] items; // 数组
    private int n = 0; // 数组大小
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队操作，将item放入队尾
    public boolean enqueue (String item) {
        // 如果tail == n 表示队列末尾没有空间了，不一定是满了
        if (tail == n) {
            if (head == 0) return false; // tail == n & head == 0表示整个队列都占满了
            // 数据搬移
            for (int i = head;i < tail;i++) {
                items[i-head] = items[i];
            }
            // 搬完之后更新head和tail
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    // 出队
    public String dequeue() {
        // 如果head == tail表示队列为空
        if (head == tail) return null;
        String tmp = items[head];
        head++;
        return tmp;
    }

}
