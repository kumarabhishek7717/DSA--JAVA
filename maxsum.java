public class maxsum {
    public static void printmaxsubarraysum(int num []){
      int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i=0; i<num.length; i++){
           int start = i;
            for (int j = 0; j<num.length; j++){
                int end = j;
                currsum =0;
                for (int k = start; k<=end; k++){
                 subsarray sum
                  currsum += num[k];
                }
                System.out.println(currsum);
             if (maxsum < currsum){
                maxsum = currsum;
            }
        }

}
}
        System.out.println("max sum is " + maxsum);

       public static void main(String[] args) {
     int num [] = {2,4,6,8,10};
   printmaxsubarraysum(num);
  }  
}


public class maxsum {
    public static void  sumsubarray(int num []){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;

        for (int  i = 0; i<num.length; i++){
            int start = i;
            for (int j = 0 ; j<num.length; j++){
                int end = j;
                currsum = 0;
                for (int k = start; k<=end; k++){
                    currsum += num[k];

                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;

                }
            }
        }
        System.out.println("max sum is " + maxsum);

    }
    public static void main(String[] args) {
        int num [] = {2,-4, 6, -8, 10};
        sumsubarray(num);
    }
}  


public class maxsum {
    public static void  sumarray (int num []){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for ( int i = 0; i<num.length; i++){
            int start = i;

            for (int j = 0; j<num.length; j++){
                int end = j;
                currsum = 0;

                for ( int k = start; k<=end; k++){
                    currsum += num [k];

                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum is " + maxsum);
    }
    public static void main(String[] args) {
        int num [] = {56,67,98,89,45};
        sumarray(num);

    }
} 

public class maxsum {
    public static void sumarray (int arr []){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++){
            int start = i;
            for (int j =0; j<arr.length; j++){
                int end = j;
                currsum = 0;

                for (int k = start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum =currsum;
                }
            }
        }
        System.out.println("maxsum is " + maxsum);
    }

    public static void main(String[] args) {
        int arr [] = {1, -2, 3, -1, 2};
        sumarray (arr);
        }
} 


public class maxsum {
    public static void negativesumarray(int arr []){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++){
            int start = i;
            for (int j =0; j<arr.length; j++){
                int end = j;
                currsum = 0;

                for (int k = start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxsum > currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println( "max sum is " + maxsum);
    }
    public static void main(String[] args) {
        int arr [] = {-5, -2, -3,-4};
        negativesumarray(arr);

    }
} 

public class maxsum {
    public static void maxsubarraywithindex (int arr []){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
       int start = 0      ,        end = 0;

        for (int i = 0; i<arr.length; i++){
             start = i;
            for (int j = 0; j<arr.length; j++){
                 end = j;
                currsum = 0;
                for (int k = start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;
                    start = i;
                    end = j;
                }
            }

        }
        System.out.println("max sum is " + maxsum);
        System.out.println("start index is " + start);
        System.out.println("end is " + end);
    }
    public static void main(String[] args) {
        int arr [] = {4, -1, 2, 1, -5,4};
        maxsubarraywithindex(arr);
    }
}



