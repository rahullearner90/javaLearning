class Demo1
{
 void disp(){
    System.out.println("Method of class demo");
 }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
class Demo4 extends  Demo3
{

}
public class Inharmultl {
      public static void main(String[] args) {
        Demo4 d=new Demo4();
        d.disp();
      }
}
