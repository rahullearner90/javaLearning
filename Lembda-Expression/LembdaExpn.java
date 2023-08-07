interface Car
{
    public void drive(int avg, int tops);
}
interface A
{
    void disp(float  price);
}
interface B
{
    void show();
}
class LembdaExpn{
    public static void main(String args[]){
        Car obj=(avg,tops)-> System.out.println("Driving... average: "+avg+" Top speed : "+tops);
        obj.drive(16, 160);
         
        A a= (float price)-> System.out.println("Price of petrol in mumbai is "+price);
        a.disp(111.03f);

        B b=()->System.out.println("inside show method");
        b.show();
    }
}