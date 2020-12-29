import java.util.Scanner;

public class P10950 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] A=new int[T];
        int[] B=new int[T];
        int[] result=new int[T];
        for(int i=0;i<T;i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
            result[i]=A[i]+B[i];
        }
        for(int i=0;i<T;i++){
            System.out.println(result[i]);
        }
    }
}
