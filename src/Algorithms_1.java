import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
public class Algorithms_1 {

  public static void main(String[] args){



      ArrayList<String> names = new ArrayList<String>();


      names.add("cedee");
      names.add("John");
      names.add("blue");



       Collections.swap(names, 0,2);
      Collections.sort(names);


      int index = Collections.binarySearch(names, "cedee");
      System.out.println("cedee is at index: " + index);





      ArrayList<Integer> number = new ArrayList<Integer>();

      number.add(12);
      number.add(85);
      number.add(75);
      number.add(100);

        Collections.shuffle(number);
      System.out.println(number);

      System.out.println(Collections.max(number));



      Iterator<String> x = names.iterator();

      while(x.hasNext()){


          System.out.println(x.next());


      }


      Integer myint = 45;

      String vt = myint.toString();

      String yt ="58";
      int result = Integer.parseInt(yt);
      
      

      System.out.println("string "+vt + " Integer " + yt);


      Double mydouble =40.0;

      Float myfloat = 1245f;


      System.out.println("myint " + myint.intValue());

      System.out.println("mydouble " + mydouble);
      System.out.println(" myfloat " + myfloat.intValue());




  }





  }



