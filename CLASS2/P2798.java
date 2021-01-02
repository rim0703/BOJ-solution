import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] NM=br.readLine().split(" ");
        int N=Integer.parseInt(NM[0]); // 3<=N<=100
        int M=Integer.parseInt(NM[1]); // 10<=M<=300000
        int[] num=new int[N];
        String[] line=br.readLine().split(" ");
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(line[i]);
        }

        int result=0;

        for(int i=0;i<N-2;i++){
            int num1=num[i];
            for(int j=i+1;j<N-1;j++){
                int num2=num[j];
                for(int k=j+1;k<N;k++){
                    int num3=num[k];
                    int temp=num1+num2+num3;
                    if(temp>result&&temp<=M){
                        result=temp;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
