import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) {
        File dir=new File("myfolder2");
        dir.mkdir();
        File file=new File("myfolder2","demo.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Somthing went wrong.. "+e);
        }

        File f=new File("myfolder2");
        int count=0;
        String array[]=f.list();
        for(String name : array){
            count++;
            System.out.println(name+" No : "+count);
        }

        String str=
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, \nsed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nUt enim ad minim veniam, quis nostrud exercitation ullamco\n laboris nisi ut aliquip ex ea commodo consequat. \nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \nExcepteur sint occaecat cupidatat non proident, \nsunt in culpa qui officia deserunt mollit anim id est laborum.";

        try {
            FileWriter fw=new FileWriter(file ,false);
            fw.write(str);
            fw.append("\nhello how are you.");
            fw.append("\nI am fine..");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("File Writer exception"+e);
        }
        
    }  
}
