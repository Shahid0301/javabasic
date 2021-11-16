import java.lang.InterruptedException;
public class Using_Throws {
    public void m1() throws InterruptedException{
        m2();
    }
    public void m2() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException{
        Using_Throws obj=new Using_Throws();
        obj.m1();
        System.out.println("end of main method");
    }
}

