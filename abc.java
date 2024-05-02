import java.io.*;

class FileFolderExample{
   int FileCounter;
   int FolderCounter;
   
   public static void main(String ...args) throws IOException{
      System.out.println("HI...");
      FileFolderExample ffe = new FileFolderExample();
      ffe.setNumberOfFilesAndFolders("/home/shashwatshivkumargirwalkar");
      ffe.createFile1("Shashwat.txt");
      }
      
   public void setNumberOfFilesAndFolders(String path) throws NullPointerException{
      File file = new File(path);
      
     System.out.println(file.getName());
     System.out.println(file.getParent());
     System.out.println(file.listFiles());
     System.out.println(file.listFiles().length);
     System.out.println(file.canRead());
     System.out.println(file.canWrite());
       File[] arr = file.listFiles();
     for(int i=0; i<arr.length; i++){
         
         boolean a = arr[i].isFile();
         if(a){
            FileCounter++;
            }
         else{
            FolderCounter++;
            }
            }
     System.out.println("FileCount : "+FileCounter);
     System.out.println("FolderCount : "+FolderCounter);
     }
     
     public void createFile1(String path) throws java.io.IOException{
        File file1 = new File(path);
        try{
        boolean be = file1.createNewFile();
        
     
        if(be)
        {
        System.out.println("File created successfully");
        }
        else{
        System.out.println("File has not been created successfully");
        }
       }
       
       catch(IOException e){
          System.out.println("Catched the exception");
       }
        
     }
     
   }