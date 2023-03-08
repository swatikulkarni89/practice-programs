import java.util.Scanner;


public class numOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

         int month= sc.nextInt();
         int year= sc.nextInt();
         String MonthName="any";
         int numberOfDaysInMonth=31;

         int days;
         switch(month){

             case 1:
                 MonthName  = "January";
                 numberOfDaysInMonth = 31;
                 break;
             case 2:
                 MonthName = "February";
                if(year%4 !=0){
                    numberOfDaysInMonth = 28;
                }
                else
                {
                    numberOfDaysInMonth = 29;}
                 break;


             case 3:
                 MonthName  = "March";
                 numberOfDaysInMonth = 31;
                 break;
             case 4:
                 MonthName  = "April";
                 numberOfDaysInMonth = 30;
                 break;
             case 5:
                 MonthName  = "May";
                 numberOfDaysInMonth = 31;
                 break;
             case 6:
                 MonthName  = "June";
                 numberOfDaysInMonth = 30;
                 break;
             case 7:
                 MonthName  = "July";
                 numberOfDaysInMonth = 31;
                 break;
             case 8:
                 MonthName  = "August";
                 numberOfDaysInMonth = 31;
                 break;
             case 9:
                 MonthName  = "September";
                 numberOfDaysInMonth = 30;
                 break;
             case 10:
                 MonthName  = "October";
                 numberOfDaysInMonth = 31;
                 break;
             case 11:
                 MonthName  = "November";
                 numberOfDaysInMonth = 30;
                 break;
             case 12:
                 MonthName  = "December";
                 numberOfDaysInMonth = 31;
                 break;

         }
                System.out.println(MonthName);
                System.out.println("number Of Days In Month"+numberOfDaysInMonth);

         }

    }

