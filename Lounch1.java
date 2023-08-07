
class Aeroplane
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off..");
    }

    public void fly()
    {
        System.out.println("Aeroplane fly at height.");
    }
    public void land()
    {
        System.out.println("Aeroplane is landing..");
    }
}

class Cargoplane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("Cargoplane requres longer size runway.");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height.");
    }
}

class Passangerplane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("Passangerplane requires medium size runway");
    }
    public void fly()
    {
        System.out.println("Passangerplane flies medium height");
    }
}

class Fighterplane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("Fighter plane requires small size runway.");
    }
    public void fly()
    {
        System.out.println("Fighter plane flies at high height");
    }
}

public class Lounch1 {
    public static void main(String[] args) {
        Aeroplane ref;
        Aeroplane p=new Aeroplane();
        Cargoplane cp=new Cargoplane();
        Passangerplane pp=new Passangerplane();

        ref=p;
        ref.takeoff();
        ref.fly();

        ref=cp;
        ref.takeoff();
        ref.fly();

        ref=pp;
        ref.takeoff();
        ref.fly();
    }
}
