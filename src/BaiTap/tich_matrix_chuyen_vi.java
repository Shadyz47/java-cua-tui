package BaiTap;

import java.util.Scanner;

public class tich_matrix_chuyen_vi {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int u=1;u<=t;u++){
            int n =  sc.nextInt();
            int m =   sc.nextInt();
            int[][] a =  new int[n][m];
            int[][] b =   new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    b[j][i] = a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Test " + u + ": ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int x = 0;
                   for(int k=0;k<m;k++){
                       x += a[i][k] * b[k][j];
                   }
                    System.out.printf("%d ",x);
                }
                System.out.println();
            }


        }
    }
}
