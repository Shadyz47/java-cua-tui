package BaiTap;

import java.util.Scanner;

class SoPhuc{
    int thuc;
    int ao;

    SoPhuc(){

    }

    SoPhuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc tinhToanCong(SoPhuc other){
        int newThuc = this.thuc + other.thuc;
        int newAo = this.ao + other.ao;
        return new SoPhuc(newThuc, newAo);
    }

    public SoPhuc tinhToanNhan(SoPhuc other){
        int newThuc = this.thuc * other.thuc - this.ao * other.ao;
        int newAo = this.thuc * other.ao + this.ao * other.thuc;
        return new SoPhuc(newThuc, newAo);
    }

    public void result(){
        System.out.print(thuc + (ao < 0 ? " - " : " + ") + Math.abs((long) ao) + "i");
    }
}

public class so_phuc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc tong = A.tinhToanCong(B);
            SoPhuc C = tong.tinhToanNhan(A);
            SoPhuc D = tong.tinhToanNhan(tong);

            C.result();
            System.out.print(", ");
            D.result();
            System.out.println();
        }
    }
}
