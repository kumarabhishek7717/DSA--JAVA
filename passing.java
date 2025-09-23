public class passing {
    public static void update (int marks []){
        for (int i = 0 ; i<marks.length;i++){
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int marks [] = {70,87,96,56,78};
      update(marks);
      
      
    
}
}
