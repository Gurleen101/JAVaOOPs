abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Eats");
    }
    Animal(){
        System.out.println("Is an animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }

}
public class abstraction{
    public static void main(String[] args){
        Horse horse1=new Horse();
        horse1.eat();
        horse1.walk();
    }

}