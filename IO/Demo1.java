import java.io.*;


class Demo1{
    public static void main(String args[]){
        // File file1=new File("test.txt");
        // System.out.println(file1.exists());
        // file1.createNewFile();

        File file=new File("Test");
        try
        {
            file.mkdir();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}