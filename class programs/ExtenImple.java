interface Vehicle
{
    void start();
    void stop();
}
interface Car extends Vehicle
{
    void honk();
}
class Sedan implements Car
{
    public void start()
    {
        System.out.println("Sedan star");
    }
    public void stop()
   {
      System.out.println("sedan stops");
   }
  public void honk()
 {
    System.out.println("sedan honks");
 }
}
public class ExtenImple
{
   public static void main(String args[])

 {
    Sedan mySedan=new Sedan();
    mySedan.start();
 }
}
