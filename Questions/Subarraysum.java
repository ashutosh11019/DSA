// Subarray sum is 0
package Questions;

import java.util.*;

public class Subarraysum {
    public static void main(String[] args) {
        // for sum of k
        int[] a = {2,1,-3,4,2};
        int k=6;
        boolean found = false;
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for (int ele : a) {
            set.add(sum);
            sum+=ele;
            if (set.contains(sum-k)) {
                found=true;
                break;
            }
        }
        System.out.println("found "+found);

        // O(n^2)
        // int[] a = {2,1,-3,4,2};
        // boolean found = false;
        // for (int i = 0; i < a.length; i++) {
        //     int sum=0;
        //     for (int j = 0; j < a.length; j++) {
        //         sum+=a[j];
        //         if (sum==0) {
        //             found=true;
        //             break;
        //         }
        //     }
        //     if (found) break;
        // }
        // System.out.println("found "+found);

        // O(n)
        // int[] a = {2,1,-3,4,2};
        // boolean found = false;
        // Set<Integer> set = new HashSet<>();
        // int sum=0;
        // for (int ele : a) {
        //     set.add(sum);
        //     sum+=ele;
        //     if (set.contains(sum)) {
        //         found=true;
        //         break;
        //     }
        // }
        // System.out.println("found "+found);
    }
}
