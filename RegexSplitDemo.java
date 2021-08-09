import java.util.regex.Pattern;

public class RegexSplitDemo {
    public static void main(String[] args){
        Pattern p=Pattern.compile("\\s");
        Pattern p1=Pattern.compile("\\.");
        // Pattern p1=Pattern.compile("[.]");
        String[] s2=p1.split("www.pankhuri.com");
        String[] s=p.split("Pankhuri Srivastava");
        for(String s1:s){
            System.out.println(s1);
        }
        for(String w:s2){
            System.out.println(w);
        }
    }
}
