package Java8Functions;


@FunctionalInterface
interface A
{
    void show();
}


public class FunctionalInterfaceProg {

    public static void main(String[] args) {

        A obj = new A()
        {
            public void show(){
                System.out.println("In show method");
            }

        };
        obj.show();

    }
}
