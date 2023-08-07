interface Computer
{
    void compilecode();
}

class Laptop implements Computer
{
    public void compilecode(){
        System.out.println("you got 4 errors..");
    }
}

class Desktop implements Computer
{
    public void compilecode(){
        System.out.println("you got 4 errors faster..");
    }
}
class Mobile implements Computer
{
    public void compilecode(){
        System.out.println("you got 4 errors faster.. slower..");
    }
}

class Devloper
{
    public void buidApp(Computer obj){
        System.out.println("Building App..");
        obj.compilecode();
    }
}

public class Demo3Comp {
    public static void main(String[] args) {
        Devloper dev=new Devloper();
        
        Computer obj=new Desktop();
        dev.buidApp(obj);
                 obj=new Laptop();
        dev.buidApp(obj);
                 obj=new Mobile();
        dev.buidApp(obj);

    }   
    

}
