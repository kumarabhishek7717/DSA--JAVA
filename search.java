public class search {
public static void main(String[] args) {
    int [] arr = {23,32,54,87,56,49,87};
    int key = 87;
    boolean flag = false ;
    for (int i = 0; i<arr.length; i++){
        if (arr[i] == key){
            flag = true;
            break;
        }
    }
    if (flag == true){
        System.out.println("found");
    } else{
        System.out.println("not found");
    }
    }
}
            
    

