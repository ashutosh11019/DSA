package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList1
 */
public class LinkedList1 {

    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        // System.out.println(ll.get(1));
        getTimeDiff(al);
        getTimeDiff(ll);
    }

    static void getTimeDiff(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " ---> " + (end - start));
    }
}