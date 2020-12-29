import java.util.Scanner;

public class P8958 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase_num=sc.nextInt();
        String[] input=new String[testcase_num];

        for(int i=0;i<testcase_num;i++){
            input[i]=sc.next();
        }

        //calculate the score
        for(int i=0;i<testcase_num;i++){
            int result=0;
            int score=0;
            for(int j=0;j<input[i].length();j++){
                if(input[i].charAt(j)=='O'){
                    score++;
                    result+=score;
                    //score++;
                }
                else if(input[i].charAt(j)=='X'){
                    score=0;
                }
            }
            System.out.println(result);
        }
    }
}
