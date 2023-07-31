import java.util.Scanner;

class Farmer{
    int pa;
    float td,si;
    static float ri;
    
    static 
    {
        ri=4.5f;
    }

    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Amount Required :");
        pa=scan.nextInt();
        System.out.println("Please Enter Time Required");
        td=scan.nextFloat();
    }

    void compute(){
        si=(pa*ri*td)/100f;
    }

    void disp(){
        System.out.println("Simple Interest is: "+si);
    }
}

public class App2 {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
