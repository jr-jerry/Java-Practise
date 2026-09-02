public class ThreadLifeCycle {
    public static void main(String[] args) {
        Thread mainThread_Ref=Thread.currentThread();
        Thread thread_1_Ref=new Thread(
            ()->{
                System.out.println("Bottel Fill Task completed By "+Thread.currentThread().getName());
                System.out.println("Main Thread state "+mainThread_Ref.getState());
            }
        );
        thread_1_Ref.setName("Thread 1 ");

        System.out.println("Thread_1_Ref state : "+thread_1_Ref.getState());

        thread_1_Ref.start();
        System.out.println("Thread_1_Ref state : "+thread_1_Ref.getState());

        try{
            Thread.sleep(4000);
            System.out.print("Thread_1_Ref state : "+thread_1_Ref.getState());

        }catch(InterruptedException e){}
    }
}
