import java.io.*;
public class Demo8 {
    public static void main(String[] args) throws IOException {
        File folder=new File("myfolder3");
        // folder.mkdir();
        File file=new File(folder,"demo3.txt");
        // file.createNewFile();
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        char char1[]={'G','o','o','g','l','e'};
        bw.write(char1);
        bw.newLine();
        bw.write("Hello \nHow are you guys..");
        bw.flush();
        bw.close();

        FileReader fr=new FileReader(file);
        char ch[]=new char[(int)file.length()];
        fr.read(ch);
        for(char x : ch){
            System.out.print(x);
        }
    }
}
