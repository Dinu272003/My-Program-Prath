package inheritance.singleinheritance;

class Shape{
    void display(){
        System.out.println("This is a shape..");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Area = πr²");
    }
}
public class SingleInheritance4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();
        circle.area();
    }
}
