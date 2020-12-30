import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String num=br.readLine();
        String[] nums_N=num.split(" ");
        int[] number_N=new int[N];
        for(int i=0;i<N;i++){
            number_N[i]=Integer.parseInt(nums_N[i]);
        }

        int M=Integer.parseInt(br.readLine());
        num=br.readLine();
        String[] nums_M=num.split(" ");
        int[] number_M=new int[M];
        for(int i=0;i<M;i++){
            number_M[i]=Integer.parseInt(nums_M[i]);
        }


        Arrays.sort(number_N);


        for(int i=0;i<M;i++){
            //System.out.println("N "+nums_N[i]+"M "+nums_M[i]);
            if(Arrays.binarySearch(number_N,number_M[i])<0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }

        }
    }
}
