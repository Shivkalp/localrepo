class nonStatic{
    int i;
     static int j;
      int k;
   
   
   public int Addition(int p, int q){
      return p+q;
   }
   
   public int Subtraction(int l, int m){
      return l-m;
      }
      
      nonStatic(){
    // Cannot specify any access specifier.  
      int i;
      int j;
      int k;
      }
  
   public static void main(String ...args){
    
      System.out.println("Hello Guys");
      nonStatic obj = new nonStatic();
      int k = obj.Addition(10,3);
      System.out.println("The sum is : "+k);
      }
      }
      
Error Occured : illegal start of expression.