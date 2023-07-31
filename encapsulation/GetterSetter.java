class Student{
    private int rno, age;
    private String name, address;

    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
public class GetterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Setting Values
        s1.setRno(01);
        s1.setName("Rahul");
        s1.setAge(24);
        s1.setAddress("ulhasnagar");
        // Getting Values
        System.out.println(s1.getName());
        System.out.println(s1.getRno());
        System.out.println(s1.getAge());
        System.out.println(s1.getAddress());
    }
    
}
