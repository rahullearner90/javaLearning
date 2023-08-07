class MyException extends Exception
{

    public MyException(String msg) {
        super(msg);
    }

}
public class Lounch7 {
    public static void main(String[] args) {
        int num1=4;
        int num2=-2;
        int Result;
        try
        {
            if(num1<0 || num2<0)
            {
                Exception e=new MyException("This is my error");
                throw e;
            }
            else
            {
                Result=num1/num2;
                System.out.println("Result : " + Result);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Can't divide by zero or Less than Zero..");
        }
        catch(Exception e)
        {
            System.out.println("Somthing Went wrong.."+ e.getMessage());
        }
    }
}
