import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,Integer> map=new HashMap<>();

        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        for(int i=0;i<N;i++){
            //initialize
            if(map.get(Integer.parseInt(str[i]))==null){
                map.put(Integer.parseInt(str[i]),1);
            }else{
                int value=map.get(Integer.parseInt(str[i]));
                map.put(Integer.parseInt(str[i]),++value);
            }

        }
/*
        for(Integer i:map.keySet()){
            System.out.println("key: "+i+" "+map.get(i));
        }
*/
        int M=Integer.parseInt(br.readLine());
        String [] num=br.readLine().split(" ");
        int[] nums=new int[M];
        for(int i=0;i<M;i++){
            nums[i]=Integer.parseInt(num[i]);
            if(map.get(nums[i])==null){
                sb.append(0+" ");
            }else{
                sb.append(map.get(nums[i])+" ");
            }
        }
        System.out.println(sb);

    }
}
