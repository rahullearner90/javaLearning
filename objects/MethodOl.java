class Calculator{
    
    public int sum(int a,int b){
        int rs=a+b;
        return rs;
    } 
    public int sum(int a,int b,int c){
        int rs=a+b;
        return rs;
    } 
    public int sum(int a,int b,int c,int d){
        int rs=a+b;
        return rs;
    } 
}
public class MethodOl {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int res=c1.sum(2, 3);
        System.out.println(res);
        res=c1.sum(2, 3,4);
        System.out.println(res);
        res=c1.sum(2, 3,4,5);
        System.out.println(res);
    }
}
