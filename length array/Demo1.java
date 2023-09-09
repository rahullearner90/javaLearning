class Calc{
    int sum;
    public int add(int... n){
        for(int v : n){
            System.out.println(v);
            sum+=v;
        }
        return sum;
    }
}
class Demo1{
    public static void main(String args[]){
        Calc obj=new Calc();
        int a=obj.add(2,2,2,2,2);
        System.out.println(a);
    }
}