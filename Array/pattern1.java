import java.util.Scanner;



 
public class pattern1 {
public static void main(String[] args) {
    for(int i = 1 ; i<=4; i++){
        for(int j = 1 ; j<=5; j++){
            System.out.print(i);
        }
        System.out.println();
    }
}    
}
 
 public class pattern1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row");
        int n = sc.nextInt();
         System.out.println("Enter your column");
        int y = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=y; j++){
                System.out.print(i );
            }
            System.out.println();
        }
    }
 }

 
 
 public class pattern1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
       
        for(int i = 1; i<=n; i++){
           
            for(int j = 1 ; j<=b; j++){

         System.out.print((char)('A' + i-1  ) + " ");
    }
    System.out.println();
 }
  }
} 

public class pattern1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
       for(int i = 1; i<=a; i++){

        
       for(int j = 1; j<= i; j++){
            System.out.print("* ");
         }
        System.out.println();
     }
 }
 }


public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){ 
        for(int j = 1 ; j<=i; j++){
            
               System.out.print((char) + (j+(64)));

        }
         System.out.println();
      
    }
   
}
} 

 
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1 ; j<=a+1-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
} 

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=a+1-1; j++){
                System.out.print((char)(j+(96)));
            }
            System.out.println();
        }
    }
}