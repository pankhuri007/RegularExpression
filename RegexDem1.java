import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDem1 {
    public static void main(String[] args){
        int c=0;
        //Pattern p=Pattern.compile("\\s");
        //Pattern p=Pattern.compile("\\S");
        //Pattern p=Pattern.compile("\\d");
        //Pattern p=Pattern.compile("\\D");
        //Pattern p=Pattern.compile("\\w");
        //Pattern p=Pattern.compile("\\W");
        Pattern p=Pattern.compile(".");
        Matcher m=p.matcher("aSd4 #tvt &ujnyb -)(kl");
        while(m.find()){
            c++;
            System.out.println(m.start()+"...."+m.end()+"..."+m.group());
        }
        System.out.println("The total number of occureenece "+c);
    }
}
