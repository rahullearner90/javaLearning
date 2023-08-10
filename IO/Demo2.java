import java.io.*;
class Demo2{
    public static void main(String[] args) throws Exception {
        File dir=new File("Test");
        dir.mkdir();
        System.out.println(dir.isDirectory());

        File file=new File(dir,"demo.txt");
        file.createNewFile();
        System.out.println(file.isFile());

    }
}