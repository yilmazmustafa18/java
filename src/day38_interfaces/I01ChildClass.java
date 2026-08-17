package day38_interfaces;

public class I01ChildClass implements I01_Interface{

    @Override
    public void method2() {
        System.out.println("child class");
    }

    @Override
    public void measureTemp() {
       I01_Interface.super.measureTemp();
        System.out.println(I01_Interface.sayi);
        I01_Interface.measureHeat();

        I01ChildClass obj= new I01ChildClass();
        I01_Interface obj1 = new I01ChildClass();

        I01_Interface.super.measureTemp();
        obj.newMethod2();

    }
    public static void measureHeat(){
        System.out.println("static measureHeat");
    }

    public void newMethod2() {
        System.out.println("child class newMethod ");
    }
}
