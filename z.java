
public class z {

    public static void main(String[] args) {

        Class3 i = new Class3();
        i.method();
        var o = 3;
    }
}
class Class3 implements inter2, inter3{
  public void method(){
    inter2.super.method();
    inter3.super.method();
  }
}
interface inter2{
  default void method(){
    System.out.println("inter2");
  }
}
interface inter3{
  default void method(){
    System.out.println("inter3");
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
