// Creating dead lock senerios

class Library implements Runnable{
    String res1=new String("JAVA");
    String res2=new String("DSA");
    String res3=new String("SQL");

    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT-1")){
            try {
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println(name+" has acuire "+res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println(name+" has acuire "+res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println(name+" has acuire "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Somthing went wrong..");
            }

        }else{
            try{
                Thread.sleep(3000);
                synchronized(res3){
                    System.out.println(name+" has acuire "+res3);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println(name+" has acuire "+res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println(name+" has acuire "+res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Somthing went wrong..");
            }
        }
    }
}

class Demo11{
    public static void main(String args[]){
        Library l1=new Library();

        Thread t1=new Thread(l1);
        Thread t2=new Thread(l1);

        t1.setName("STUDENT-1");
        t2.setName("STUDENT-2");

        t1.start();
        t2.start();
    }
}