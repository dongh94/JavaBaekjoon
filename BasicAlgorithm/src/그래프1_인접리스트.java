import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프1_인접리스트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        List<Integer>[] adjList = new ArrayList[V + 1];

        for (int i = 0; i < V + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            // 유향
            adjList[st].add(ed);
            // 무향
            adjList[ed].add(st);
        }

        for (int i = 0; i <= V; i++) {
            System.out.print(i +": ");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.print(adjList[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
