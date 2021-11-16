import java.util.Scanner;

public class Try_Resource {
    public static void main(String[] args) {
        //try with resource
        try(Scanner s=new Scanner(System.in)){
            int i= Integer.parseInt((s.next()));
        }
        catch (Exception obj){
            obj.printStackTrace();
           // System.out.println(obj.toString());
            //System.out.println(obj.getMessage());
            // System.out.println(obj);
        }
        System.out.println("end of the method");
    }
}
