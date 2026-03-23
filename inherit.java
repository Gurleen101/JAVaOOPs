class Shape{
    int edges;
}
class Triangle extends Shape{
    String type;

}
public class inherit {
    public static void main(String[] args){
        Triangle t1=new Triangle();
        t1.edges=3;
        t1.type="isosceles";

    }
}
