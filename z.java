class Pai implements interface1{

  class Inter{
    public void method(){
      System.out.println("Inter");
    }
  }

  private String name;

  public void method(){
    System.out.println("interface1");
  }

  public Pai(){
    this("jairo");
  }

  public Pai(String name){
    this.name = name;
  }
  public void method(int... a){
    System.out.println(a[0]);
  }
}
interface interface1{
  void method();
}

enum enum1{
  A, B, C;
}

interface interface2{
  default void method(){
    System.out.println("interface2");
  }
}

interface interface3{
  default void method(){
    System.out.println("interface3");
  }
}

class class3 implements interface2, interface3{
 @Override
  public void method(){
    interface2.super.method();
    interface3.super.method();
  }
}
public class z{
  public static void main(String[] args){
    Pai p = new Pai();
    Pai.Inter i = p.new Inter();

    interface1 i1 = new Pai();
    interface1 i2 = new interface1(){
      public void method(){
        System.out.println("interface2");
      }
    };

    enum1 e = enum1.A;

    interface1 soma = () -> System.out.println("soma");
    interface1 mult = () ->{ 
      System.out.println("mult");
      System.out.println("mult");
    };
    soma.method();
    mult.method();
  }
}