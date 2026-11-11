import java.util.regex.*;


public class if_else_regex {
    public static void main(String[] args){

   String text =  " i am learning  java badly  in this era i am not giving  up ";



        Pattern p = Pattern.compile("i\\s*am\\s*not\\s*giving\\s*up\\s*");
        

        Matcher m = p.matcher (text);


        boolean mfound = m.find();

        if(mfound){


            System.out.println("  found  ");
        }else{



            System.out.println(" is not found ");
        }


    }
}
