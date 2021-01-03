import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        while(T-->0){
            //H: set[0] 호텔의 층수
            //W: set[1] 각 층의 방 수
            //N: set[2] 몇 번째 손님
            String[] set=br.readLine().split(" ");
            int H=Integer.parseInt(set[0]);
            int N=Integer.parseInt(set[2]);

            int floor=N%H;
            int room=N/H+1;
            if(floor==0){
                room--;
                floor=H;
            }
            sb.append(floor).append(String.format("%02d",room)).append('\n');
        }
        System.out.println(sb);
    }

}
