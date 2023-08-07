interface A
{
    void show();
}
interface B
{
    void disp();
}

class C implements A,B
{
    public void show(){
        System.out.println("in show..");
    }

    public void disp()
    {
        System.out.println("in display..");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        C ref=new C();
        ref.show();
        ref.disp();

        A obj=new C();
        obj.show();
        // obj.disp(); is not possible
    }
}
