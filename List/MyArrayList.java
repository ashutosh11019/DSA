package List;

// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pair<X, Y> {
    X x;
    Y y;

    public Pair(X x, Y y) {
        this.x=x;
        this.y=y;
    }

    public void getDescription() {
        System.out.println(x+" and "+y);
    }
}

public class MyArrayList {
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();
        // List<String> ar = new ArrayList<>();
        arr.add("ashu");
        arr.add("hi");
        arr.add("ashutosh");

        // String temp[] = new String[arr.size()];
        // arr.toArray(temp);
        // for (String e : temp) {
        //     System.out.println(e);
        // }

        // List<String> a = new ArrayList<>();
        // a.add("ashu");
        // a.add("hi");
        // arr.removeAll(a);
        //arr.remove(1);
        // arr.clear();

        // ar.add("ashu");
        // ar.add("ashu");
        // ar.add("ashu");

        // arr.addAll(ar);

        // System.out.println(arr.get(1));
        // arr.set(1,"ashutosh");
        // System.out.println(arr.isEmpty());
        // System.out.println(arr.contains("hi"));
        // System.out.println(arr.size());
        System.out.println(arr);

        

        // Pair<String, Integer> p1 = new Pair("Ashu", 83);
        // Pair<Boolean, String> p2 = new Pair(true, "Ashu");

        // p1.getDescription();
        // p2.getDescription();
    }
}