class Student{
    String name;
    int roll_no;
    int Marks;
    float cgpa;
    boolean backlogs;
    void eat(String name ){
        System.out.println(this.name +" is eating." +""+name);
    }
    void sleeping(){
        System.out.println(this.name+" is sleeping.");
    }
    void writing(){
        System.out.println(this.name+" is writing somthing");
    }
    void reading(){
        System.out.println(this.name+" is reading books");
    }
    void print(){
        System.out.println(name+" "+roll_no+" "+Marks+" "+cgpa+" "+backlogs);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rahul";
        s1.roll_no=30;
        s1.Marks=99;
        s1.cgpa=9.9f;
        s1.backlogs=true;
        s1.eat("Guddu");
        s1.writing();
        s1.reading();
        s1.sleeping();
        s1.print();
        Fan f1=new Fan();
        f1.brand="usha";
        f1.color="white";
        f1.no_of_blades=3;
        f1.price=2000;
        f1.starting();
        f1.rotating();
        f1.blowing();
        f1.stoping();
        f1.print();
    }
}

class Fan{
    String brand;
    String color;
    int    no_of_blades;    
    int    price;

    void starting(){
        System.out.println("Fan is starting.");
    }
    void rotating(){
        System.out.println("Fan is rotating..");
    }
    void blowing(){
        System.out.println("Air is blowing.");
    }
    void stoping(){
        System.out.println("Fan is stoping.");
    }
    void print(){
        System.out.println(brand+" "+color+" "+no_of_blades+" "+price);
    }
}