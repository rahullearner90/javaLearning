class A{
    String name;
    int b;
    void show(){
        System.out.println("in show..");
    }

    class B
    {
        void disp(){
            System.out.println("in display..");
        }
    }
}
class Main 
{
    public static void main(String args[]){
        A obj=new A();
        obj.show();

        A.B obj2= obj.new B();
        obj2.disp();
    }

}