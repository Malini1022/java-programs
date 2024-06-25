public class Example {
    public void methodNoParamsNoReturn(){
        System.out.println("this method does no accept arameters and doesnor return a value");
    }
    public static void main(String[] args){
        Example example=new Example();
        example.methodNoParamsNoReturn();//calling method 
    }
}