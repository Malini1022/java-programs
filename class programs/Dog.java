interface Animal
{
    void eat();
}
interface Mammal
{
    void sleep();
}
class Dog implements Animal, Mammal
{
    public void eat()
    {
        System.out.println("Dog is eating");
    }
}