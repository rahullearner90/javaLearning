class Student{
    private String name;
    private  int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void show(){
        System.out.println(this.name+" "+this.age);
    }
}

public class EncapDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Rahul");
        s1.setAge(24);
        s1.show();
        Student s2=new Student();
        s2.setName("Tony Stark");
        s2.setAge(25);
        s2.show();
    }
}