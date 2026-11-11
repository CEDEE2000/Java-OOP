public class student <T,U>{

  private   U age;
  private   T name;


    public student (U age, T name){


         this.age = age;
         this.name = name;
    }


    public U getAge(){

        return age;

    }


    public T getName(){

        return name;

    }





}




class Main2{

    public static  void main(String[] args){

        student<String, Integer>  Student = new student<>(12,"cedee");


     System.out.println(Student.getAge() + ", "  +  Student.getName());


    }



}