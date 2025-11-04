import java.util.Scanner;
public class substrings{
    public static void main (String args []){
        String str = "HelloWorld";

        String sub = str.substring(4);

        System.out.println("substrings is " + sub);
    }
} 

public class substrings{
    public static void main (String args []){
        String str = "javaprogramming";
        String sub = str.substring(4);

        System.out.println(sub);
    }
}

 
public class substrings {

    public static void main (String args [] ){

        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

        String sub = str.substring(0 , 3);
        System.out.println(sub);
    }
} 



 
// given a string "sunstringsexample", extract "example" without hardcoding the end index (use length() with substring()).

public class substrings {

    public static void main (String [] args){
        String str = "substringexample";

        int startindex = 9;

        String sub = str.substring(startindex, str.length());

        System.out.println(sub);
    }
} 

 
 
// input a string and two integers start and end , then print the substring between those indexes.

public class substrings {
    public static void main (String args []){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter your string ");
        String str = sc.nextLine();

        System.out.println("enter start index " );
        int start = sc.nextInt();

        System.out.println("enter your end index");

        int end = sc.nextInt();

        String sub = str.substring(start, end);

        System.out.println(sub);
    }
} 

// Given "I love java programming" , print only "java" using substring() and indexof().


public class substrings {
    public static void main (String args []){
        String str = "Ilove java programming ";

        int start = str.indexOf("java");

        int end = start + "java".length();

        String sub = str.substring(start, end);

        System.out.println(sub);
    }
}  

//write a program that checks wheather a string starts with the substring "pre" using substrings() instead of startwith().
public class substrings {

    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your string ");

        String str = sc.nextLine();
        
         if (str.length()>=3){
            String startpart = str.substring(0,3);

            if (startpart.equals("pre")){
                System.out.println("the string starts with 'pre'.");
            } else  {
                System.out.println("String does not start with 'pre'.");
            } 
        }
            else {
                System.out.println("String is too short to check");
            }
         }
    }

