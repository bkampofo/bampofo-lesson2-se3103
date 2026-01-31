package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class StackArrayList {

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());

        ArrayList<String> items = new ArrayList<>();
        items.add("First");
        items.add("2");
        items.add("3");
        items.add("4 four");
        System.out.println(items.get(1));

        for (var e : items) {
            System.out.println(e);
        }

        items.remove(0); // Remove the item at index 0 ("First")

        for (int i =0; i<items.size(); i++) {
            System.out.println(items.get(i));
        }

        ArrayList<Stack<Integer>> arrayOfStacks = new ArrayList<>();
        arrayOfStacks.add(new Stack<Integer>());
        arrayOfStacks.add(new Stack<Integer>());
        arrayOfStacks.add(new Stack<Integer>());

        var one = arrayOfStacks.get(0);
        one.push(5);
        one.push(7);
        
        
    }
    
}
