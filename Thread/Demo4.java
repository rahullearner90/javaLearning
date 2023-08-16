import java.util.Scanner;

class Msg implements Runnable{
    public void run(){
        System.out.println("Helth is Welth..");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(".............");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Calc implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second number : ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Calc c=new Calc();
        Msg  m=new Msg();

        Thread t1=new Thread(c);
        Thread t2=new Thread(m);

        t1.start();
        t2.start();
    }
}
