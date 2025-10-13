public class multiplyoddeven {
    public static void main(String[] args) {
        int [] arr = {57,98,90,45,67,34,23,76};
        for (int i = 0; i<arr.length; i++){
            if (arr[i] %2==1) {
            arr[i] *=2;

            }
            else arr[i] +=10;{
            }
            System.out.println(arr[i]);
        }
    }
    
}
