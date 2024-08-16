package p15650;

import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] array;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[M];

        dfs(1, 0);

    }
    public static void dfs(int at, int depth){
        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= N; i++) {
            array[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}
