class Student{
    private String name;
    private int age;

    // zero or no parameteriz constructor
    public Student() {
        this(24);
        System.out.println("no parameteriz constructor");
    }

    public Student(String name){
        this.name=name;
        System.out.println("Strung Constructor Called");
    }

    public Student(int age){
        this.age=age;
    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void disp(){
        System.out.println(this.name+" "+this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

public class DemoThis {
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
