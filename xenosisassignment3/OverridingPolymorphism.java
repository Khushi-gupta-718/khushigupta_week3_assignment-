class Vehicle
{
    
    void Display()
    {
        System.out.println("vehicle class");
    }
}

class Car extends Vehicle
{
    void Display()
    {
        System.out.println("car class extends vehicle");
    }
} 

class Bike extends Vehicle
{
     void Display()
     {
        System.out.println("bike class extends vehicle");
     }
}



class OverridingPolymorphism
{
    public static void main(String[] args) 
    {
        Vehicle c1 = new Car();
        c1.Display();

        Vehicle b1 = new Bike();
        b1.Display();
    }
}