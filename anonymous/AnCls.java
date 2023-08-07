interface A
{
    void disp();
}

class AnCls{
    public static void main(String args[]){
        A obj=new A()
        {
            public void disp(){
                System.out.println("Anonymous class..");
            }
        };

        obj.disp();
    }
}