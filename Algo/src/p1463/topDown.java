package p1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class topDown {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new Integer[num + 1];
        dp[0] =  dp[1] = 0;
        int result = cul(num);
        System.out.println(result);
    }

    static int cul(int n) {
        if (dp[n]==null){
            if (n % 6 == 0) {
                int temp = Math.min(cul(n/3), cul(n/2));
                int temp2 = Math.min(cul(n/2), cul(n-1));
                dp[n] = Math.min(temp, temp2) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(cul(n/3), cul(n-1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(cul(n/2), cul(n-1)) + 1;
            } else {
                dp[n] = cul(n-1) + 1;
            }
        }
        return dp[n];
    }
}
