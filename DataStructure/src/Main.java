import java.sql.Array;
import java.util.*;

public class Main {
    public static int factorial(int num){
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }


    public static void main(String[] args) {
        // stack
        Stack<Integer> a = new Stack<Integer>();
        a.push(5);
        a.push(2);
        a.push(3);
        a.push(7);
        a.pop();
        a.push(1);
        a.push(4);
        System.out.println(a);

        // stack 예제(재귀함수)
        System.out.println(factorial(5));

        // queue
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.println(q);

        // 인접 행렬
        int max = 999999999;
        int processionGraph[][] = {{0, 7, 5}, {7, 0, max}, {5, max, 0}};
        System.out.println(processionGraph);

        // 인접 리스트
        ArrayList<ArrayList<Edge>> listGraph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listGraph.add(new ArrayList<>());
        }

        listGraph.get(0).add(new Edge(1, 7));
        listGraph.get(0).add(new Edge(2, 5));
        listGraph.get(1).add(new Edge(0, 7));
        listGraph.get(2).add(new Edge(0, 5));

        System.out.println(listGraph);


    }
}
class Edge {
    private final int node;
    private final int weight;

    public Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public int getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "(" + node + ", " + weight + ")";
    }
}