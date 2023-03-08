package collectionQuestions;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

import static javax.management.Query.or;

public class question8 {
    public static void main(String[] args) {
        String input="12356787654321";
        char[] inputchar=input.toCharArray();
        ArrayList<Integer>inputlist=new ArrayList<>();

        for (int i=0;i<inputchar.length;i++){
            inputlist.add(Character.getNumericValue(inputchar[i]));

        }
        System.out.println(inputlist);
        for(int j=0;j<inputlist.size();j++){
            for(int k=1;k<inputlist.size();){
                if(inputlist.get(k-1)==((inputlist.get(k))+1)){

                    inputlist.remove(k-1);
                    inputlist.remove(k-1);
                    System.out.println("checked +1 condition");

                }else if (inputlist.get(k-1)==((inputlist.get(k))-1)){
                    inputlist.remove(k-1);
                    inputlist.remove(k-1);
                    System.out.println("checked -1 condition");

                }
                else{k++;}
                //System.out.println(inputlist);
            }
                System.out.println(inputlist);

        }
        System.out.println(inputlist);
    }
}
