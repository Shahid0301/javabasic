import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patern {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        String target="09876543219 gla912344578990";
        Matcher m=p.matcher(target);
        int ctr=0;
        while (m.find()){
            ctr++;
            System.out.println(m.group());
        }
        System.out.println(ctr);
    }
}
