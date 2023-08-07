class A
{
    public int a() throws Exception
    {
       return  b();
    }

    public int b() throws Exception
    {
        int num1=4;
        int num2=0;
        return num1/num2;
    }
}

public class Lounch5 {
    public static void main(String[] args) {
        A obj=new A();
        try
        { 
            System.out.println("Result : " + obj.a());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error :" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Somthing went wrong..");
        }
    }
}
