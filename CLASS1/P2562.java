import java.util.Scanner;

public class P2562 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[9];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        //algorithm
        int max=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                pos=i+1;
            }
        }
        System.out.println(max+"\n"+pos);
    }
}
