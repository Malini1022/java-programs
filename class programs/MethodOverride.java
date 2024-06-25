class Animal
{
    public void makeSound()
    {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal{
    public void makeSound()
    {
        System.out.println("world");
    }
}
class Cat extends Animal{
    public void makeSound()
    {
        System.out.println("meow");
    }
}
public class MethodOverride
{
    public static void main(String args[])
    {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}