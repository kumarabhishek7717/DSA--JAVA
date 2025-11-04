
import java.util.Scanner;
public class palindrome {
    public static boolean ispalidrome(String str){
        
        int n = str.length();

        for (int i= 0; i<n/2; i++){

            if (str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome

                return false;
            }
        }
            

            return true;
        }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter your "); 

        String str = sc.nextLine();
        System.out.println(ispalidrome(str));
        
    }
    

} 

 

// check whether a given number a palindrome or not in java 

 public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string");

        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num > 0) {

            int digit = num % 10 ;
            reverse = reverse *10 + digit;
            num = num/10;

            
        }

        if (original == reverse){
            System.out.println(original + " is palindrome number");
        } else {
            System.out.println(original + " is not palindrom");
        }
    }
}
 


 // write a java program to find all palindrome number between 1 and 1000.


 public class palindrome {
 
    public static void main(String[] args) {
        // loop from 1to 1000;

        for (int i = 1; i <=1000; i++){

            int num = i;
            int reverse = 0;
            int temp = num;

            // reverse the number

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
                
            }

            // check if number is palindrome

            if (temp == reverse){
                System.out.println(temp + " ");
            }
        }
    }
 }
   

   // write a java program to reverse a string  without using buit - in functions and check if it is  a palindrome 


   public class palindrome {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your string ");

        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

          if (str.equals(reverse)){
            System.out.println(str + " is a palindrome ");
          } else {
            System.out.println(str + " is not palindrome");
          }
    }
   }