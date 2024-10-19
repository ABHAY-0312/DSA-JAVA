package src;

import java.util.*;

public class BoardsGame {


    private static final int[][] DIRECTIONS = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int M = scanner.nextInt();
        int N = scanner.nextInt();


        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }


        int srcX = scanner.nextInt();
        int srcY = scanner.nextInt();
        int destX = scanner.nextInt();
        int destY = scanner.nextInt();


        int moveX = scanner.nextInt();
        int moveY = scanner.nextInt();


        int result = minMoves(grid, M, N, srcX, srcY, destX, destY, moveX, moveY);
        System.out.println(result);
    }

    private static int minMoves(int[][] grid, int M, int N, int startX, int startY, int destX, int destY, int moveX, int moveY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];


        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];


            if (x == destX && y == destY) {
                return moves;
            }


            for (int d = 0; d < 4; d++) {
                int newX = x + moveX * (DIRECTIONS[d][0]);
                int newY = y + moveY * (DIRECTIONS[d][1]);


                if (isValid(newX, newY, M, N) && grid[newX][newY] == 0 && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY, moves + 1});
                }
            }
        }
        return -1;
    }

    private static boolean isValid(int x, int y, int M, int N) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }
}

