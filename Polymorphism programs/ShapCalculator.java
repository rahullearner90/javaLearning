class Shape
{
    double area,redius;

    public double  calcArea(double a){
          return  area;
    }

    public void disp(double a){
        System.out.println("Area is "+a);
    }
    
}
class Circle extends Shape
{
   private double redius;
    public double calcArea(double redius){
        this.redius=redius;
        return Math.PI*redius*redius;
    }
}

class Rectangle extends Shape
{
    private double a,b;

    double calcArea(double length, double width)
    {
        this.a=length;
        this.b=width;
        return a*b;
    }
}

class Triangle extends Shape
{
    private double a,b;

    double calcArea(double base,double  height)
    {
        this.a=base;
        this.b=height;
        return (base*height)/2;
    }
}

class ShapCalculator{
    public static void main(String args[]){
           Circle circle=new Circle();
           circle.calcArea(25);
           
    }
}