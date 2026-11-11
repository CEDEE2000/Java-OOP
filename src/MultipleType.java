// java Generic

public class MultipleType {

    //Multiple generic type parameters
    public static <T, U> void showDetail(T first, U second){


        System.out.println(first);
        System.out.println(second);

    }



    public static void main(String[] args){





        showDetail("Cedee", 25);
        showDetail(100, 85.5);
    }
}
