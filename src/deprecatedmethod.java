public class deprecatedmethod {

    @Deprecated
    void oldcedee(){


        System.out.println(" he used to  figth to please people ");
    }




}




class   newclass extends deprecatedmethod{


    void newcedee(){


        System.out.println(" he no more figthing to please anyone ");
    }
}




class ok{

    public static  void main(String[] args){


       // deprecatedmethod  oldme =  new deprecatedmethod();


       newclass newme = new newclass();



        newme.oldcedee();
        newme.newcedee();


    }
}