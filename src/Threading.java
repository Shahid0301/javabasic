import static java.lang.Thread.sleep;
//Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.  ( Thread Control Mechanism concept)

public class Threading extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i!=6){
                System.out.println(i);
            }
            else{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }

        }

        }
}
class MyThread{
    public static void main(String[] args) {
        Threading obj=new Threading();
        obj.start();
    }
}
