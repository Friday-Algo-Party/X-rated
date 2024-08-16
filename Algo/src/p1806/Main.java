package p1806;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        StringTokenizer items = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(items.nextToken());
        }

        int right = 0;
        int left = 0;
        int sum = 0;
        int temp = N+1;

        while ( right < N ) {
            sum += array[right];
            while ( sum >= min ) {
                temp = Math.min(temp, right - left + 1);
                sum -= array[left];
                left++;
            }
            right++;
        }

        if (temp > N) System.out.println(0);
        else System.out.println(temp);
    }
}
