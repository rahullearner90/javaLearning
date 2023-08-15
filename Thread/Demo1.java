class Demo1{
    public static void main(String args[]){
        System.out.println("Before Changing..");
        System.out.println("Main thread..");
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println(name);
        int priority=t.getPriority();
        System.out.println(priority);

        System.out.println("After Changing..");
        t.setName("Rahul");
        t.setPriority(1);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}