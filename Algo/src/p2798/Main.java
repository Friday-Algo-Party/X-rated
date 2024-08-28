package p2798;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static int N;
    public static int M;
    public static int answer;
    public static int[] array;
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        answer = 0;

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N-1; i >= 0; i--){
            if (array[i] > M) continue;
            for (int j = i-1; j >= 0; j--){
                if (array[i] + array[j] > M) continue;
                for (int k = j-1; k >= 0; k--){
                    if (array[i] + array[j] + array[k] > M){
                        continue;
                    } else if (array[i] + array[j] + array[k] > answer) {
                        answer = array[i] + array[j] + array[k];
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}