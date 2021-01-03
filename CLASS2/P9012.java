import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(T-->0){
            String vps=br.readLine();
            //stack을 위에서 선언하면 stack이 계속 쌓임.
            //인풋을 새로 받을 때 마다 스택을 새로 생성하기
            Stack<Character> stack=new Stack<Character>();

            for(int j=0;j<vps.length();j++){
                if(vps.charAt(j)=='('){
                    if(j==vps.length()-1){
                        sb.append("NO").append('\n');
                    }else {
                        stack.push(vps.charAt(j));
                    }
                }else if(vps.charAt(j)==')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                        if(j==vps.length()-1 && stack.isEmpty()){
                            sb.append("YES").append('\n');
                        }else if(j==vps.length()-1 && !stack.isEmpty()){
                            sb.append("NO").append('\n');
                        }
                    }else {
                        sb.append("NO").append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
