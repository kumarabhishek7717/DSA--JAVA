public class pairs1 {
    public static void pairs (int num []){
        int tp =0;
        for (int i=0; i<num.length; i++){
            int curr = num[i];
            for (int j = i+1; j<num.length; j++){
                System.out.print("(" + curr +  "," + num[i] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print(tp);
    }
    public static void main(String[] args) {
        int num [] = {34,76,98,45,89,19,90,44,23};
        pairs(num);
    }
    
}
