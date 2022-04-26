package Recursion;

public class Path_nxm_grid {
    public static void main(String[] args) {
        System.out.println(path(200,2));
    }

    static int countPaths(int row,int col,int n,int m){
        if(row==n || col==m){
            return 1;
        }
        int count = 0;
        count+=countPaths(row+1, col, n, m);
        count+=countPaths(row, col+1, n, m);
        return count;
    }

    static int path(int n, int m){
        if(n==1||m==1) return 1;
        return path(n,m-1)+path(n-1,m);
    }
}
