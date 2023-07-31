public class Demo2 {
    static int a;
    static int b;

    int m;
    int n;

    static 
    {
        System.out.println("Controll in static block");
        a=5;
        b=10;
    }

    {
        System.out.println("Controll in non static block");
        m=15;
        n=20;
    }

    static void disp1(){
        System.out.println("Value of static var1: "+a);
        System.out.println("Value of static var2: "+b);
    }

    void disp2(){
        System.out.println("Value of non static var1:"+m);
        System.out.println("Value of non static var2:"+n);
    }

    public static void main(String[] args) {
        Demo2.disp1();
        Demo2 nonstc=new Demo2();
        nonstc.disp2();
    }
}
