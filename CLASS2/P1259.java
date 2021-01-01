import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str="";
        while(!(str=br.readLine()).equals("0")){
            for(int i=0;i<=str.length()/2;i++){
                // 여기서 i=str.length()/2 로 1자리숫자일 때 도 돌릴 수 있게 해줌
                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    sb.append("no").append("\n");
                    i=str.length();
                }
                else if(i==(str.length()/2)){
                    // i가 숫자열의 중간에 도착함!
                    sb.append("yes").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
