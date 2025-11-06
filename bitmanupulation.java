public class bitmanupulation {
    public static void oddoreven(int n){
        int bitmask =1;

        if ((n & bitmask) == 0){

            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main (String args []){
       oddoreven(3);
       oddoreven(13);
       oddoreven(2);

    }
} 


public class bitmanupulation {

    public static int getithbit(int n , int i){
        int bitmask = 1;

        if ((n&bitmask) == 0){
           return 0;

        } else {
            return 1;
        }
    }

    public static void main (String args []){
        System.out.println(getithbit(10,4));
    }
}