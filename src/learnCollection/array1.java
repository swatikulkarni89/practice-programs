package learnCollection;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int []array1 = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        int findTheNum= sc.nextInt();

        for(int i=0;i< array1.length;){
            sum= sum+array1[i];
            if(findTheNum==array1[i]){
                count++;
            }
            i++;
        }
        System.out.println("sum of all numbers in array"+sum);
        System.out.println("average of all numbers in array"+sum/ array1.length);
        if (count==0){
            System.out.println(findTheNum+"is not present in array");
        }else{ System.out.println(findTheNum+"is present in array"+count+"Times");
        }


    }
}
