package collectionQuestions;

import java.util.ArrayList;

public class question6 {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
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
