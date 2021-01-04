import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11050 {
    public static int sol(int a, int b){

        int N = 1,M = 1;
        for(int i=0;i<b;i++){
            N=N*(a-i);
            M=M*(i+1);
        }

        return N/M;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] num=br.readLine().split(" ");
        int N=Integer.parseInt(num[0]);
        int M=Integer.parseInt(num[1]);
        System.out.println(sol(N,M));
    }
}
