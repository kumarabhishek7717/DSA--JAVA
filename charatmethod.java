
import java.util.*;
public class charatmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println (" enter your string ");
        String str = sc.nextLine();
        
        System.out.println("character at even indexes are:");

        for(int i= 0; i<str.length(); i++){
            if (i % 2 == 0){
                System.out.println("index" + i + ":" + str.charAt(i));
            }
        }
    }
    
} 


// Write a java program to print character at odd indexes of a string using charAt()

public class charatmethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your string");

        String str = sc.nextLine();

        System.out.println("character at odd indexes are :");

        for (int i = 0; i<str.length(); i++){

        
        if (i % 2 ==1){
            System.out.println("index" + i + ":" + str.charAt(i));
        }
    }
}
} 



public class charatmethod {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter your string");

       String str = sc.nextLine();

       for (int i = 0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(str.charAt(i) + " ");
            }



       }
    }
} 


  // Write a java program to reverse a string using only charAt() (without using built in reverse method)//


  public class charatmethod {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your string");

        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1 ; i >= 0; i--){
            rev = rev + str.charAt(i);

        }

        System.out.println("original string " + str);
        System.out.println ("reversed string " + rev);
    }
  
    
  }