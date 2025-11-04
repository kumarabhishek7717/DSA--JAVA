
import java.util.Scanner;
*public class shortpath {
    public static  double getshortestpath(String path){
        double x = 0 , y=0;
        for (int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if (dir == 'S'){
                y--;
            }
               // North 
             else   if (dir == 'N'){
                y++;
               }
               // west
            else   if (dir == 'W'){
                x--;
               }
                 // east
                else if (dir == 'E'){
                    x++;
                 }
        }
          double x2 = x * x;
          double y2 = y * y;

          return Math.sqrt(x2 + y2);

    }
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("entr your path");
        String path = sc.nextLine();
    
        System.out.println(getshortestpath(path));

    }
} 


public class shortpath{
    public static void main (String args []){
        String path = "NNNWWW";
        double x = 0 , y=0;
        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south 
            if (dir == 'S'){
                y--;
            }
               // north
            else if (dir == 'N'){
                y++;
            }
               // west
            else if (dir == 'W'){
                x--;
            }
            // east
            else if (dir == 'E'){
                x++;
            }
        }
            double x2 = x * x;
            double y2 = y * y;
            double result = Math.sqrt(x2 + y2);
    

    System.out.println(result);
}
}


// "SSSEEWN"

public class shortpath {
    public static void main(String args []){
        String path = "SSSEEWW";
        double x = 0 , y =0;

        for(int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if (dir == 'S'){
                y--;

                // north
            } 
            else if (dir == 'N'){
                y++;
            }
              // west
            else if (dir == 'W' ){
                x--;
            }
            // east

            else if (dir == 'E'){
                x++;
            }
        }
        double x2 = x * x;
        double y2 = y * y;

        double result = Math.sqrt(x2 + y2);

        System.out.println(result);
    }
} 


// "NEESSW"


public class shortpath {
    public static void main (String [] args ){
        String path = "NEESSW";
        double x = 0 , y = 0;

        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            // south

            if (dir == 'S'){
                y--;
            }
             // north
            else if (dir == 'N'){
                y++;
            }
            // west
            else if (dir == 'W'){
                x--;

            }

            // east 
            else if (dir == 'E'){
                x++;
            }
        }

        double x2 = x * x;
        double y2 = y * y;

        double result = (x2 + y2);

        System.out.println(result);
    }
}
