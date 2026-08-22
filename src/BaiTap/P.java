package BaiTap;

import java.util.Scanner;



public class P {
    private static void viet(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static boolean nguyento(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = null;
        int n;
        boolean flag = false;
        System.out.println("1 Nhap \n 2 Xuat \n 3 Tinh tong \n 4 Nguyen to \n 0 Exit");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    n = sc.nextInt();
                    a = new int[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    flag = true;
                    break;
                case 2:
                    if (flag) {
                        viet(a);
                    } else {
                        System.out.println("Chon 1");
                    }
                    break;
                case 3:
                    if (flag) {
                        int sum = 0;
                        for (int i = 0; i < a.length; i++) {
                            sum += a[i];
                        }
                        System.out.println("Tong: " + sum);
                    } else {
                        System.out.println("Chon 1");
                    }
                    break;
                case 4:
                    if (flag) {
                        for (int i = 0; i < a.length; i++) {
                            if (nguyento(a[i])) {
                                System.out.print(a[i] + " ");
                            }
                        }
                    } else {
                        System.out.println("Chon 1");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}
