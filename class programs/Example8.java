public class Example8
{
    public void modifyValue(int value)

    {
        value=value + 10;
        System.out.println("Inside method:" + value);
    }
    public static void main(String args[])
    {
        int originalvalue = 10;
        Example8 example = new Example8();
        System.out.println("Before method call:" + originalvalue);
        example.modifyValue(originalvalue);
        System.out.println("after method call:"  +originalvalue);
    }
}