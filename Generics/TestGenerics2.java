import java.util.ArrayList;

class Student{

}

class Employee{

}
public class TestGenerics2 {
    public static void main(String[] args) {
        ArrayList<Student> ar=new ArrayList<Student>();
        Student s1=new Student();
        Student s2=new Student();
        Employee e1=new Employee();
        ar.add(s1);
        ar.add(s2);
        
        // ar.add(e1);
    }
}
