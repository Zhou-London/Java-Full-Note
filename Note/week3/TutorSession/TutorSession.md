# Note for Week 3 Programming tutor session

Jan 27 Mon, Zhouzhou

## Multi polymorphism

Java uses "extends" to inherit from another class.

    public class Circle extends Shape {}

Uses "abstract" in the same way as the "virtual" in C++.

    public abstract class Shape {
        public  calculateArea(){}
    }

Uses "super" to override the constructor.

    public Circle(String color, int r){
        super(color);
        this.r = r;
    }
    
