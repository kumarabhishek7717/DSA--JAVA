
import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        String name = "sarthak";
        String title = "pathak";

        String fullname = name + " " + title;
        System.out.println(fullname );
    }
    
} 

// Take two string as input from the user and concatenate them using the + operator ??

public class concatenation {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String fruits = sc.nextLine();
        String secondfruits = sc.nextLine();
        String finalfruits = fruits + " " + secondfruits;

        System.out.println(finalfruits);
        
    }
} 

// concatenate three strings "java", "is ", and "fun" using the concat() method


public class concatenation {

    public static void main(String[] args) {
        String str = "java" + " ";
        String str1 = "is" + " ";
        String str2 = "fun";
       // using concat method
        String result = str.concat(str1).concat(str2);

        System.out.println(result);
    }
}


//  Write a java program to join two Strings with a space between them


public class concatenation {

    public static void main(String[] args) {
        String str1 = "Good"+ " ";
        String str2 = "Morning";
        String result = str1.concat(str2);

        System.out.println (result);
    }
} 



// Write a  program to concatenate a string and an integer value 

public class concatenation {

    public static void main(String[] args) {
        String str1 = "Roll No : 101";
        System.out.println(str1);
    }
} 

// Wirte a program that concatenate an array of string into a single string 


public class concatenation {

    public static void main(String[] args) {
        String arr [] = {"one " , "two" , "three"};
        String result = "";
        for (int i = 0; i<arr.length; i++){
            result = result + arr[i];
        }
        System.out.println(result);
    }
}


public class concatenation {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

            System.out.print("enter your first name");
            String first = sc.nextLine();

            System.out.print("enter your second  name");
            String last = sc.nextLine();

            String fullname = first + " "+ last;

            System.out.println(fullname);
        }
    }

    
