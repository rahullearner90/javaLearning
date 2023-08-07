
class Demo1
{
    int a,b;
    
    // it is a constructor
    public Demo1()
    {
        System.out.println("Parent Class Constructor.");
    }

    // it is a constructor
    public Demo1(int x, int y){
        System.out.println("Parameterized parent class constructor.");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    // it is a constructor
    public Demo2()
    {
        this(2,4);
        System.out.println("Child class constructor.");
    }

    // it is a constructor
    public Demo2(int x, int y)
    {
        super(6, 8);
        System.out.println("Parameterized child class constructor");
        a=x;
        b=y;
    }

}
public class InharConst {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
    }
    
}
