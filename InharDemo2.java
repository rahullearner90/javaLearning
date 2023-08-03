
class Human1{
    String name;
    int age;
    {
        name="Rahul kumar";
        age=24;
    }
    public Human1() {
        System.out.println("Constructor method");
    }
    void eat(){
        System.out.println("human eats");
    }
    void information(){
        System.out.println("Name : " + name +", Age : " + age);
    }
}

class Student extends Human1{
    void disp(){
        System.out.println("student method display");
    }
}

class InharDemo2{
    public static void main(String args[]){
        Student s=new Student();
        s.information();
        s.eat();
    }
}