import java.io.*;
public class Demo10Pw {
    public static void main(String[] args) throws IOException{
        File f=new File("myfolder4");
        f.mkdir();
        File ft=new File(f,"Test.txt");

        FileWriter fw=new FileWriter(ft,false);
        PrintWriter pw=new PrintWriter(fw);
        pw.println("Hello");
        pw.flush();
        pw.close();

        FileReader fr=new FileReader(ft);
        char ch[]=new char[(int)ft.length()];
        fr.read(ch);
        for(char x : ch){
            System.out.print(x);
        }
    }
}
