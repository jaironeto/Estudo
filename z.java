
public class z {

    public static void main(String[] args) {
        Inter in = new Inter() {
            @Override
            public void method() {
                System.out.println("jaa");
            }
        };

        in.method();

        Inter an4 = () -> System.out.println("aaa");
        an4.method();

        _

    } // fim main

}

interface Inter {

    void method();
}

class Extern {

    class Intern {

        public void method() {
            System.out.println("class intern");
        }
    }
}

class Class2 {

    public String campo1;
}

class Class1 {

    public Class2 method() {
        Class2 obj = new Class2();
        return obj;
    }
}
