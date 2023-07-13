import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void dfs(int[][] graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i:graph[v]) {
            if (visited[i] == false) {
                dfs(graph, i, visited);
            }
        }
    }

    public static void bfs(int[][] graph, int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i: graph[x]){
                if (visited[i] == false) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static boolean iceBfs(int mainX, int mainY) {
        if (mainX <= -1 || mainX >= x || mainY <= -1 || mainY >= y) {
            return false;
        }
        if (iceFrame[mainX][mainY] == 0) {
            iceFrame[mainX][mainY] = 1;
            iceBfs(mainX-1, mainY);
            iceBfs(mainX+1, mainY);
            iceBfs(mainX, mainY-1);
            iceBfs(mainX, mainY+1);
            return true;
        }else{
            return false;
        }
    }
    static int x = 0;
    static int y = 0;

    static int iceFrame[][] = new int[1000][1000];
    public static void main(String[] args) throws Exception{
        // DFS(스택에 기초, 재귀 사용) 깊이 우선 탐색
        int dfsGraph[][] = {{},{2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        boolean dfsVisit[] = {false, false, false, false, false, false, false, false, false};
        dfs(dfsGraph, 1, dfsVisit);
        System.out.println();

        // BFS(큐에 기초) 너비 우선 탐색
        int bfsGraph[][] = {{},{2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        boolean bfsVisit[] = {false, false, false, false, false, false, false, false, false};
        bfs(bfsGraph, 1, bfsVisit);
        System.out.println();

        // 예제 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size[] = br.readLine().split(" ");
        x = Integer.parseInt(size[0]);
        y = Integer.parseInt(size[1]);


        for (int i = 0; i < x; i++) {
            String slice[] = br.readLine().split("");
            for (int j = 0; j < y; j++) {
                iceFrame[i][j] = Integer.parseInt(slice[j]);
            }
        }

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (iceFrame[i][j] == 0) {
                    if (iceBfs(i, j)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}