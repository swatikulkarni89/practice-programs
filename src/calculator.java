import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1");
        float num1 = sc.nextFloat();
        System.out.println("enter num2");
        float num2 = sc.nextFloat();
        System.out.println("enter fuc");
        Scanner sc1= new Scanner(System.in);
        String function = sc1.nextLine();
        System.out.println("enter fuc"+function);
        if (function.equals ("sum"))  {
            float sum = num1 + num2;
            System.out.println(function+"="+sum);
        } else if(function.equals("sub"))

        {
            float sub = num1 - num2;
            System.out.println(function+"="+sub);

    } else if(function.equals("mult")){
    float mult = num1*num2;
            System.out.println(function+"="+mult);
    }  else if(function.equals("div")) {
        float div = num1 / num2;
            System.out.println(function+"="+div);
    }
    }
}