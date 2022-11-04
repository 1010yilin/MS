package section10.PlayBall;

import java.util.*;

public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        printDouble(items);
    }
    private static void printDouble(ArrayList<Integer> n){
        for (int i : n){
            System.out.println(i*2);
        }
    }
}
