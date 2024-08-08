package p1149;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roadLength = Integer.parseInt(br.readLine());
        int [][] cost = new int[roadLength][3];
        StringTokenizer st;
        int result;
        for (int i = 0; i < roadLength; i++) {
            int [] temp = new int[3];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }
            cost[i] = temp;
        }

        int [][] dp = new int[roadLength][3];
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < roadLength; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        result = Math.min(dp[roadLength - 1][0], Math.min(dp[roadLength - 1][1], dp[roadLength - 1][2]));

        System.out.println(result);
    }
}
