public class Lesson2<T> {
    private T Box;

    public  Lesson2(T Box){

        this.Box = Box;
    }


    public void  setBox( T Box){

        this.Box = Box;
    }


    public T getBox(){
        return  Box;
    }

}



class Main1{

  public static  void main(String[] args){



      Lesson2<String>  box1 = new Lesson2<>(" hello ");
      Lesson2<String> box2 = new Lesson2<>("cedee ");


      Lesson2<Integer> box3 = new Lesson2<>(26);


      System.out.println(box1.getBox() + box2.getBox() + box3.getBox());


  }

}