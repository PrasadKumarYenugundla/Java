class A
{
    public void show()
    {
        System.out.println("In Show A");
    }
}
class B extends A
{
    @Override  
    public void show()
    {
        System.out.println("In show B");
    }
}

public class Anno
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }

}