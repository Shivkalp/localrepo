import java.lang.Math;

class Calculator{
      // function for addition.
   public static long addition(long a, long b){
      return (a+b);
      }
      // function for subtraction.
   public static long subtraction(long a, long b){
      return (a-b);
      }
      // function for multiplication.
   public static long multiplication(long a, long b){
      return (a*b);
      }
      // function for division.
   public static double division(long a, long b){
      try{
      if(b!=0){      
         double k = a/b;
         return k;
         }
         
      else{
         throw new CannotDivideWithZeroException("cannot divide the number with zero");
         }
         }
         
         
      catch(CannotDivideWithZeroException e){
         System.out.println("Cannot divide with zero");
         System.out.println(e);
         }
         return 0;
         }
         
   public static long square(long a, long b){
      return (a*a);
      }
      
   public static long cube(long a, long b){
      return (a*a*a);
      }
      
   public static long power(long base, long exponent){
      long result = 1;
      for(int i=0;i<exponent;i++){
         result*=base;
         }
         
         return result;
         }
         
   public static long remainder(long a, long b){
      return (a%b);
      }
      
   public static double exponentialpower(long exponent){
      double result = 1;
      for(int i=0;i<exponent;i++){
         result*=2.71828;
         }
         
         return result;
         }
         
   public static long absolute(long val){
      return Math.abs(val);
      }
      
   public static void main(String ...args){
   
   }
   }
         
           // Defining CannotDivideWithZeroException...
class CannotDivideWithZeroException extends Exception{
   CannotDivideWithZeroException(String e){
      super(e);
      }
      }
         
    Author - Shashwat Shivkumar Girwalkar
