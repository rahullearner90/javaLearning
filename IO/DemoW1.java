import java.io.*;

class DemoW1{
    public static void main(String args[]) throws Exception{
        File dir=new File("myfolder2");
        File file=new File(dir, "demo.txt");

        FileReader fr=new FileReader(file);
        int ch=fr.read();
        // System.out.println(ch);
        System.out.println((char)ch);
        while(ch != -1){
            ch=fr.read();
            // System.out.println(ch);
            System.out.print((char)ch);
        }
    }
}