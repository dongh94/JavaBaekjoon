import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 후보추천하기_1713 {
    static int N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        int[] day = new int[K + 1];
        for (int i = 0; i <= K; i++) {
            day[i] = Integer.MAX_VALUE;
        }

        int[] count = new int[K + 1];
        int maxcount = 0;
        int d = 1;
        HashSet<Integer> hashSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(st.nextToken());
            count[n]++;
            if (maxcount < N && !hashSet.contains(n)) {
                maxcount++;
                day[n] = d;
                hashSet.add(n);
            } else if (maxcount == N && !hashSet.contains(n)) {
                int remove = 0;
                int min_n = Integer.MAX_VALUE;
                int min_d = Integer.MAX_VALUE;

                for (Integer j : hashSet) {
                    if (count[j] < min_n) {
                        min_n = count[j];
                        min_d = day[j];
                        remove = j;
                    } else if (count[j] == min_n) {
                        if (day[j] < min_d) {
                            min_d = day[j];
                            remove = j;
                        }
                    }
                }
                hashSet.remove(remove);
                count[remove] = 0;
                day[remove] = Integer.MAX_VALUE;

                hashSet.add(n);
                day[n] = d;
            }

        d++;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(hashSet);
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            sb.append(integer + " ");
        }

        System.out.println(sb);
    }
}
