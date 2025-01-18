using System;

class Program{
  public static void Main(){
    Class1 obj = new Class1();
    ref int valorRef = ref obj.methodRef();
    System.Console.WriteLine(valorRef);
    valorRef = 33;
    System.Console.WriteLine(valorRef);

    obj.methodRef(ref valorRef);
        System.Console.WriteLine(valorRef);

  }
}
class Class1{
  private int value = 2;
  public ref int methodRef(){
    
    return ref this.value;
  }

  public ref int methodRef(ref int b){
    b += 10;
    return ref b;
  }
}