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

class Airport
{
    public void polytakeoff(Aeroplane ref)
    {
        ref.takeoff();
    }

    public void polyFly(Aeroplane ref)
    {
        ref.fly();
    }

    public void polyland(Aeroplane ref)
    {
        ref.land();
        System.out.println("......................................");
    }
}

public class Lounch {
    public static void main(String[] args) {
        Passangerplane pp=new Passangerplane();
        Cargoplane     cp=new Cargoplane();
        Fighterplane   fp=new Fighterplane();
        Airport        ap=new Airport();

        ap.polytakeoff(pp);
        ap.polyFly(pp);
        ap.polyland(pp);

        ap.polytakeoff(cp);
        ap.polyFly(cp);
        ap.polyland(cp);

        ap.polytakeoff(fp);
        ap.polyFly(fp);
        ap.polyland(fp);
    }
}
