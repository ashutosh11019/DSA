// import java.util.*;
import java.io.*;

/**
 * average3
 */
public class average3 {
    public static void avg(int n){
        int a = n-1;
        int b = n+1;
        System.out.println(a+" "+n+" "+b);
    }

    public static void main(String[] args)throws Exception {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String[] in = bf.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        avg(n);

    }
}