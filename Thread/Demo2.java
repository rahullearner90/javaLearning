class Mythread extends Thread{
    public void run(){
        System.out.println("Child thread.");
    }
}
class Demo2{
    public static void main(String args[]){
        System.out.println("Main thread..");
        Mythread t=new Mythread();
        t.start();
    }
}