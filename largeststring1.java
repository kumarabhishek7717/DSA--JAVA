import java.util.*;
public class largeststring1 {
    public static void main(String[] args) {
        String car []= {"abc" , "bca" , "cab"};

        String largest = car[0];

        for(int i = 1; i< car.length; i++){

            if (largest.compareTo(car[i]) < 0) {
                largest = car[i];
                
            }
        }
         System.out.println(largest);
    }
    
    
}  

// you are given sentence. find the longest and also lexicographically largest word (if multiple word hava the same length)

public class largeststring1 {

    public static void main(String[] args) {
        String sentence = "apple zebra mango kiwi";

        String word [] = sentence.split(" ");

        String largest = word[0];

        for (int i = 1; i<word.length; i++){

            if (word[i].length() > largest.length()){
                largest = word[i];
            }
            else if (word[i].length() == largest.length()){
                if (word[i].compareTo(largest) > 0){
                    largest = word[i];
                }
            }
        }

        System.out.println("longest & lexicographically largest word : " + largest);
    }

    
} 


// given an array of strings, combine them into a single string such that the resulting concatenated string is lexicographically largest


public class largeststring1 {

    public static void main(String[] args) {
        String [] arr = {"a", "ab", "aba"};

        Arrays.sort(arr,new Comparator <String>(){

            public int compare (String s1 , String s2){
                String order1 = s1 + s2;
                String order2 = s2 + s1;

                return order2.compareTo(order1);
            }
        });

        String result = " ";
        for (String s : arr) {
            result = result + s;
            
        }

        System.out.println("lexicographically largest concatenated string " + result);
    }

    
}
