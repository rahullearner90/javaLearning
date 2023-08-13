import java.io.*;
public class Demo9 {
    public static void main(String[] args) throws Exception{
        File file=new File("myfolder3","demo3.txt");
        
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();

        while(line !=null ){
            System.out.println(line);
            line=br.readLine();
        }

        // char ch[]=new char[(int)file.length()];

        // br.read(ch);
        // for(char x : ch){
        //     System.out.print(x);
        // }
        
    }
}
