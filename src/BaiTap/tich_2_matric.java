//package BaiTap;
//
//import java.util.Scanner;
//
//class Matrix{
//    int[][] matran;
//
//    Matrix(int n, int m){
//        matran = new int[n][m];
//    }
//
//    public void nextMatrix(Scanner sc){
//        for(int i = 0; i < matran.length; i++){
//            for(int j = 0; j < matran[i].length; j++){
//                matran[i][j] = sc.nextInt();
//            }
//        }
//    }
//
//    public String mul(Matrix other){
//        int[][] result = new int[matran.length][other.matran[0].length];
//        for(int i=0; i<matran.length; i++){
//            for(int j=0; j<other.matran[0].length; j++){
//                for(int k=0; k<matran[0].length; k++){
//                    result[i][j] += matran[i][k] * other.matran[k][j];
//                }
//            }
//        }
//
//        for(int i=0; i<result.length; i++){
//            for(int j=0; j<result[i].length; j++){
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return "";
//    }
//}
//
//public class tich_2_matric {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
//        Matrix a = new Matrix(n, m);
//        a.nextMatrix(sc);
//        Matrix b = new Matrix(m, p);
//        b.nextMatrix(sc);
//        System.out.println(a.mul(b));
//    }
//}
