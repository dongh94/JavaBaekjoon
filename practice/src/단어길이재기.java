import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 단어길이재기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = br.readLine().length();
        System.out.println(i);
    }
}
