import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        LinkedList<Integer> deque=new LinkedList<>();
        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String[] cmd=br.readLine().split(" ");
            if(cmd.length==1){
                switch (cmd[0]){
                    case "pop_front":
                        if(deque.isEmpty()) sb.append(-1).append('\n');
                        else sb.append(deque.removeFirst()).append('\n');
                        break;
                    case "pop_back":
                        if(deque.isEmpty()) sb.append(-1).append('\n');
                        else sb.append(deque.removeLast()).append('\n');
                        break;
                    case "size":
                        sb.append(deque.size()).append('\n');
                        break;
                    case "empty":
                        if(deque.isEmpty()) sb.append(1).append('\n');
                        else sb.append(0).append('\n');
                        break;
                    case "front":
                        if(deque.isEmpty()) sb.append(-1).append('\n');
                        else sb.append(deque.getFirst()).append('\n');
                        break;
                    case "back":
                        if(deque.isEmpty()) sb.append(-1).append('\n');
                        else sb.append(deque.getLast()).append('\n');
                        break;
                }
            }else{
                //push_front, push_back
                switch (cmd[0]){
                    case "push_front":
                        deque.addFirst(Integer.parseInt(cmd[1]));
                        break;
                    case "push_back":
                        deque.addLast(Integer.parseInt(cmd[1]));
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}
