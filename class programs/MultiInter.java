interface Flying
{
    void fly();
}
interface Swimming
{
    void swim();
}
class Bird implements Flying, Swimming
{
    @Override
    public void fly()
    {
        System.out.println("the bird is flying");
    }
    public void swim()
    {
        System.out.println("the bird is swimmimg");
    }
}
public class MultiInter
{
    public static void main(String args[])
    {
        Bird bird=new Bird();
        bird.fly();
        bird.swim();
    }
}
