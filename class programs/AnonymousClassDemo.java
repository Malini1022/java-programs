public class AnonymousClassDemo
{
    interface Greeting
    {
        void greet();
    }
    public static void main(String arg[])
    {
        Greeting GreetingInstance = new Greeting()
        {
            @Override
            public void greet()
            {
                System.out.println("hello, world!");
            }
        };
        GreetingInstance.greet();
    }
}