import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 서강그라운드 {
    static List<List<Pair>> node;
    static int[] value;
    static int[] item;

    static class Pair implements Comparable<Pair> {
        int vertex;
        int weight;

        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();

        node = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            node.add(new ArrayList<>());
        }

        value = new int[n + 1];
        Arrays.fill(value, Integer.MAX_VALUE);

        item = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            item[i] = scanner.nextInt();
        }

        for (int i = 0; i < r; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int l = scanner.nextInt();
            node.get(a).add(new Pair(b, l));
            node.get(b).add(new Pair(a, l));
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dijkstra(i, m));
        }

        System.out.println(ans);
    }

    static int dijkstra(int k, int m) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(k, 0));

        value[k] = 0;

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int u = pair.vertex;

            for (Pair neighbor : node.get(u)) {
                int v = neighbor.vertex;
                int w = neighbor.weight;

                if (value[u] + w < value[v]) {
                    value[v] = value[u] + w;
                    pq.offer(new Pair(v, value[v]));
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= value.length - 1; i++) {
            if (value[i] <= m) {
                sum += item[i];
            }
        }

        Arrays.fill(value, Integer.MAX_VALUE);

        return sum;
    }
}
