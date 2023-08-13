import java.io.*;


public class Demo7 {
    public static void main(String[] args) throws IOException{
        // File dir=new File("myfolder2");
        // File file=new File(dir,demo.txt);

        // File file1=new File("myfolder2");
        // String array[]=file1.list();
        // int count=0;
        // for(String name : array){
        //     count++;
        //     System.out.println(count+" : "+name);
        // }

        String content=
        "\nThere are many variations of passages of Lorem Ipsum available,\n but the majority have suffered alteration in some form, by injected humour, \nor randomised words which don't look even slightly believable. \nIf you are going to use a passage of Lorem Ipsum, \nyou need to be sure there isn't anything embarrassing hidden in the middle of text. \nAll the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, \nmaking this the first true generator on the Internet. \nIt uses a dictionary of over 200 Latin words, \ncombined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. \nThe generated Lorem Ipsum is therefore always free from repetition, \ninjected humour, or non-characteristic words etc.";

        File file2=new File("myfolder2","demo.txt");
        FileWriter fw=new FileWriter(file2, true);
        fw.write("Today is friday friends..");
        fw.write(content);
        fw.flush();
        fw.close();

        FileReader fr=new FileReader(file2);
        char arr[]=new char[(int)file2.length()];
        fr.read(arr);
        for(char value:arr){
            System.out.print(value);
        }
        
    }
}
