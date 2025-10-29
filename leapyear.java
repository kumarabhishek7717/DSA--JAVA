import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("it is leap year" +year);
        }
        if(year%100==0 && year%400==0){
            System.out.println("it is also leap year" +year);
        }
        else{
            System.out.println("it is not leap year");
        }
        
    }
}

    

