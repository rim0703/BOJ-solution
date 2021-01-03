import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();

        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String cmd=br.readLine();
            switch (cmd){
                case "pop":
                    if(cmd.equals("pop")){
                        if(stack.isEmpty()) arr.add(-1);
                        else{
                            arr.add(stack.pop());
                        }
                    }
                    break;
                case "size":
                    arr.add(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()) arr.add(1);
                    else arr.add(0);
                    break;
                case "top":
                    if(!stack.isEmpty()){
                        int top=stack.pop();
                        arr.add(top);
                        stack.push(top);
                    }else {
                        arr.add(-1);
                    }
                    break;
                default:
                    String[] str=cmd.split(" ");
                    stack.push(Integer.parseInt(str[1]));
                    break;
            }
            /*
            if(cmd.substring(0,4).equals("push")){
                String[] str=cmd.split(" ");
                stack.push(Integer.parseInt(str[1]));
            }else{
                if(cmd.equals("pop")){
                   if(stack.isEmpty()) arr.add(-1);
                   else{
                       arr.add(stack.pop());
                   }
                }
            }*/
        }
        for(int value:arr){
            System.out.println(value);
        }
    }
}
