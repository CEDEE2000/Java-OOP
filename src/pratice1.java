public class pratice1 {

    String value;

    public void setValue(String value){


        this.value = value;

    }


    public String getValue(){


        return value;
    }

}


class Mains{

   public static void main(String[] args) {


       pratice1 box = new pratice1();

              box. setValue("hello");


       System.out.println(box.getValue());


   }



}
