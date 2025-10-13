public class multiplyoddeven {
   public static void main(String[] args) {
    int [] arr = {3,7,4,5,3,7,9};
    print (arr);
    for (int i = 0; i<arr.length;i++){
        if (i%2==1) arr[i] *=2;
         else 
            arr[i] +=10;
        }
         print (arr);
        }
    
    public static void print (int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
}
   