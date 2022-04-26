// priority queue = O(nlogk)
// deque = O(n)

package Questions;

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] a,int k){
        int n = a.length;
        if(n<=0 ) return a;
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n-k+1];
        int i=0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++){
            ans[i-k]=a[dq.peekFirst()];
            while (!dq.isEmpty() && a[dq.peekFirst()]<=i-k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i-k]=a[dq.peekFirst()];
        return ans;
    }
}

public class Sliding_Window_maximum {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ar[] = s.maxSlidingWindow(arr, k);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }
}
