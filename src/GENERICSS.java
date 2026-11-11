// java Generic

// Generic class
public class GENERICSS <T>{

    T value;

    public void  setValue(T value){

        this.value = value;


    }


    public T getValue(){

        return value;
    }


}


// main class
class Mainss{

  public static void main (String[] args) {

     /// object of string
      GENERICSS<String> box = new GENERICSS<>();

    // object Integer
      GENERICSS<Integer> boxs = new GENERICSS<>();

        // call the string
      box.setValue("Hello cedee ");

      //call the Integer
      boxs.setValue(2478);



      System.out.println("String value  : "+box.getValue() + " : " + " integer vale " + boxs.getValue());
  }

}