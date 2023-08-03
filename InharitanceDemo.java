class Human{
    int age;
    void sleep(){
        age=24;
        System.out.println("Human needs sleep");
        System.out.println(age);
    }   
}

class Student extends Human{

}
public class InharitanceDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.sleep();
    }
}
