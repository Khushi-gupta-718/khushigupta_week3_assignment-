abstract class Shape// It serves as a blueprint for other shapes.
{
    abstract double area();// subclasses must provide their own implementation of the method to calculate the area of the shape.
     
}

class Circle extends Shape
{
    double radius;
    Circle(double  radius)//The constructor takes a radius parameter
    {
          this.radius=radius;
    }
    double area()//overrides the abstract method from Shape
    {
    return Math.PI *radius*radius;
    }

}

class Rectangle extends Shape 
{
    double L ,W;

     Rectangle(double L,double W)
    {
        this.W=W;
        this.L=L;
    }

    double area()
    {
        return L*W;
    }

}

class Triangle extends Shape
{
    double Base;
    Double H;

    Triangle(double Base,Double H)
    {
       this.Base=Base;
       this.H=H;
    }

    double area()
    {
        return 0.5*Base*H;
    }

}



public class CalculateShape 
{
    public static void main(String[] args)
     {
        Shape circle=new Circle(9.0);
        Shape rectangle = new Rectangle(4.0,9.6);
        Shape triangle = new Triangle(6.0,7.6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());

    }
    
}
