package collectionQuestions;

public class question3 {
    public static void main(String[] args) {
        int[] input= {1,3,2,4};
        int [] output= new int[10];
        int k=0;
         // to find the adgessent greater element
        for(int i=0;i<input.length-1;) {
            for (int j = i; i < input.length - 1; ) {
                if (input[i] < input[j + 1]) {
                    output[k] = input[j + 1];
                    k++;
                    i++;
                } else {
                    j++;
                }
            }
            output[k] = -1;
            k++;
            i++;
        }



        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
    }
}
