// import java.io.*;
import java.util.*;

public class spiral {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;


        int tne = n * m;     //total numbers of elements
        int count = 0;

        while (count < tne) {

        //left wall
        if (count < tne) {
            for (int i = minrow; i <= maxrow; i++) {
            System.out.println(arr[i][mincol]);
            count++;
            }
        }
        mincol++;

        //bottom wall
        if (count < tne) {
            for (int i = mincol; i <= maxcol; i++) {
            System.out.println(arr[maxrow][i]);
            count++;
            }
        }
        maxrow--;

        //right wall
        if (count < tne) {
            for (int i = maxrow; i >= minrow; i--) {
            System.out.println(arr[i][maxcol]);
            count++;
            }
        }
        maxcol--;

        //top wall
        if (count < tne) {
            for (int i = maxcol; i >= mincol; i--) {
            System.out.println(arr[minrow][i]);
            count++;
            }
        }
        minrow++;
        }
        sc.close();
    }

}