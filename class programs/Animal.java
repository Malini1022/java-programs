class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("dog barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}
public class Dynamicdispatch
{
    public static void main(String args)
    {
        Animal myAnimal;
        myAnimal=new Dog();
        myAnimal.sound();
        myAnimal=new Cat();
        myAnimal.sound();
    }
}