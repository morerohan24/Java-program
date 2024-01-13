 abstract class Animal{
     abstract public void walk();
     {

    }
}

class Horse extends Animal {
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Wa;ks on 2 legs");
    }
}

public class OOPS{
    public static void main(String args[]){
      Horse horse=new Horse();
      horse.walk();
    }
}