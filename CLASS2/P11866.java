import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> result=new LinkedList<>();

        String[] input=br.readLine().split(" ");
        int N=Integer.parseInt(input[0]);
        int K=Integer.parseInt(input[1]);

        for(int i=1;i<=N;i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for(int i=0;i<K-1;i++){
                int pop=queue.remove();
                queue.add(pop);
            }
            result.add(queue.remove());

            /*if(queue.size()>=K){

            }else{
                while(!queue.isEmpty()){
                    for(int i=0;i<K-1;i++){

                    }
                    result.add(queue.remove());
                }
            }*/
        }

        //output format
        StringBuilder sb=new StringBuilder();
        sb.append("<");
        while(result.size()>1){
            sb.append(result.remove()).append(", ");
        }
        sb.append(result.remove()).append(">");

        System.out.println(sb.toString());
    }
}
