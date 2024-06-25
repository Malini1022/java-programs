interface Animal
{
    void sound();
    void eat();
}
abstract class Dog implements Animal{
    public void sound()
    {
        System.out.println("dog barks");
    }
}
class Labrador extends Dog{
    public void eat()
    {
        System.out.println("labrador eats");
    }
}
public class Partial1
{
    public static void main(String args[])
    {
        Labrador myLabrador=new Labrador();
        myLabrador.sound();
        myLabrador.eat();
    }
}