public class SecondLargest{
public static void main (String [] args){
    int [] arr = {2,3,10,10,4,7,8};
    int max = Integer.MIN_VALUE;
    int smax= Integer.MIN_VALUE;
    for(int i = 0; i<arr.length;i++){
        if (arr[i]>max){
            max = arr[i];
        }
                }
                for (int i =0; i<arr.length; i++){
                    if(arr[i]>smax && arr[i]!=max){
                        smax = arr[i];                    
                }
            }
                System.out.println(max);
                System.out.println(smax);
    }
}
