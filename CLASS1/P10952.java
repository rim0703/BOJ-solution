import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str=new StringBuilder();
        StringTokenizer st;
        String nums;

        while((nums=br.readLine())!=null){
            st=new StringTokenizer(nums," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a!=0&&b!=0){
                str.append(a+b).append("\n");
            }else{
                break;
            }
        }
        System.out.print(str);
    }
}
