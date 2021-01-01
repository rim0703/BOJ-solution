import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1018 {
    public static boolean[][] arr;
    public static int min=64;

    public static void sol(int x,int y){
        int end_x=x+8;
        int end_y=y+8;
        int count=0;

        boolean first=arr[x][y];
        for(int i=x;i<end_x;i++){
            for(int j=y;j<end_y;j++){
                if(arr[i][j]!=first) count++;
                first=(!first);
            }
            first=(!first);
        }
        count=Math.min(count,64-count);
        min=Math.min(min,count);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] NM=(br.readLine().split(" "));
        int N=Integer.parseInt(NM[0]);
        int M=Integer.parseInt(NM[1]);
        arr=new boolean[N][M];

        //get input of the board
        for(int i=0;i<N;i++){
            String str=br.readLine();
            for(int j=0;j<M;j++){
                if(str.charAt(j)=='W'){
                    arr[i][j]=true;
                }else{
                    arr[i][j]=false;
                }
            }
        }

        //size:8*8 square
        int N_row=N-7;
        int M_col=M-7;
        for(int i=0;i<N_row;i++){
            for(int j=0;j<M_col;j++){
                sol(i,j);
            }
        }
        System.out.println(min);
    }
}
