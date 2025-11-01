public class kadanealgorithm {
    public static void kadane(int numbers []){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i =0; i<numbers.length; i++){
            cs = cs + numbers[i];
                   if (cs < 0){
                    cs = 0;
                   }    
                   ms = Math.max(ms , cs );
                
                }
                System.out.println("max is " + ms);
    }
    public static void main(String[] args) {
        int numbers [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
    }
    
} 

public class kadanealgorithm {
    public static void kadane(int num []){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<num.length; i++){
            cs = cs + num[i];
            if (cs<0){
                cs= 0;
            }
            ms = Math.max(ms , cs);
           
        }
        System.out.println("your max is " + ms);
    }

     public static void main(String[] args) {
        int num [] = {-2,1,-3,4,-1,2,1,-5,4};
        kadane(num);
     }
} 

public class kadanealgorithm {
    public static void kadane (int arr [] ){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i =0; i<arr.length; i++){
            cs = cs + arr[i];
            if (cs > 0){
                ms = Math.max(ms , cs);
            }
            System.out.println(ms);
        }
    }

     public static void main(String[] args) {
        int arr [] = {-3, -2, -5, -7};
        kadane(arr);
     }
} 

public class kadanealgorithm {
    public static void kadane (int arr []){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<arr.length; i++){
          cs = cs + arr[i];
            if (cs < 0){
                cs = 0;
               
            }
            ms = Math.max(ms , cs);
        }
        System.out.println("max is " + ms);
    }
    public static void main(String[] args) {
        int arr [] = {5, -2, 3, 4};
        kadane (arr);
    }
}
