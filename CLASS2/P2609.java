import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2609 {
    //최대공약수
    public static int GCD(int a,int b){
        if(a>b){
            if(a%b==0) return b;
            else return GCD(b,a%b);
        }else{
            if(b%a==0) return a;
            else return GCD(a,b%a);
        }
    }
    //최소공배수
    public static int LCM(int a,int b){
        return a*b/GCD(a,b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] num=br.readLine().split(" ");
        int a=Integer.parseInt(num[0]);
        int b=Integer.parseInt(num[1]);
        System.out.println(GCD(a,b)+"\n"+LCM(a,b));
    }
}
