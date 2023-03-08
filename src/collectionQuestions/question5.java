package collectionQuestions;

public class question5 {
    public static void main(String[] args) {
        int[] a= {1, 6, 2};
        int [] output= new int[10];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=i; j>=0;j--) {

                if(i==0){
                output[k]=-1;
                k++;

            } else if (a[i]>a[j]) {
                    output[k]=a[j];
                    k++;
                }
            }


            }



        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
    }

}
