import java.io.*;
public class Demo4 {
    public static void main(String[] args) {
        int count=0;
        File f=new File("D://movies");

        String array[]=f.list();

        for(String name : array){
            count++;
            System.out.println("NO "+count+" : "+" "+name);
        }
    }
}
