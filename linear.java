public class linear {
    public static int linearsearch(int number[], int key){
        for (int i = 0; i<number.length; i++){
            if (number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = {2,5,4,7,8,10,54,78,56,78};
        int key = 10;
        int index = linearsearch(number, key);
        if (index == -1 ){
            System.out.println("not found ");
        } else{
            System.out.println("found " + index);
        }
    }
    
}
