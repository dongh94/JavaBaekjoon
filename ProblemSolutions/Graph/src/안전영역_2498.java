import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 안전영역_2498 {

    static int N;
    static int[][] arr;
    static int answer;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int max_i;
    static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new int[N][N];
        StringTokenizer st;
        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(arr));

        answer = 0;
        max_i = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                max_i = Math.max(max_i, arr[r][c]);
            }
        }
//        System.out.println("max_i = " + max_i);

        for (int i = 0; i < max_i; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(visited[j], 0);
            }
            int cnt = 0;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (arr[r][c] > i && visited[r][c] == 0) {
                        bfs(r, c, i);
                        cnt++;
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }

    public static void bfs(int r, int c, int i) {
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[] {r, c});
        visited[r][c] = 1;

        while (!Q.isEmpty()) {
            int[] curr = Q.poll();
            int sr = curr[0];
            int sc = curr[1];

            for (int d = 0; d < 4; d++) {
                int nr = sr + dr[d];
                int nc = sc + dc[d];
                if (nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] <= i || visited[nr][nc] == 1) continue;
                if (visited[nr][nc] == 0) {
                    visited[nr][nc] = 1;
                    Q.add(new int[]{nr, nc});
                }
            }
        }
    }
}
