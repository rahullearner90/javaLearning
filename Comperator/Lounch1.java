import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
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
}



// part of method1
class Alpha implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.age>b.age){
            return 1;
        }else{
            return -1;
        }
    }
}

class Lounch1{
    public static void main(String ars[]){
        Student s1=new Student("Rahul", 24, 99);
        Student s2=new Student("Guddu", 22, 85);
        Student s3=new Student("Sagar", 27, 90);

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        // method1:-
        // Alpha a=new Alpha();
        // Collections.sort(list, a);

        // method2
        Comparator<Student> com=(Student a,Student b)->{
            if(a.marks>b.marks)
            return 1;
            else
            return -1;
        };
        Collections.sort(list, com);

        // method3
        Collections.sort(list,(Student a, Student b)->{
            if(a.marks>b.marks)
            return 1;
            else
            return -1;
        });

        System.out.println(list);
    }
}