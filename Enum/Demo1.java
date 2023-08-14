enum Weak
{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
class Demo1{

    enum Result{
        PASS,FAIL,NA;
    }
    public static void main(String args[]){
        Weak w=Weak.MON;
        System.out.println(w);
        Result r=Result.PASS;
        System.out.println(r);
    }
}