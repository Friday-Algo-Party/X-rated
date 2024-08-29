package p15652;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    static int M;
    static int[] temp;
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        temp = new int[M];

        dfs(1, 0);

        for (String s : sb.toString().split("/")) {
            System.out.println(s);
        }

    }

    public static void dfs(int point, int depth) {
        if (depth == M) {
            for (int i = 0; i < temp.length; i++) {
                sb.append(temp[i] + " ");
            }
            sb.append("/");
            return;
        }
        for (int i = point; i <= N; i++) {
            temp[depth] = i;
            dfs(i, depth+1);
        }
    }
}