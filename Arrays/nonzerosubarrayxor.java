import java.util.*;
public class nonzerosubarrayxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            arr[0]=1;
            //Apporach 1
            int pow=2,index=1;
            while (index<n) {
                arr[index]=pow;
                int num = index;
                index++;
                for (int i = 0; i < num && index < n; i++) {
                    arr[index]=arr[i];
                    index++;
                }
                pow=pow*2;
            }

            //Apporach 2
            // for (int i = 1; i < arr.length; i++) {
            //     arr[i]=i^(i+1);
            // }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
