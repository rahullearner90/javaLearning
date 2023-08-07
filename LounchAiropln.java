
class Airoplane
{
    public void takeoff(){
        System.out.println("Plane is taking off...");
    }
    public void fly(){
        System.out.println("Plane is flying in sky...");
    }
    public void land(){
        System.out.println("Plane is landing...");
    }
}

class Cargoplane extends Airoplane
{
    public void fly(){
        System.out.println("Cargo plane fly at lower height.");
    }

    // Specializ method
    public void carry(){
        System.out.println("Cargo plane carries goods.");
    }

}

class Passangerplane extends Airoplane
{
    // Specializ method
    public void carry(){
        System.out.println("Passanger plane carries passanger.");
    }

}

public class LounchAiropln {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        Passangerplane pp=new Passangerplane();

        cp.takeoff();
        cp.fly();
        cp.carry();
    }
}
