import java.io.*;

class Cricketer implements Serializable{
    private int runs;
    private int age;
    private String name;

    public Cricketer(int runs, int age, String name) {
        this.age=age;
        this.runs=runs;
        this.name=name;
    }
}
class Demo1{
    public static void main(String args[]) throws IOException{
        Cricketer c1=new Cricketer(99, 20, "Sachin");
        // File f=new File("Demo.txt");
        // f.createNewFile();
        FileOutputStream fos=new FileOutputStream("Demo.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(c1);
        oos.flush();
        oos.close();
    }
}