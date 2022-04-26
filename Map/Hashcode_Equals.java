package Map;

import java.util.*;

public class Hashcode_Equals {
    public static void main(String[] args) {
        Pen pen1 = new Pen(100, "blue");
        Pen pen2 = new Pen(100, "blue");

        // System.out.println(pen1.equals(pen2));

        Set<Pen> pens = new HashSet<>();
        pens.add(pen1);
        pens.add(pen2);
        System.out.println(pens);
    }
}

class Pen {
    int price;
    String color;

    public Pen(int price,String color){
        this.price=price;
        this.color=color;
    }

    @Override
    public boolean equals(Object obj) {
        Pen that = (Pen) obj;
        boolean isEqual = this.price==that.price && this.color==that.color;
        return isEqual;
    }

    @Override
    public int hashCode() {
        return price + color.hashCode();
    }
}