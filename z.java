
public class z {

    public static void main(String[] args) {

        inter1 i = new inter1() {
            @Override
            public void method() {
                System.out.println("metodo anonimo");
            }
        };

        inter1 soma = () -> {
            System.out.println("teste1");
            System.out.println("teste3");
        };
        inter1 mult = () -> System.out.println("teste2");

        soma.method();

    }
}

interface inter1 {

    void method();
}

class Class2 implements inter1 {

    public int campo;

    public void method() {
        System.out.println("method");
    }

    public void method2() {
        System.out.println("method2");
    }
}

class Extern {

    class Inter {

    }
}

class Class1 {

    private String name;

    public Class1() {
        this("padrao");
    }

    public Class1(String name) {
        this.name = name;
    }

    public void method() {
        System.out.println("method");
    }

    public void method(int i, int... numero) {
        System.out.println("method" + i);
    }

    public void method(int[] i) {
        for (int a : i) {
            System.out.println("method for" + a);
        }
    }
}
