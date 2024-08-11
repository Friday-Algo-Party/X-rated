package p11053;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i ++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for (int i = 0; i < N; i ++) {
            dp[i] = 1;
            for (int j = 0; j < i; j ++) {
                if (array[i] > array[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
