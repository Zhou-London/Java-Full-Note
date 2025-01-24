//Written by Zhouzhou Zhang Jan 14

package week1.LabSheet1;

public class Q1_7 {
    public static void main(String[] args) {
        Q1_7 q = new Q1_7();
        System.out.println(q.toBase(-100,2));

    }

    public String toBase(int n, int b){

        boolean isNegative = false;
        if(n == 0){
            return "0";
        }else if(n < 0){
            n = Math.abs(n);
            isNegative = true;
        }

        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rm = n%b;
            if(rm < 10){
                char c = (char)(rm+'0');
                sb.append(c);
            } else {
                char c_ = (char)(rm+'A');
                sb.append(c_);
            }
            n=n/b;
        }

        if(isNegative){
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}
