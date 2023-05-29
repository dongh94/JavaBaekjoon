import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 누울자리_1652 {
/*
5
....X
..XX.
.....
.XX..
X....
*/
    static void findRow() {
        char last = 'X';
        int cnt;
        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                if (map[i].charAt(j) == 'X') {
                    if (cnt >= 2) {
                        w += 1;
                    }
                    cnt = 0;
                } else {
                    if (last == 'X') {
                        cnt = 1;
                    } else {
                        cnt += 1;
                    }
                }
                last = map[i].charAt(j);
            }
            if (cnt >= 2) {
                w += 1;
            }
        }
    }

    static void findColumn() {
        char last = 'X';
        int cnt;
        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                if (map[j].charAt(i) == 'X') {
                    if (cnt >= 2) {
                        h += 1;
                    }
                    cnt = 0;
                } else {
                    if (last == 'X') {
                        cnt = 1;
                    } else {
                        cnt += 1;
                    }
                }
                last = map[j].charAt(i);
            }
            if (cnt >= 2) {
                h += 1;
            }
        }
    }
    static int N;
    static int h, w;
    static String[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
        }
        findRow();
        findColumn();
        System.out.print(w + " " + h);
    }
}
