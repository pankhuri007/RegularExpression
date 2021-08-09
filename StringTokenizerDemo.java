import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("Pankhuri Srivastava");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        StringTokenizer s=new StringTokenizer("www.pankuri.com",".");
        while (s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
