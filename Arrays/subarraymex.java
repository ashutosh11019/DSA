import java.util.*;
public class subarraymex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (k<x) {
                System.out.println("-1");
            }else{
                while (true) {
                    for (int i = 0; i < x; i++) {
                        System.out.print(i+" ");
                        n--;
                    }
                    if (n==0) {
                        break;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
