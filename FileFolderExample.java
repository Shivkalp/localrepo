import java.io.File;

class FileFolderExample{

   public static void main(String ...args){
      System.out.println("HI...");
      FileFolderExample ffe = new FileFolderExample();
      ffe.setNumberOfFilesAndFolders("/packageExamples");
      }
      
   public void setNumberOfFilesAndFolders(String path) throws NullPointerException{
      File file = new File(path);
      
     System.out.println(file.getName());
     System.out.println(file.getParent());
     System.out.println(file.listFiles());
     System.out.println(file.listFiles().length);
    
    
   }
      }