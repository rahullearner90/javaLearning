import java.util.Scanner;

class Mythread extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("calc")){
            calc();
        }else{
            important();
        }
    }
    public void calc(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second number : ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }

    public void important(){
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Helth is Welth..");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Mythread thread1=new Mythread();
        Mythread thread2=new Mythread();

        thread1.setName("calc");
        thread2.setName("print");

        thread1.start();
        thread2.start();
    }
    
}
