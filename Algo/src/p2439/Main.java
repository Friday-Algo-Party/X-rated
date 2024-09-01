package p2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int count = N-1;

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                if (j >= count) {
                    sb.append('*');
                } else {
                    sb.append(' ');
                }
            }
            System.out.println(sb.toString());
            count--;
        }
    }
}
