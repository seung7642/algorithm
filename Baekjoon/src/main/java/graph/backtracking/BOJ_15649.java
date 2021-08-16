package graph.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 순열
public class BOJ_15649 {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static int N, M;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        backtracking(0, "");
        System.out.println(sb);
    }

    private static void backtracking(int depth, String str) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(str.charAt(i)).append(" ");
            }
            sb.append("\n");
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            backtracking(depth + 1, str + i);
            visited[i] = false;
        }
    }
}
