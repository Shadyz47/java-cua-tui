package BaiTap;

import java.util.Scanner;
import java.util.TreeSet;

class IntSet{
    private final TreeSet<Integer> res = new TreeSet<>();

    IntSet(int[] a){
        for(int value : a){
            res.add(value);
        }
    }

    public IntSet union(IntSet s){
        IntSet result = new IntSet(new int[0]);
        result.res.addAll(this.res);
        result.res.addAll(s.res);
        return result;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int value : res){
            if(result.length() > 0){
                result.append(" ");
            }
            result.append(value);
        }
        return result.toString();
    }
}

public class intset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<m;i++) b[i] = sc.nextInt();

        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
