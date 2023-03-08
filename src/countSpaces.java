import java.util.Scanner;

public class countSpaces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int spaceCount=0;
        int aCount=0;
        String inputString= sc.nextLine();
        for(int i=0;i<inputString.length();i++){
            char ch= inputString.charAt(i);
            if (ch==' '){
                spaceCount++;
            }
            if (ch=='a'){
                aCount++;
            }
        }
        System.out.println("spacecount="+spaceCount);
        System.out.println("aCount="+aCount);
    }
}
