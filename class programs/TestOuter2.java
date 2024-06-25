public class TestOuter2
{
    static int data = 30;
    static class LocalInner{
        static void msg()
        {
            System.out.println("data is" +data);
        }
    }
    public static void main(string arg[])
    {
        TestOuter2.Inner.msg();
    }
}