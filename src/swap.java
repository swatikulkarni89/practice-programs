import java.util.Scanner;


public class swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 =sc.nextLine();
        String num2 =sc.nextLine();
        System.out.println("before swapping"+"num1= "+num1+"\n"+"num2= "+num2);
        String temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping"+"num1= "+num1+"\n"+"num2= "+num2);



    }
}
