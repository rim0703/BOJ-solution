import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        br.readLine();//여기서 N값의 입력을 받지만 사실상 사용은 하지 않음.

        int result=0;
        for(byte value:br.readLine().getBytes()){
            result+=(value-'0');
        }
        System.out.println(result);
    }
}
