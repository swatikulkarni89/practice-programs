package learnCollection;

import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> student= new Stack<>();
        student.push("a");
        student.push("b");
        student.push("c");
        student.push("d");
        student.push("e");
        student.push("f");
        student.push("g");
        student.push("i");

        System.out.println("student"+ student);
        System.out.println("student"+ student.peek());
        System.out.println("student"+ student.pop());
        System.out.println("student"+ student.pop());



    }
}
