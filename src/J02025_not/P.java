package J02025_not;

public class P {
    static int n;
    static int[] x = new int[1005];
    static int[] a = new int[1005];

    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return n>1;
    }

    public static void ql(int i, int bd, int sum){
        for(int j = bd; j <= n; j++){
            x[i] = j;

            long newSum = sum + a[j];
        }
    }

    public static void main(String[] args) {

    }
}
