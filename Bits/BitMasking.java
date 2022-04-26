package Bits;
import java.util.*;

public class BitMasking {
    public static void main(String[] args) {
        int num = 45;
        int i=4;
        // odd/even
        // if ((num & 1)==0) {
        //     System.out.println("even");
        // } else {
        //     System.out.println("odd");
        // }

        // Find ith number
        int mask=1<<i;
        if ((num&mask)!=0) {
            System.out.println("");
        } else {
            System.out.println("");
        }

    }
}
