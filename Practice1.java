class Practice1{
   public static void main(String [] args){
      try{
         Thread.sleep(1000);
	 System.out.println("inside try");
	 Thread.sleep(1000);
	 System.out.println(args[0]);
	 Thread.sleep(1000);
	 System.out.println("Inside try2");
	 }
	 
    
       catch(ArrayIndexOutOfBoundsException e){ 
          System.out.println("inside catch2");
       }
       catch(InterruptedException e){  //this is a compile time exception
	System.out.println("InterruptedException found");
	}
        catch(Exception e){
          System.out.println("inside catch");
       }
       }
       }

       Author - Shashwat Shivkumar Girwalkar