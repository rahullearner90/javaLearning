interface A{
    int a=10;
    void show();
}

class B implements A
{
    public void show(){
        System.out.println("in show..");
    }
}

class Demo{
    public static void main(String[] args) {
        System.out.println(A.a);
        B obj=new B();
        obj.show();
        
    }
}