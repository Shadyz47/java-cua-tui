package J07008;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P {
    static int n;
    static int[] a;
    static int[] x;
    static String res;
    static List<String> list = new ArrayList<>();

    public static void ql(int i, int bd){
        for(int j=bd;j<=n;j++){
            if(a[j] > a[x[i-1]]){
                x[i] = j;
                if(i >= 2){
                    res = "";
                    for(int u = 1;u<=i;u++){
                        res += a[x[u]] + " ";
                    }
                    list.add(res);
                }
                ql(i+1,j+1);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("DAYSO.in");
        try (Scanner sc = new Scanner(file)) {
            n = sc.nextInt();
            a = new int[n + 1];
            x = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            ql(1,1);
            list.sort(String::compareTo);
            list.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
