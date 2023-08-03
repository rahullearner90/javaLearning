
class Vehicle
{
   String name;
   int wheels;

    void setInfo(String name, int wheels) 
    {
        this.name=name;
        this.wheels=wheels;
    }

   void getinfo()
   {
    System.out.println( this.name+" has "+ this.wheels +" wheels");
   }
}

class Car extends Vehicle
{

}

class Bike extends Vehicle
{

}

class Truck extends Vehicle
{

}
public class InharHerarchical {
    public static void main(String[] args) {
        Truck t1=new Truck();
        Bike b1=new Bike();
        Car c1=new Car();

        t1.setInfo("Truck", 18);
        b1.setInfo("Bike", 2);
        c1.setInfo("Car", 4);

        t1.getinfo();
        c1.getinfo();
        b1.getinfo();
    }
}
