package Java8Functions;


@FunctionalInterface
interface B{
    void show();
}


public class LambdaExpressionsProg {
    public static void main(String[] args) {

        B obj = ()-> System.out.println("In Show Method");
        obj.show();

    }
}
