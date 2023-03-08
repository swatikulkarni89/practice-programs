public class binaryToDecNDecToBinary {
    public static void main(String[] args) {
        int num1=26;
        int [] binary1= new int[100];
        int qout=num1;
        int i=0;
        int num2;
        while (qout!=0){
            binary1[i]=qout %2;
            qout= qout/2;
            i++;
        }
        for(int j=i; j>=0; j--){

            System.out.print(binary1[j]);


        }




    }

}
