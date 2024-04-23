interface Voter{
     void castVote();
}

interface EC{
     void checkValidityOfVoter(int age) throws Exception;
}

class ECIndia implements Voter, EC{
   
   final int minAge;
   ECIndia(int minAge){
       this.minAge = minAge;
   }
   
   
    public void checkValidityOfVoter(int age) throws Exception{
           try{
            if(age<18){
               InvalidvoterException invVoter = new InvalidvoterException("invalid voter12");
               throw invVoter;
            }
           }
          catch(Exception ex){}
            //System.out.println("hello");
     }
     
    public void castVote(){
            System.out.println("in ecindia");
            int arr[] = {1, 2, 3};
          try{
            System.out.println(arr[3]);
          // int i = arr[3];
           }
          catch(Exception e){
            System.out.println(e);
            }
            System.out.println("hi");
            }
    }


class ECBrazil implements Voter, EC{
    public void checkValidityOfVoter(int age) throws Exception{
    
    }
    
       
    public void castVote(){
        System.out.println("in ecbrazil");
    }
}

class InvalidvoterException extends Exception{
  //  system.out.println("hello");
  InvalidvoterException(String error){
      super(error);
  }
}

class Election2024{
     public static void main(String ...args) throws Exception{
     
     ECIndia ecindia = new ECIndia(18);
     ecindia.checkValidityOfVoter(4);
     ecindia.castVote();
     
    }
}

Author - Shashwat Shivkumar Girwalkar