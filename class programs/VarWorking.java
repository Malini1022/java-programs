class VarWorking
{
    static void funMethod(int... a)
    {
        System.out.println("number of arguments:" +a.length);
        for (int i:a)
        System.out.println(i+"");
        System.out.println();
    }
    public static void main(String arg[])
    {
        funMethod(100);
        funMethod(1, 2, 3, 4);
        funMethod();
    }
}