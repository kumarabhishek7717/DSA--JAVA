import java.util.*;
public class characteratmethod {

    public static void main(String[] args) {
        String str  = "sachin ";
        String str1 = "tendylar";
       String fullname = str.concat(str1);
       
        System.out.println(fullname.charAt(3));
        
           
        }
    } 


    // Write a java program to take a string input and printl all character one by one using charAt()//

    public class characteratmethod {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                System.out.print("enter your input ");

                String str = sc.nextLine();

                for (int i= 0; i< str.length(); i++){
                    System.out.println(i + " " + str.charAt(i));
                }
            }
        }
    

    // Write a java program to find the middle character of a string using charAt()//


    public class characteratmethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.print("enter your input");
            String str = sc.nextLine();

            int  length = str.length();

            if (length % 2 == 0){

                char ch1 = str.charAt(length /2 -1);
                char ch2 = str.charAt(length / 2);
                System.out.println("Middle characters " + ch1 + "and " + ch2);

            } else {
                char ch = str.charAt (length / 2);
                System.out.println("middle character " + ch);

            }
        }
    }
     
       // Write a java program to check whether the first and last character of a string are same using charAt()//
     public class characteratmethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("emter a string");
            String str = sc.nextLine();

            if (str.length() == 0)  {

                System.out.println("string is empty");
                
            } else {
                char first = str.charAt(0);
                char last = str.charAt(str.length() - 1);


                if (first == last){
                    System.out.println("first and last character are same : " + first);
                } else {
                    System.out.println("first and last character are different:");
                    System.out.println("first : " + first + ",last : " + last);
                }
            }
        }
     }

