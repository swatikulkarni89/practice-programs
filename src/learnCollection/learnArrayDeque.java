package learnCollection;

import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> num= new ArrayDeque<>();
        num.offer(23);
         num.offerFirst(34);
         num.offerLast(45);
        System.out.println("deque"+ num);
        System.out.println("first"+ num.peekFirst());
        System.out.println("first"+ num.peekLast());



    }
}
