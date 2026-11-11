public class ply {

    void apply(){

        System.out.println(" JOB ready");
    }
}

class user extends ply{

    @Override
    void apply() {
        System.out.println(" name : cedee ");


    }
}


class skill extends ply{


    @Override
    void apply(){

        System.out.println(" BIT");
    }
}




class job{

public static void main(String[] args){
  ply job1 = new user();
  ply job2 = new skill();

  ply job3 = new ply();

  job3.apply();

  job1.apply();
  job2.apply();



}



}