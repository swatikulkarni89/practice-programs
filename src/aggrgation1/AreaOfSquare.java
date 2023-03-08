package aggrgation1;

import java.util.Scanner;

public class AreaOfSquare {
    void area(){
    Scanner sc=  new Scanner(System.in);
    int l1= sc.nextInt();
    Square sq= new Square();
    int area =sq.sqr(l1);
    System.out.println("are of squere= "+area);
    }

}
