import java.util.regex.*;

public class Regex {

  public static void main(String[] args) {


   Pattern p = Pattern.compile(" java ");

   Matcher m = p.matcher(" i am learning java ");


   System.out.println(m.find());



  }

}
