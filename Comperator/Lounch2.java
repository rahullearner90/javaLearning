import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
    int age,marks;
    String name;
    Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    
    public String toString(){
        return name+" "+marks+"  "+age;
    }

    public int compareTo(Student a){
        if(this.age>a.age)
        return 1;
        else
        return -1;
    }
}

public class Lounch2 {
    public static void main(String[] args) {
        Student s1=new Student("Rahul", 24, 99);
        Student s2=new Student("Guddu", 22, 85);
        Student s3=new Student("Sagar", 27, 90);

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
