public class File1{
    public static void main(String[] args){
        Runnable bottelTask=new MyTask();
        Thread t1=new Thread(bottelTask);
        t1.setName("Thread T1");

        t1.start();
    }
}
class MyTask implements Runnable{

    @Override
    public void run() {
        Thread threadRef=Thread.currentThread();
        String threadName=threadRef.getName();

        System.out.println("Bottel fill Task perform by "+threadName);
    }
    
}