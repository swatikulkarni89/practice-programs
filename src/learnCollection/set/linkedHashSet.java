package learnCollection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {



                HashSet<Integer> setOfNum= new LinkedHashSet<>();
                setOfNum.add(2);
                setOfNum.add(3);
                setOfNum.add(4);
                setOfNum.add(5);
                setOfNum.add(6);
                setOfNum.add(7);
                setOfNum.add(7);
                setOfNum.add(6);
                System.out.println(setOfNum);
                System.out.println(setOfNum.remove(3));
                System.out.println(setOfNum.isEmpty());
                System.out.println(setOfNum.contains(3));


    }
}
