
public class subpairs{
    public static void printsubpairs(int num []){
       for(int i = 0; i<num.length; i++){
           int start = i;
           for (int j = 0; j<num.length; j++){
              int end = j ;
               for (int k = start; k<=end; k++){
                   System.out.print(num[k] + " ");
                }
               System.out.println();
            }
            System.out.println();
        }
    }
   public static void main (String [] args){
       int num [] = {4,6,8,10,12};
        printsubpairs(num);
    }
}


public class subpairs{
   public static void printsubpairs(int num []){
        for(int i = 0; i<num.length; i++){
           int start = i;
           for (int j = 0; j<num.length; j++){
             int end = j ;
           for (int k = start; k<=end; k++){
                  System.out.print(num[k] + " ");
                }
               System.out.println();
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        int num [] = {4,6,8,10,12};
        printsubpairs(num);
    }
}


public class subpairs {
    public static void printsubnum(int num[]){
    for(int i = 0 ; i< num.length; i++){
            int start = i;
            for (int j = i+1; j<num.length; j++){
                int end = j ;
                for (int k = start; k<=end; k++){
                   System.out.print(num[k] + " ");
                }
            System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int num [] = {6,8,10,12,14};
        printsubnum(num);
        
    }
}


public class subpairs {
    public static void printsubnumber (int num []){
        for (int i = 0; i<num.length; i++){
            int start = i;
            for (int j = i+1; j<num.length; j++){
                int end = j ;
                for (int k = start; k<=end; k++){
                   System.out.print(num[k] + " ");
               }
            System.out.println();
           }
          System.out.println();
      }
    }
    public static void main (String [] args){
     int num [] = {5,7,9,11,13};
        printsubnumber(num);
    }
}


public  class subpairs {
    public static void printhighnumber (int num []){
        for (int i = 0; i< num.length; i++){
            int start = i;
            for (int j = 0; j< num.length; j++){
                int end = j;
                for (int k = start; k<=end ; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        int num [] = { 35,45,55,65,75};
        printhighnumber(num);

     }
}