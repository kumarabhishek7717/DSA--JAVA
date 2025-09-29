public class learninheritance {
    public static void main(String[] args) {
        Myphone  m = new Myphone();
        m.color = "red";
         System.out.println("my color is " + m.color);
        m. model = "ultra pro max";
        System.out.println("my model is " + m.model);
        m.price = 500000;
        System.out.println("price is " + m.price);  

        System.out.println("Myphone detail");
        System.out.println(" ");

    Apple c = new Apple();
    c.color = "blue";
    System.out.println("the color is " + c.color);
    c.model = "iphone 16 promax";
    System.out.println("the model number is " + c.model);
    c.price = 2000000;
    System.out.println("the price is " + c.price);
    System.out.println("APPLE DETAIL");
    System.out.println(" ");

    Nokia n = new Nokia();
    n.color = "orange";
    System.out.println("the color is " + n.color);
    n.model = "nokia 1100";
    System.out.println("the model is "+ n.model);
    n.price = 50000;
    System.out.println("the price is " + n.price);
    System.out.println(" NOKIA DETAIL ");
    System.out.println(" ");
    }   
}
class Myphone {
    int price;
    String model;
   
    String color;
}
class Apple extends Myphone {
    void ringtone(){
        System.out.println("Apple ringtone ");
    }
}
 
class  Nokia extends Myphone {
    void ringtone(){
        System.out.println("nokia ringtone");
    }

    
}