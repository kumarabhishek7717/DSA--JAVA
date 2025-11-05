
import java.util.*;
public class largeststring {
    public static void main(String[] args) {
        String fruits [] = {"apple" , "mango" , "banana"};

        String largest = fruits[0];

        for (int i = 1; i<fruits.length; i++){
            if (largest.compareTo (fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
    
} 

// wrute a java program to find the smallest string in an array using compareTo().

public class largeststring {

    public static void main(String[] args) {
        String fruits [] = {"grapes" , "orange" , "apple"};

        String smallest = fruits[0];

        for (int i = 1; i<fruits.length; i++){
            if (smallest.compareTo(fruits[i]) > 0){
                smallest = fruits[i];

            }
        }
        System.out.println(smallest);
    }
} 

// write a java program that compare two given strings using compareTo() and prints.
           // "both string are equal" 
           // "first string are equal"
           // "second string are equal"

public class largeststring {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
         
        int result = str1.compareTo(str2);

        if(result == 0){
            System.out.println("both string are equal");
        }

        else if (result > 0){
            System.out.println("first string are equal");
        }

        else {
            System.out.println("second string are equal");
        }
    }
}  


// write a java program to sort array of string in alphabetical order using compareTo() method.

public class largeststring {

    public static void main(String[] args) {
        String fruits [] = {"mango" , "apple" , "banana"};

        for(int i = 0; i<fruits.length-1; i++){
            for (int j = i+1; j<fruits.length; j++){
                if (fruits[i].compareTo(fruits[j]) > 0){

                String temp = fruits[i];
                fruits [i] =  fruits[j];
                fruits [j] = temp;
            }
        }
    }

    System.out.println("string in alphabetic order");
    for (int i = 0; i<fruits.length; i++) {
        System.out.println(fruits[i]);
        
    }
}
} 

// write a java program that takes a sentence and find the lexicographically largest word it.

public class largeststring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your sentence");
        String sentence = sc.nextLine();

        String [] words = sentence.split(" ");

        String largest = words[0];

        for(int i = 1; i<words.length; i++){
            if (words[i].compareToIgnoreCase(largest) > 0) {
                largest = words[i];
                
            }
        }

        System.out.println("lexicographically largest word = " + largest);
    }
}