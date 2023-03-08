package collectionQuestions;

import java.util.Stack;

public class question4 {
    public static void main(String[] args) {
        Stack<Integer> num1= new Stack<>();
        num1.push(2);
        num1.push(3);
        System.out.println(num1);
        num1.pop();
        System.out.println(num1);
        int e1=num1.lastElement();
        System.out.println("least element= "+e1);
        num1.push(1);
        System.out.println(num1);
        e1=num1.lastElement();
        System.out.println("least element= "+ e1);
    }
}
