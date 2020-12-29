import java.util.Scanner;

public class P2920 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] scale=new int[8];
        for(int i=0;i<scale.length;i++){
            scale[i]=sc.nextInt();
        }

        //algorithm
        int check_pos=0;
        boolean ascending=false;
        boolean descending=false;
        boolean mixed=false;

        for(int i=0;i<scale.length;i++){
            if(check_pos+1==scale[i] && descending==false){
                ascending=true;
                descending=false;
                mixed=false;
                check_pos=scale[i];
            }
            else if(8-check_pos==scale[i] && ascending==false){
                ascending=false;
                descending=true;
                mixed=false;
                check_pos++;
            }
            else{
                ascending=false;
                descending=false;
                mixed=true;
                i=scale.length;
            }
        }

        if(ascending) System.out.println("ascending");
        if(descending) System.out.println("descending");
        if(mixed) System.out.println("mixed");
    }
}