import java.util.Scanner;

public class P2675 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] times=new int[T];
        String[] str=new String[T];
        for(int i=0;i<T;i++){
            times[i]=sc.nextInt();
            str[i]=sc.next();
        }

        //algorithm
        for(int i=0;i<T;i++){
            for(int j=0;j<str[i].length();j++){
                for(int k=0;k<times[i];k++){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
