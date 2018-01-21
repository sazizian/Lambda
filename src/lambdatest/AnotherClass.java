package lambdatest;

public class AnotherClass {

    public String doSomething(){
        System.out.println("The anotherclass class's name is: "+getClass().getSimpleName());
        return Main.doStringStuff(
                new UpperConcat() {
                    @Override
                    public String upperAndConcat(String s1, String s2) {
                        System.out.println("The anonymous class's name is: "+getClass().getSimpleName());
                        return s1.toUpperCase()+s2.toUpperCase();
                    }
                },"String1","String2"

        );
    }
}
