import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<N;i++){
            num.add(Integer.parseInt(br.readLine()));
        }
        //Arrays.sort(num);  --> 평균 시간복잡도: O(nlogn) 최악시간:O(n^2)
        //여기서 sort 시간초과 ㅠㅠ
        Collections.sort(num);
        for(int value:num){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
