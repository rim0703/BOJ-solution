import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        LinkedList<Integer> queue=new LinkedList<>();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String cmd=br.readLine();
            switch (cmd){
                case "pop":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else{
                        int pop=queue.removeFirst();
                        sb.append(pop).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.getFirst()).append('\n');
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.getLast()).append('\n');
                    break;
                default:
                    String[] str=cmd.split(" ");
                    queue.add(Integer.parseInt(str[1]));
            }
        }
        System.out.println(sb);
    }
}
