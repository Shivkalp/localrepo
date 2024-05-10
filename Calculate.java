// Abstract classes in java.

abstract class Plan{
   double rate;
   public void calculateBill(int units){
      System.out.println("The total bill is :"+rate*units);
      }
   
   public abstract void getRate();
   
   }
   
class CommercialPlan extends Plan{
   public void getRate(){
      rate = 5.00;
      }
      }
      
class DomesticPlan extends Plan{
    public void getRate(){
      rate = 2.00;
      }
      }
      
class Calculate{;
   public static void main(String ...args){
   Plan ref;
   ref = new CommercialPlan();
   ref.getRate();
   ref.calculateBill(20);
   
   ref = new DomesticPlan();
   ref.getRate();
   ref.calculateBill(30);
   
   System.out.println("This is all about abstract classes");
   
   }
   }

   // Author - Shashwat Shivkumar Girwalkar.
