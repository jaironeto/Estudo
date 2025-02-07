public class z{
  public static void main(String[] args) {
      Class1 obj = new Class1(20);
      obj.method1();
      obj.method(2);
      obj.method1();

      Class1 ex = new Class1(3);
      Class1.Class2 in = ex.new Class2();
      in.method();
  }
}

class Class1{
  public int idade1;

  public Class1(int idade1){
    this.idade1 = idade1;
  }

  public void method(int idade1){
    this.idade1 = idade1;
  }

  public void method1(){
    Class2 obj = new Class2();
    obj.method();
  }
  class Class2{
    public void method(){
      System.out.println(idade1);
    }
  }
}