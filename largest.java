public class largest {
   
    public static int getlargest(int number []){
         int largest = Integer.MIN_VALUE;
         for (int i =0; i<number.length; i++){
            if (largest < number[i]){
                largest = number[i];
            }
         }
         return largest;


    }
    public static void main(String[] args) {
        int number [] = {1,2,3,4,5,6,7};
        System.out.println("largest value is a " + getlargest(number));

    }
    
}
