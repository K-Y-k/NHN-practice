import java.util.Arrays;

public class MazeProblem {
    // 10x10 maze array
    static int[][] maze = {
            {0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 0, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0}
    };

    // 10x10 distance array
    static int[][] distance = new int[10][10];

    // 4 directions moved
    // Priority 1.down[x+1][y] 2.right[x][y+1] 3.left[x][y+1] 4.up[x+1][y]
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    static int count = 0; // moved count


    // function
    public static boolean search(int x, int y) {
        // (9,9)
        if (x == 9 && y == 9) {
            distance[x][y] = count;
            System.out.println("Pass, " + count);
            return true;
        }

        // current position distance
        distance[x][y] = count;

        // 4 directions moved
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // current position for moved directions
            // In maze array range
            if ((0 <= nx && nx < 10) && (0 <= ny && ny < 10)) {
                // maze array value = 0 AND distance array value = 0
                if (maze[nx][ny] == 0 && distance[nx][ny] == 0) {
                    count++;

                    // Start function for moved current position
                    if (search(nx, ny)) {
                        return true;
                    }

                    // function fail case: Restore count
                    count--;
                }
            }
        }

        // All loop search case
        return false;
    }

    public static void main(String[] args) {
        // (0,0) start
        if (!search(0, 0)) {
            // (9,9) Failed to access
            int maxCount = 0;

            for (int[] dist : distance) {
                for (int c : dist) {
                    if (c > maxCount) {
                        maxCount = c;
                    }
                }
            }

            System.out.println("Fail, " + maxCount);
        }


        // distance log
       System.out.println();
       for (int[] dist: distance) {
           System.out.println(Arrays.toString(dist));
       }
    }
}