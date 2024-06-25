class Base
{
    int x=10;
    void display()
    {
        System.out.println();
    }
}
class Derived extends Base
{
    int y=20;
    void display()
    {
        System.out.println("derived class x:"+ x +",y:"+y);
    }
}
public class Objectslice
{
    public static void main(String args[])
    {
        Base baseRef=new Derived();
        baseRef.display();
        if(baseRef instanceof Derived)
        {
            Derived derivedRef=(Derived) baseRef;
            System.out.println("Derived class x:"+derivedRef.x+",y:"+derivedRef.y);
        }
    }
}
    
