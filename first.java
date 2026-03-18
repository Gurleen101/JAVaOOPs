 class Pen {
    String type;
    String color;
     public void write(){
        System.out.println("WRITING");
     }

  public void printcolor(){
    System.out.println(color);

  }   


    
}
public class first{
public static void main (String[] args){
    Pen pen1=new Pen();
    pen1.type="gel";
    pen1.color="blue";
    Pen pen2=new Pen();
    pen2.color="black";
    pen1.write();
    pen1.printcolor();
    pen2.printcolor();


}
}