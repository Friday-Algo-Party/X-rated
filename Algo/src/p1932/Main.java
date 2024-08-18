package p1932;

import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] array;
    public static int[][] dp;
    public static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        dp = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        answer = 0;
        dp[0][0] = array[0][0];
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = 0;
                for (int k = j-1; k <= j; k++) {
                    if (k <= 0) {
                        temp = array[i][j] + dp[i-1][0];
                    } else if (k == i) {
                        temp = array[i][j] + dp[i-1][i-1];
                    } else {
                        temp = Math.max(temp, array[i][j] + dp[i-1][k]);
                    }
                }
                dp[i][j] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp[N-1][i]);
        }
        System.out.println(answer);
    }
}
