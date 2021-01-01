import javax.swing.plaf.synth.SynthUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {
    public static int sol(int num){
        Queue<Integer> stack=new LinkedList<>();
        for(int i=1;i<=num;i++){
            stack.add(i);
        }
        for(int i=1;stack.size()>1;i++){
            if(i%2==1){
                //remove the first one
                stack.remove();
            }
            else{
                //remove first one & move first one to the end
                int first=stack.poll();
                stack.add(first);
            }
        }
        return stack.poll();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        System.out.println(sol(num));
    }
}
