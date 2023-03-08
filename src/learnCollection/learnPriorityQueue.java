package learnCollection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> num= new PriorityQueue<>(Comparator.reverseOrder());

        num.add(2);
        num.add(1);
        num.add(4);
        num.add(5);
        num.add(3);
        num.offer(9);
        num.offer(6);
        num.offer(8);
        num.offer(7);
        num.offer(10);
        System.out.println("priority queue" + num);





    }
}
