Author - Shashwat Shivkumar Girwalkar
class Hello{
   static
    {
    System.out.println("in static block of hello");
    }
    {
    System.out.println("in init block of hello");
    }
}


 public class InitializationBlock{
   {
    System.out.println("in init block");
    }
    static
    {
    System.out.println("in static block");
    }
    public static void main(String ...args){
     InitializationBlock i = new InitializationBlock();
     Hello obj = new Hello();
     }
     }