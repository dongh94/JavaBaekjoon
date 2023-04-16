import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CharAndString {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i-1));
        System.out.println(S.substring(i-1, i));
    }
}
