Author - Shashwat Shivkumar Girwalkar
class Car{
   String name = "Ford";
   int price = 200;
   String color = "yellow";
   
   public String toString(){
   return "hello";
   }
   }
   
public class ToStringMethod{
   public static void main(String ...args){
   Car car = new Car();
   System.out.println(car);
   System.out.println(car.toString());
   
   }
   }