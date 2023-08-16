class Print implements Runnable
{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("Focus is important..");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Somthing went wrong.."+e);
            }
        }
    }
}
public class Demo6 {
    public static void main(String[] args) {
        System.out.println("Main thread started..");
        Print p=new Print();
        
        Thread t=new Thread(p);
        System.out.println(t.isAlive());//false

        t.start();
        System.out.println(t.isAlive());//true
        
        try {
            t.join();
        } catch (Exception e) {
            System.out.println("Somthing went wrong.."+e);
        }

        System.out.println("Main thread Ended..");
    }
}
