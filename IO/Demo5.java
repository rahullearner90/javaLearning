import java.io.*;
public class Demo5 {
    public static void main(String[] args) throws IOException {
        File dir=new File("myfolder");
        // dir.mkdir();
        File file=new File(dir, "hello.txt");
        // file.createNewFile();

        String st="\nI am writing this statement through file writer";
        FileWriter fw=new FileWriter(file, false);
        fw.write("hello world \n");
        char ar[]={'h','e','l','l','o'};
        fw.write(ar);
        fw.write(st);
        fw.close();
        System.out.println("Writing Done..");
    }
}
