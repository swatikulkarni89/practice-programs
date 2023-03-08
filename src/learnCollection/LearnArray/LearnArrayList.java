package learnCollection.LearnArray;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("swati");
        student.add("anup");
        student.add("Ojas");
        System.out.println("print list"+student);
        student.add("Aarav");
        student.add("Akshu");
        student.add(3,"anvi");
        System.out.println("print list"+student);
            for (int i=0;i<student.size();i++){

                System.out.println("get element from list "+ student.get(i));
            }

            for (String element: student){
                System.out.println("each element of list by for each "+ element);

            }


        Iterator<String> name= student.iterator();

            while(name.hasNext()) {
                System.out.println("print name thr iterator " + name.next());
            }


    }
}
