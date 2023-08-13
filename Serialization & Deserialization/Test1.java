import java.io.*;

class Cricketer implements Serializable{
    private int runs,age;
    String name;
    public Cricketer(String name,int age,int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
    void disp(){
        System.out.println("Name : "+name+" Runs : "+runs+" Age : "+age);
    }
}
public class Test1 {
    public static void main(String[] args) throws Exception {
        // Cricketer c2=new Cricketer("Rahul",24,100);
        // Cricketer c3=new Cricketer("virat",35,50);
        // Cricketer c1=new Cricketer("Dhoni",38,100);

        File file=new File("Test.txt");
        // file.createNewFile();

        // FileOutputStream fos=new FileOutputStream(file, false);
        // ObjectOutputStream oos=new ObjectOutputStream(fos);
        // oos.writeObject(c2);
        // oos.writeObject(c3);
        // oos.writeObject(c1);
        // oos.flush();
        // oos.close();

        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer c1=(Cricketer)ois.readObject();
        c1.disp();
    }
}
