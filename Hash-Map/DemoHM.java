import java.util.HashMap;
import java.util.LinkedHashMap;

class DemoHM{
    public static void main(String args[]){
     System.out.println("**************");   
        HashMap hm1=new HashMap();
        hm1.put(01,"Rahul");
        hm1.put(02, "Ram");
        hm1.put(03,"Sahil");
        hm1.put(04, "Laptop");
     System.out.println(hm1);

     System.out.println(",,,,,,,,,,,,,,,");
       HashMap hm2=new HashMap();
       hm2.put("name", "Rahul");
       hm2.put("Gender","male");
       hm2.put("college","sst");
       hm2.put("address","Ulhasnagar");
       hm2.put("phone", "poco m2 pro");
     System.out.println(hm2); 
     
     System.out.println(".....................");
       LinkedHashMap hm3=new LinkedHashMap();
       hm3.put("name", "Rahul");
       hm3.put("Roll no","cs22030");
       hm3.put("Gender","male");
       hm3.put("college","sst");
       hm3.put("address","Ulhasnagar");
       hm3.put("phone", "poco m2 pro");
     System.out.println(hm3);


    }
}