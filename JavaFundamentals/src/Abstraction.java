public class Abstraction {

    public static void main (String [] args){

        Shape objCircle = new Circle();
        Shape objRectangle = new Rectangle();
        Shape objSquare = new Square();
        Shape objtriangle = new Triangle();

        objCircle.draw();
        objRectangle.draw();
        objtriangle.draw();
        objSquare.draw();
    }
}

abstract class Shape{
    public abstract void draw();
}

class Circle extends Shape{
    //@override
    public void draw(){
        String red = "\u001B[31m";
        System.out.println(red + "Here is Circle!");
    }
}

class Rectangle extends Shape{
    //@override
    public void draw(){
        String blue = "\u001B[34m";
        System.out.println(blue + "Here is Rectangle!");
    }
}

class Square extends Shape{
    //@override
    public void draw(){
        String green = "\u001B[32m";
        System.out.println(green + "Here is Square!");
    }
}

class Triangle extends Shape{
    //@override
    public void draw(){
        String yellow = "\u001B[33m";
        System.out.println(yellow + "Here is Triangle!");
    }
}