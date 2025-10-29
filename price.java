
import java.util.Scanner;
public class price {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float pencil =sc.nextInt();
        float pen =sc.nextInt();
        float eraser =sc.nextInt();

        float total =pencil+pen+eraser;
        System.out.println("total cost of item "+total);

        float newtotal = (0.18f*total);
        System.out.println("final cost of item with gst "+newtotal);


    }
}

    

