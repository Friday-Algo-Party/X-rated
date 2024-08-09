package p2839;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int result = 0;
        while (sugar > 0) {
            if (sugar % 5 == 0) {
                result += sugar / 5;
                System.out.println(result);
                return;
            }
            sugar -= 3;
            result ++;
        }
        if (sugar == 0) System.out.println(result);
        else System.out.println(-1);
    }
}
