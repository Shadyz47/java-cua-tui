package BaiTap;

import java.util.*;

public class day_con_co_tong_nguyen_to {

    static int n;
    static int[] x = new int[1005];
    static int[] a = new int[1005];

    static List<List<Integer>> list = new ArrayList<>();

    public static boolean checkSum(long sum) {

        if (sum < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void ql(int i, int bd, long sum) {

        for (int j = bd; j <= n; j++) {

            x[i] = j;

            long newSum = sum + a[j];

            // Nếu tổng là số nguyên tố
            if (checkSum(newSum)) {

                List<Integer> tmp = new ArrayList<>();

                for (int u = 1; u <= i; u++) {
                    tmp.add(a[x[u]]);
                }

                list.add(tmp);
            }

            // Chọn tiếp phần tử phía sau
            ql(i + 1, j + 1, newSum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a,1,n+1);

            list.clear();

            ql(1, 1, 0);

            List<List<Integer>> list2 = new ArrayList<>();
            list2.clear();
            for (int  i = 0; i < list.size(); i++) {
                List<Integer> tmp2 = new ArrayList<>();
                for (int j = list.get(i).size() - 1; j >= 0; j--) {
                    tmp2.add(list.get(i).get(j));
                }
                list2.add(tmp2);
            }

            list2.sort((u, v) -> {
                for (int i = 0; i < Math.min(u.size(), v.size()); i++) {
                    if (!u.get(i).equals(v.get(i))) {
                        return u.get(i) - v.get(i);
                    }
                }

                return u.size() - v.size();
            });

            for (List<Integer> tmp : list2) {

                for (int value : tmp) {
                    System.out.print(value + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}