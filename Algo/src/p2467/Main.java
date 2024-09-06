package p2467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int left = 0;
        int right = N-1;
        int[] arr = new int[N];
        int[] temp = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (left < right) {
            if (Math.abs(sum) > Math.abs(arr[left] + arr[right])) {
                sum = Math.abs(arr[left] + arr[right]);
                temp[0] = left;
                temp[1] = right;
            }
            if (arr[left] + arr[right] > 0) {
                right -= 1;
            } else {
                left += 1;
            }
        }
        System.out.println(arr[temp[0]] + " " + arr[temp[1]]);
    }
}
