package Collections;

import java.util.LinkedList;
import java.util.Collections;

public class Scenario4 {
    public static void main(String[] args) {
    
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : numbers) {
            list.add(num);
        }

        
        Collections.reverse(list);
        System.out.println("LinkedList in Reverse Order: " + list);
    }
}

