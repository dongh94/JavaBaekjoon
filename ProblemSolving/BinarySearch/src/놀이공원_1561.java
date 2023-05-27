import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 놀이공원_1561 {
    /* 입력
    22 5
    1 2 3 4 5
    * */
    // N명의 아이들, M개의 놀이기구 => 각 idx 번호 (오른), 각 값이 시간
    // 총시간에 mid를 갱신하면서 N명이 놀이기구를 타는 시간을 찾아낸다. 각 놀이기구에 시간으로 check
    // 순서 중요하고 (오름), 나눈 값과 나머지 값으로 딱 떨어지는 값을 찾아가며 해결할 수 있다.
    static int binarySearch() {
        if (N <= M) {
            return N;
        }

        int idx = 0;
        long s = 0;
        long e = (long) N * arr[0]; // 최대시간
        long time = 0; // 딱 맞는 시간

        while (s <= e) {
            long mid = (s + e) / 2;
            long cnt = M;
            for (int i = 0; i < M; i++) {
                cnt += mid / arr[i];
            }
            if (cnt >= N) {
                time = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        int m = M;
        for (int i = 0; i < M; i++) {
            m += (time - 1) / arr[i];
        }

        for (int i = 0; i < M; i++) {
            if (time % arr[i] == 0) {
                m += 1;
                if (m == N) {
                    idx = i + 1;
                    break;
                }

            }
        }
        return idx;
    }
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(binarySearch());
    }
}
