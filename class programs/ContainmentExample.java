class Engine
{
    private String type;
    public Engine(String type)
    {
        this.type = type;
    }
    public String getType()
        {
            return type;
        }
}
class Car
{
    private String model;
    private Engine engine;
    public Car(String model, Engine engine)
    {
        this.model=model;
        this.engine=engine;
    }
    public void displayDetails()
    {
        System.out.println("Car Model:" +model);
        System.out.println("Engine Type:" +engine.getType());
    }
}
 public class ContainmentExample
{
    public static void main(String args[])
    {
        Engine engine=new Engine("v8");
        Car car=new Car("Ford mustang", engine);
        car.displayDetails();
    }
}
