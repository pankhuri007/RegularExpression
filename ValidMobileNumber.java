import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {
    public static void main(String  [] args){
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(args[0]);
        if(m.find()&&m.group().equals(args[0])){
            System.out.println("Valid Mobile Number");
        }
        else{
            System.out.println("Invalid Mobile Number");
        }
    }

}
