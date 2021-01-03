import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String[] str=new String[N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //앞쪽 숫자는 2개가 아닐 수 도 있으니 위치확인하기!
                int index1=o1.indexOf(" ");
                int index2=o2.indexOf(" ");

                String substr1=o1.substring(0,index1);
                String substr2=o2.substring(0,index2);
                return Integer.valueOf(substr1).compareTo(Integer.valueOf(substr2));
            }
        });
        for(int i=0;i<N;i++){
            System.out.println(str[i]);
        }
    }
}
