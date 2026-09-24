import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args)
    {
        try {
            System.out.println("Outer try block started");
            // Inner try block 1
            try {
                int n = 10;
                int res = n / 0;//Arithmetic Exception
            }catch(NullPointerException e){
                System.out.println("Only Null pointer exception i will handle not Arithmetic ");
            }
            // Inner try block 2
            try {
                String s = null;
                System.out.println(s.length());//NullPointerException
            }
            catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: "+ e.getClass().getName());
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Caught exception in outer try-catch: "+ e);
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues after nested try-catch");
    }
}