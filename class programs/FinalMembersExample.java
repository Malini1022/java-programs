public class FinalMembersExample
{
    private final int instanceVar;
    public static final int STATIC_VAR =100;
    public FinalMembersExample(int value)
    {
        this.instanceVar = value;
    }
    public final void displayValues()
    {
        System.out.println("Instance Variale:" +instanceVar);
        System.out.println("Static Variable:" +STATIC_VAR);
    }
    public static void main(String args[])
    {
        FinalMembersExample example=new FinalMembersExample(42);
        example.displayValues();
    }
}