public class Generic_method {

    public static <T> void Showdata(T data){

        System.out.println(data);

    }



    public static void main(String[] args){


        Showdata("Cedee");

        Showdata(452);
        Showdata(123456);



    }
}
