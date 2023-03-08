package collectionQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class question2 {
    public static void main(String[] args) {

        String input = "aaaabbbaacccdd";
        ArrayList<Character> inputCharList = new ArrayList<>();
        //ArrayList<Character> output = new ArrayList<>();
        char[] charInput = input.toCharArray();

        for (int i = 0; i < charInput.length;i++ ) {
            inputCharList.add(charInput[i]);
        }
        System.out.println(inputCharList.toString());
        for(int k=0;k<inputCharList.size(); k++){
        for(int j=0;j<inputCharList.size()-1;j++) {
            if (inputCharList.get(j) == inputCharList.get(j + 1)) {
                inputCharList.remove(j);
                inputCharList.remove(j);
            }


        }

        }

        System.out.println(inputCharList.toString());


    }
}


    /*int i = 0;

        for (int j = 0; j < inputCharList.size()+2;j++){
        for (i = 1; i <= inputCharList.size(); i++) {

        if (inputCharList.get(i - 1) == inputCharList.get(i)) {

        inputCharList.remove(i);
        inputCharList.remove(i - 1);
        System.out.println(inputCharList.toString());


        } else {
        System.out.println(inputCharList.toString());


        }

        }
        System.out.println(inputCharList.toString());

        }*/