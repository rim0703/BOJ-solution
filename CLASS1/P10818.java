import java.util.Arrays;
import java.util.Scanner;

public class P10818 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=sc.nextInt();
        }
        //algorithm
        Arrays.sort(nums);
        System.out.println(nums[0]+" "+nums[N-1]);
    }
}
