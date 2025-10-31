
import java.util.*;
public class prefixsum {
    public static void prefixsumarray(int arr []){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int [arr.length];

        prefix[0] = arr[0];
        //prefix array
        for (int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];       
    }

    for (int i =0; i<arr.length; i++){
        int start = i;
        for (int j = i; j<arr.length; j++){
            int end = j;
            currsum = start == 0 ? prefix[end] : prefix [end] - prefix [start -1];
        if (maxsum < currsum){
            maxsum = currsum;
        }
    } 

        
    }
    System.out.println("maxsum is " + maxsum);
}

    public static void main(String[] args) {
        int arr [] = {1 , -2, 6, -1, 3};
        prefixsumarray(arr );

    }
} 


public class prefixsum {
    public static void prefixsum (int arr []){
        int prefix [] = new int [arr.length];
        prefix [0] = arr[0];


        for (int i= 1; i< prefix.length; i++){
            prefix [i] = prefix [i-1] + arr [i];

        }
        System.out.println("prefix sum array");
        for (int num : prefix){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        prefixsum(arr);
    }
}  


public class prefixsum {
    public static void prefixsumarray(int arr []){
        Scanner sc = new Scanner(System.in);
        
        int prefix [] = new int [arr.length];
        prefix [0] = arr [0];
        for (int i = 1; i<prefix.length; i++){
            prefix [i] = prefix [i-1] + arr [i];
        }
        System.out.println("enter L");
        int L = sc.nextInt();
        System.out.println("enter R");
        int R = sc.nextInt();

        int rangesum;
        if (L ==0){
            rangesum = prefix [R];
        } else {
            rangesum  = prefix [R] - prefix [L -1];
        }
        System.out.println("sum of index " + L + "to " + R + "=" + rangesum);
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        prefixsumarray(arr);
        
    }
} 


public class prefixsum {
    public static void prefixsumarray(int num []){
        int prefix [] = new int [num.length];
        prefix [0] = num [0];
        for (int i =1; i<prefix.length; i++){
            prefix [i] = prefix [i-1] + num [i];

        }
        int [] [] queries = {
            {0,2},
            {1,3},
            {2,4}
        };
        for (int i = 0; i<queries.length; i++){
            int L = queries [i] [0];
            int R = queries [i] [1];

            int sum ;
            if (L==0){
                sum = prefix [R];
            } else {
                sum = prefix [R] - prefix [L -1];
                System.out.println("sum from " + L + "to " + R + "= " + sum);
               }

            } 
        }
        
    
    public static void main(String[] args) {
        int num [] = {1, 2, 3, 4,5};
        prefixsumarray(num);
    }
}
