public class Generic_method_return_value {

    public static <T> T getValue(T value){

        return value;
    }




    public static void main(String[] args){

      int n =  getValue(2135);
      String ns =  getValue(" a , b , c , d, e, f, g, h");

      
      System.out.println(n);
        System.out.println(ns);




    }


}
