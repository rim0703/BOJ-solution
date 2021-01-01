import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1978 {
    public static int count=0;
    public static void sol(int a){
        if(a==1){
            return;
        }
        else{
            boolean check=true;
            for(int i=2;i<a;i++){
                if(a%i==0){
                    check=false;
                    break;
                }
            }
            if(check==true) count++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        for(int i=0;i<str.length;i++) {
            sol(Integer.parseInt(str[i]));
        }
        System.out.println(count);
    }
}
