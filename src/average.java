import java.lang.reflect.Array;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {


          int a=0;
          float average=0;
          for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            int b =sc.nextInt();
             a= a +b;

        }


          average=a/5;
        System.out.println(average);

    }
}
