import java.io.*;

public class Demo3 {
    public static void main(String[] args) {
        File f=new File("Test");
        int count=0;
        String ar[]=f.list();
        for(String a:ar){
            count++;
            System.out.println("Here : "+count+" : "+a);
        }
        System.out.println(count);
    }
}
