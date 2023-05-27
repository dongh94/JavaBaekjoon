import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 그래프_크루스칼 {
    static int[] parent;
    static void MakeSet(int x) {
        parent[x] = x;
    }
    static int FindSet(int x) {
        if (x == parent[x]) return x;
        return parent[x] = FindSet(parent[x]);
    }
    static void Union(int x, int y) {
        parent[FindSet(y)] = FindSet(x);
//        parent[y] = x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt(); // st
            edges[i][1] = sc.nextInt(); // ed
            edges[i][2] = sc.nextInt(); // w
        }
        // 오름차순 정렬
        Arrays.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        parent = new int[V];
        for (int i = 0; i < V; i++) {
            MakeSet(i);
        }
        int answer = 0;
        int pick = 0;
        for (int i = 0; i < E; i++) {
            int px = FindSet(edges[i][0]);
            int py = FindSet(edges[i][1]);
//            싸이클이 생기지 않은 V - 1개의 간선을 선택하기
            if (px != py) {
                Union(px, py);
                answer += edges[i][2];
                pick++;
            }
            if (pick == (V - 1)) {
                break;
            }
        }
        System.out.println(answer);
    }
}
