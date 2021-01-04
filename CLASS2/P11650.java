import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] list=new String[N];
        //get input
        for(int i=0;i<N;i++){
            list[i]=br.readLine();
        }
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index1=o1.indexOf(" ");
                int index2=o2.indexOf(" ");
                String substr1=o1.substring(0,index1);
                String substr2=o2.substring(0,index2);
                if(Integer.valueOf(substr1).compareTo(Integer.valueOf(substr2))==0){
                    substr1=o1.substring(index1+1);
                    substr2=o2.substring(index2+1);
                }
                return Integer.valueOf(substr1).compareTo(Integer.valueOf(substr2));
            }
        });
        for(int i=0;i<N;i++){
            System.out.println(list[i]);
        }
    }
}
