class Employee{
    private int empId, salary;
    private String name, gender, address;

    Employee(int empId, int salary, String name, String gender, String address) {
        this.empId=empId;
        this.salary=salary;
        this.name=name;
        this.gender=gender;
        this.address=address;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    

}

// class Calc{
//     private int a,b;

    // default constructor
//     public Calc(){
//         System.out.println("zero parameterized constructor");
//     }

//     // paramertrizes constructor
//     public Calc(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     public int add(int a, int b){
//         this.a=a;
//         this.b=b;
//         return this.a+this.b;
//     }

// }


public class ConstructorInItn {
    public static void main(String[] args) {
        Employee e1=new Employee(01, 10000, "Rahul", "Male", "Ulhasnagar");
        System.out.println("Name:- "+e1.getName()+", Empid:- "+e1.getEmpId()+", Gender:- "+e1.getGender()+", Salary:- "+e1.getSalary()+", Address:- "+e1.getAddress());

        // experiment with constructor
        // Calc c1=new Calc(2, 1);
        // int a=c1.add(5,5);

        // System.out.println(a);
        // Calc c2=new Calc();
        // int b=c2.add(10, 10);
        // System.out.println(b);


    }
    
}
