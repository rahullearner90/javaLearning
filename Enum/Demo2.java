
public class Demo2 {
    enum Weak{
        MON,TUE,WED,THU,FRI,SAT,SUN;
    }
    public static void main(String[] args) {
        Weak week=Weak.MON;
        int index=week.ordinal();
        System.out.println(index);

        Weak ar[]=week.values();
        for(Weak e :ar){
            System.out.println(e+" : "+e.ordinal());
        }
    }
}
