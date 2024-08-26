package p2178;

import java.util.*;
import java.io.*;

public class Main {

    public static int N;
    public static int M;
    public static int[][] array;
    public static int[][] bfs;
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N+1][M+1];
        bfs = new int[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                array[i][j] = line.charAt(j - 1) - '0';
            }
        }

        // BFS를 위한 큐 생성
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 1});
        bfs[1][1] = 1;

        // 상하좌우 이동을 위한 배열
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // BFS 실행
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 4방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 유효한 범위 내에 있으며 길이 있는 경우
                if (nx > 0 && ny > 0 && nx <= N && ny <= M) {
                    if (array[nx][ny] == 1 && bfs[nx][ny] == 0) {
                        bfs[nx][ny] = bfs[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

        // 최종 목적지의 값 출력
        System.out.println(bfs[N][M]);
    }
}
