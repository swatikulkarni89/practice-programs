package learnCollection;

import java.util.LinkedList;
import java.util.Queue;

public class learnqueue {
    public static void main(String[] args) {
        Queue<Integer> table = new LinkedList<>();
        table.add(2);//if it could not add successfully then it will  thrown an exception
        table.add(4);
        table.add(6);
        table.add(8);
        table.add(10);
        table.add(12);
        table.add(14);
        table.add(16);
        table.offer(18);//if it could not add successfully then it will return false and if addes successfully then returns true
        table.offer(20);
        System.out.println("table"+ table.poll());// removes head and if queue is empty returns null
        System.out.println("table"+ table.remove());//removes head and if queue is empty throws ecxeption
        System.out.println("table"+ table.poll());
        System.out.println("table"+ table.peek());//returns head and if queue is empty returns null
        System.out.println("table"+ table.element());//returns head and if queue is empty throws ecxeption
        System.out.println("table"+ table.peek());
    }
}
