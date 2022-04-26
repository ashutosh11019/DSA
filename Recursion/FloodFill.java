package Recursion;

public class FloodFill {
    public static void main(String[] args) {
        int a[][] ={{1,1,1,1,1},
                    {1,1,2,1,1},
                    {1,2,2,2,1},
                    {1,2,1,1,1},
                    {1,1,1,1,2},
                    };
        flood_fill(a, 2, 2, 3, 2);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    static void flood_fill(int a[][], int r, int c, int toFill, int prevFill) {
        int rows = a.length;
        int cols = a[0].length;
        if(r<0 || r>=rows || c<0 || c>=cols){
            return;
        }
        if(a[r][c]!=prevFill) {
            return;
        }
        a[r][c]=toFill;
        flood_fill(a, r-1, c, toFill, prevFill);
        flood_fill(a, r, c-1, toFill, prevFill);
        flood_fill(a, r+1, c, toFill, prevFill);
        flood_fill(a, r, c+1, toFill, prevFill);
    }
}
