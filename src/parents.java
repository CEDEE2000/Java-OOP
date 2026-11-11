public class parents {


    void flomo(){

        System.out.println(" john");


    }
}


class childs   extends parents{

 // @Override
    void flomos(){


        System.out.println(" dolo ");
    }
}



class Family{

  public static void main(String[] args){

      childs fm = new childs();
    //  childs fm1 = new childs();


     // parents pr1 = new parents();
     // parents pr2 = new parents();



      fm.flomos();
      fm.flomo();



      // pr1.flomos();

      //pr2.flomo();


    }

}