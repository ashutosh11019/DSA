package Recursion;

public class Coin_Game {
    public static void main(String[] args) {
        int a[] = {1,5,700,3,2,4};
        System.out.println(CoinMax(a, 0, a.length-1));
    }

    static int CoinMax(int a[], int l,int r) {
        if(l+1==r){
            return Math.max(a[l], a[r]);
        }
        return Math.max(a[l] + Math.min(CoinMax(a, l+2, r), CoinMax(a, l+1, r-1)), 
                        a[r] + Math.min(CoinMax(a, l+1, r-1), CoinMax(a, l, r-2)));
    }
}
