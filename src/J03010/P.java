package J03010;

import java.util.*;

public class P {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> map = new HashMap();
        while(t-->0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] tmp =  s.split("\\s+");
            StringBuilder sb = new StringBuilder();

            sb.append(tmp[tmp.length-1]);
            for(int i =0 ;i<tmp.length-1;i++){
                sb.append(tmp[i].charAt(0));
            }

            String email = sb.toString();
            int cnt = map.getOrDefault(email,0)+1;
            map.put(email, cnt);

            if(cnt > 1){
                sb.append(cnt);
            }

            sb.append("@ptit.edu.vn");
            System.out.println(sb.toString());
        }
    }
}
