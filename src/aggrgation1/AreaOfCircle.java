package aggrgation1;

import java.util.Scanner;

public class AreaOfCircle {
    void area(){
    Scanner sc=  new Scanner(System.in);
    int l1= sc.nextInt();
    Square sq= new Square();
    int square =sq.sqr(l1);
    float area= (float) (3.14* square);
        System.out.println("are of cicle= "+area);


    }
}
