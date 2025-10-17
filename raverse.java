public class raverse {
    public static void reversearray (int [] num){
     int first =0;    int last = num.length-1;
     while (first < last){
        int tem = num [last];
        num [last] = num [first];
        num [first] = tem;
        first++;
        last--;
       
     }
     }
    public static void main(String[] args) {
        int num [] = {45,23,56,32,76,87,54,33,88,98};
        reversearray(num);
        for(int i=0; i<num.length; i++){
         System.out.print(num[i] + " ");
     }
     System.out.println();

    }
    
}

