package p11047;

import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int sum;
    public static int min;
    public static int[] coins;
    public static int temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        sum = Integer.parseInt(st.nextToken());
        coins = new int[N];
        min = 0;
        temp = N;
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        while (sum != 0) {
            temp--;
            if (sum / coins[temp] > 0) {
                min += (sum / coins[temp]);
                sum -= coins[temp] * (sum / coins[temp]);
            }
        }
        System.out.println(min);
    }
}
