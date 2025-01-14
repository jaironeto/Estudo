
enum DiasDaSemana
{
  Domingo,
  Segunda,
  Terca,
  Quarta,
  Quinta,
  Sexta,
  Sabado
}

class Program
{
  static async Task Main()
  {
    Class4 obj = new Class4();
    System.Console.WriteLine(Class4.nome);
  }
}

static class Class6{
  public const string name = "vitor";
  public static readonly string name2 = "marta";

  static Class6(){
    Class6.name2 = "jairo";
  }

}

class Class4{
  public const string nome = "aviao";
  public virtual void method(){
    Console.WriteLine("jairo");
  }
}
abstract class Class3 : Class4{
  public abstract void methodAbstract();
  public override abstract void method();

}
class Class2{
  public (string, string) method(){
    return ("jairo3", "vrum");

  }
}
record Record1(string nome){
  public string nome2 { get; set; }
}

class Class1(string nome)
{
  public string nome { get; set; }
  public string nome2 = nome;
}