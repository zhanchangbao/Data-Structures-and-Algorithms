package recursion;

public class Case02 {
    // 全局变量，表示递归的深度
    private int depth = 0;
    public static int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n-1) + f(n -2);
    }

    public int f2(int n) {
        depth++;
        if (depth > 1000) throw new IllegalArgumentException("asd");
        if (n == 1) return 1;
        return f(n) + 1;
    }

    public static void main(String[] args) {
        int res = f(10);
        System.out.println(res);
    }

    public int f3(int n) {
        int ret = 1;
        for (int i = 2;i <= n;i++) {
            ret = ret + 1;
        }
        return ret;
    }

    public int f4(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int ret = 0;
        int pre = 2;
        int prepare = 1;
        for (int i = 3; i <= n; i++) {
            ret = pre + prepare;
            prepare = pre;
            pre = ret;
        }
        return ret;
    }

//    public long findRootReferrerId(long actorDId) {
//        Long referrerId = "select referrer_id from [tale] where actor_id = actorDId";
//        if (referrerId == null) return referrerId;
//        return findRootReferrerId(referrerId);
//    }
}
