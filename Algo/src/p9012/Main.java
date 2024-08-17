package p9012;

import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int temp;
    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            temp = 0;
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (temp < 0) {
                    temp = -1;
                    break;
                }
                if (str.charAt(j) == '(') temp += 1;
                else if (str.charAt(j) == ')') temp -= 1;
            }
            if (temp == 0) sb.append("YES");
            else sb.append("NO");
            sb.append(" ");
        }
        for (String s : sb.toString().split(" ")) {
            System.out.println(s);
        }
    }
}
