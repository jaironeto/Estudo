public class z{
  public static void main(String[] args){
    Class1 obj = new Class1();
    obj.method2();
  }
}

class Class1{
  public String campo1 = "ford";

  class Class2{
    public void method(){
      System.out.println(campo1);
    }
  }

  public void method2(){
    Class2 obj = new Class2();
    this.campo1 = "vrum";
    obj.method();
  }
}