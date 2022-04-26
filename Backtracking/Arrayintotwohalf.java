package Backtracking;

import java.util.*;

public class Arrayintotwohalf {
    public static void main(String[] args) {
        int a[] = {2,6,7,3,9,2,7};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        boolean isPossible = (sum&1) == 0 && partition(a, sum/2, 0, ans);
        if (isPossible) {
            for (int ele : ans) {
                System.out.println(ele+" ");
            }
        } else {
            System.out.println("Not possible");
        }
    }

    static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans){
        if(i>=a.length || sum<0) return false;
        if(sum==0) return true;
        ans.add(a[i]);
        boolean leftpossible = partition(a, sum-a[i], i+1, ans);
        if (leftpossible) {
            return true;
        }
        // backtracting
        ans.remove(ans.size()-1);
        return partition(a, sum, i+1, ans);
    }
}
