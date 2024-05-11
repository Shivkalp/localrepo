// Interfaces Explained...

import java.lang.Class;

interface MyInter{
   void connect();
   void disconnect();
   }
   
class OracleDB implements MyInter{
   public void connect(){
      System.out.println("Connecting to oracle database");
      }
      
   public void disconnect(){
      System.out.println("Disconnecting from oracle database");
      }
      }
      
class SybaseDB implements MyInter{
   public void connect(){
      System.out.println("Connecting to sybase database");
      }
      
   public void disconnect(){
      System.out.println("Disconnecting from sybase database");
      }
      }
      
class InterfaceDemo{
   public static void main(String ...args) throws Exception{
      Class c = Class.forName(args[0]);
      
      MyInter mi = (MyInter)c.newInstance();
      
      mi.connect();
      mi.disconnect();
      }
      }

    //Author - Shashwat Shivkumar Girwalkar.