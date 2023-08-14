enum Result{
    PASS,FAIL,NA;
}
class Demo3{
    public static void main(String args[]){
        Result res=Result.PASS;
        switch(res){
            case PASS:System.out.println("Passed!.");
            break;
            case FAIL:System.out.println("Failled!..");
            break;
            case NA:System.out.println("NA..");
            break;
            default:System.out.println("invalid data..");
        }
    }
}