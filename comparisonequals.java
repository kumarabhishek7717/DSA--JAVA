
import java.util.Scanner;
public class comparisonequals {
    public static void main(String args []){
        String str1 = "Hello ";
        String str2 = "hello";

        boolean result = (str1.equals(str2));

        System.out.println (result);
    }
} 


public class comparisonequals {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your first string ");
        String str1 = sc.nextLine();

        System.out.println("enter your second string ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)){
            System.out.println("string are equals ");
        } else {
            System.out.println("string are not equals");
        }
    }
} 

// write a java program that compares two strings "APPLE " and "apple" ignoring case sensitivity

public class comparisonequals{
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your first string ");
          
        String str1 = sc.nextLine();

        System.out.println("enter your second string ");

        String str2 = sc.nextLine();
        boolean result = (str1.equalsIgnoreCase(str2));

        System.out.println(result);
    }
} 

// Create a an array of string and check if the word "INDIA " exists in it using equals()


public class comparisonequals {
    public static void main (String args []){

        String str1 [] = {"AUSTRALIA" , "JAPAN", "INDIA" , "AMERICA" , "EUROPE", "CANADA" };

        String search = "INDIA";

        boolean found = false;

        for (int i= 0; i<str1.length; i++){

            if (str1[i].equals(search)){
                found = true;
               break;

            }

        } 
               if (found){
                System.out.println(search + "is found in the array");
               } else{
                System.out.println(search + "is not found in the array");
               }
            }

    } 

    // Write a java program to compare three string and print which ones are equals

    public class comparisonequals {
        public static void main (String [] args ){
            String str1 = "java";
            String str2 = "python";
            String str3 = "java";

            if (str1.equals(str2)){
                System.out.println("string are equals str1 and str2 ");
            }
             else if(str1.equals(str3)) {
                 System.out.println("string are equla str1 and str3");
             } else if (str2.equals(str3)) {
                System.out.println("string are equals str2 and str3");
             }
             else {
                System.out.println("string are not equals");
             }
                
            }
        }
    
