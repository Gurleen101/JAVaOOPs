class Student{
    int age;
    String name;
    public void printInfo(){
        System.out.println(age);
        System.out.println(name);
    }
    Student(int age, String name){
        this.name= name;
        this.age=age;
        System.out.println("constructor called");
    }
}
public class constructor {
    public static void main(String[] args) {
        Student s1= new Student(12,"arman");
        
        s1.printInfo();
    }
    
}
