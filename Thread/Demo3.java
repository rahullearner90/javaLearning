import java.util.Scanner;

class Msg extends Thread{
    public void run(){
        System.out.println("Helth is Welth..");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                // experiment with thread here
                if(i==3){
                    try{
                        Thread.sleep(5000);
                    }catch(Exception e){
                        System.out.println("Somthing Error here..");
                    }
                }
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

class Calc extends Thread{
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
public class Demo3 {
    public static void main(String[] args) {
        Calc t1=new Calc();
        Msg t2=new Msg();

        t1.start();
        t2.start();
    }
}
