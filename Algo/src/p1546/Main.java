package p1546;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(br.readLine());
        StringTokenizer st;
        float [] array = new float[arrayLength];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayLength; i ++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        float maxNum = array[arrayLength-1];


        double temp = 0;
        for (float i : array) {
            temp += i / maxNum * 100;
        }

        System.out.println(temp / arrayLength);
    }
}
