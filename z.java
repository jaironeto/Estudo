public class z{
  public static void main(String[] args){


    Class1 obj = new Class1(){
      public String campo1 = "mard";

      @Override
      public void method2(){
        System.out.println(this.campo1);
      }
    };

    obj.method2();
  }
}

class Class1{
  public String campo1 = "ford";

  public void method2(){
    this.campo1 = "vrum";
  }
}