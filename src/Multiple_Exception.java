import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_Exception {
    public static void main(String[] args) {
        int a,b;
        int arr[]={1,2,3,4,5},index;
        try(Scanner s=new Scanner(System.in))
        {
            a=s.nextInt();
            b=s.nextInt();
            index=s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);

        }
        catch (ArithmeticException|ArrayIndexOutOfBoundsException| InputMismatchException obj)
        {
            System.out.println(obj.getClass().getName());
        }
    }
}
