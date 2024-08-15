package p11399;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                temp += array[j];
            }
            result[i] = temp;
        }
        System.out.println(Arrays.stream(result).sum());
    }
}