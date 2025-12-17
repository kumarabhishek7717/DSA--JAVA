
import java.util.Scanner;

public class Rectangle{
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i<= row ; i++){
            for(int j = 1; j<=col; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

            
        }
    }
   
    
     public class Rectangle{
        public static void main(String[] args){
            for (int i = 1; i<=4; i++){
                for (int j =1; j<=4; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
     }
        
 public class Rectangle{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
            System.out.print( j + " ");
            }
        
        System.out.println();
        }
    }
 }
    
       
    public class Rectangle{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            

            for(int i = 1; i<=row; i++){
                for(int j =1; j<=row; j++){

                
               System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
    }
   

    
    public class Rectangle{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            

            for(int i = 1; i<=row; i++){
                for(int j =1; j<=row; j++){

                
               System.out.print((char)('a' + j - 1) + " ");
            }
            System.out.println();
        }
    }
    }