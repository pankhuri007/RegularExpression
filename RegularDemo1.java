import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo1 {
    public static void main(String[] args){
        int c=0;
        Pattern p=Pattern.compile("b");
        Matcher m=p.matcher("bbbbb");
        while(m.find()){
            c++;
            System.out.println(m.start()+"...."+m.end()+"..."+m.group());
        }
        System.out.println("The total number of occureenece "+c);
    }
}
