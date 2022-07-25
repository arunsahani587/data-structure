package Recursion;

//public class FloodFillAlgorithm {
    // Driver code
   /* public static void main(String[] args) {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        floodFill(screen, x, y, newC);

        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }
    // Dimentions of paint screen
    static int M = 8;
    static int N = 8;

    // A recursive function to replace previous color 'prevC' at '(x, y)'
    // and all surrounding pixels of (x, y) with new color 'newC' and
    static void floodFillUtil(int screen[][], int x, int y,
                              int prevC, int newC) {
        // Base cases
        if (x < 0 || x >= M || y < 0 || y >= N)
            return;
        if (screen[x][y] != prevC)
            return;

        // Replace the color at (x, y)
        screen[x][y] = newC;

        // Recur for north, east, south and west
        floodFillUtil(screen, x + 1, y, prevC, newC);
        floodFillUtil(screen, x - 1, y, prevC, newC);
        floodFillUtil(screen, x, y + 1, prevC, newC);
        floodFillUtil(screen, x, y - 1, prevC, newC);
    }

    // It mainly finds the previous color on (x, y) and
    // calls floodFillUtil()
    static void floodFill(int screen[][], int x, int y, int newC) {
        int prevC = screen[x][y];
        floodFillUtil(screen, x, y, prevC, newC);
    }*/
    //========================================================================
    // Class to store the pairs




//}


import java.util.LinkedList;
import java.util.Queue;

class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
        return second - o.second;
    }
}

class FloodFillAlgorithm {
    public static void main(String[] args) {
        int nn, mm, xx, yy, colorr;
        nn = 8;
        mm = 8;
        int dataa[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},};
        xx = 4;
        yy = 4;
        colorr = 3;
        bfs(nn, mm, dataa, xx, yy, colorr);
    }

    public static int validCoord(int x, int y, int n, int m) {
        if (x < 0 || y < 0) {
            return 0;
        }
        if (x >= n || y >= m) {
            return 0;
        }
        return 1;
    }

    // Function to run bfs
    public static void bfs(int n, int m, int data[][], int x, int y, int color) {

        // Visiing array
        int vis[][] = new int[101][101];

        // Initialing all as zero
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                vis[i][j] = 0;
            }
        }

        // Creating queue for bfs
        Queue<Pair> obj = new LinkedList<>();

        // Pushing pair of {x, y}
        Pair pq = new Pair(x, y);
        obj.add(pq);

        // Marking {x, y} as visited
        vis[x][y] = 1;

        // Untill queue is emppty
        while (!obj.isEmpty()) {
            // Extrating front pair
            Pair coord = obj.peek();
            int x1 = coord.first;
            int y1 = coord.second;
            int preColor = data[x1][y1];

            data[x1][y1] = color;

            // Poping front pair of queue
            obj.remove();

            // For Upside Pixel or Cell
            if ((validCoord(x1 + 1, y1, n, m) == 1) && vis[x1 + 1][y1] == 0 && data[x1 + 1][y1] == preColor) {
                Pair p = new Pair(x1 + 1, y1);
                obj.add(p);
                vis[x1 + 1][y1] = 1;
            }

            // For Downside Pixel or Cell
            if ((validCoord(x1 - 1, y1, n, m) == 1) && vis[x1 - 1][y1] == 0 && data[x1 - 1][y1] == preColor) {
                Pair p = new Pair(x1 - 1, y1);
                obj.add(p);
                vis[x1 - 1][y1] = 1;
            }

            // For Right side Pixel or Cell
            if ((validCoord(x1, y1 + 1, n, m) == 1) && vis[x1][y1 + 1] == 0 && data[x1][y1 + 1] == preColor) {
                Pair p = new Pair(x1, y1 + 1);
                obj.add(p);
                vis[x1][y1 + 1] = 1;
            }

            // For Left side Pixel or Cell
            if ((validCoord(x1, y1 - 1, n, m) == 1) && vis[x1][y1 - 1] == 0 && data[x1][y1 - 1] == preColor) {
                Pair p = new Pair(x1, y1 - 1);
                obj.add(p);
                vis[x1][y1 - 1] = 1;
            }
        }

        // Printing The Changed Matrix Of Pixels
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

