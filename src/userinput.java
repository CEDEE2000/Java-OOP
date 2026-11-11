import java.util.regex.*;
import java.util.*;

public class userinput {









    public static void main(String[] args){

      Scanner st = new Scanner(System.in);

      // string
        String text =  "  O          ";

        // ask user for their input

        System.out.println(" complete this spelling ( D__G ) the animal say wuf wuf ");

        String input = st.nextLine();


        // we have to prepare our input and remve white space

        Pattern pattern = Pattern.compile(input, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){


            System.out.println("  wow you won is DOG say wuf wuf ");
        }else{



            System.out.println(" opps you fail try again ");
        }


    }
}
