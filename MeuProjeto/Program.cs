﻿
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
    Class7 c7 = new Class7();
    Console.WriteLine(c7.name);
    c7.name = "carro";
    Console.WriteLine(c7.name);

    _

  }
}

class Class7
{
  public string _name = "teste";
  public string name
  {
    private get { return _name; }
    set => _name = value;
  }

}
static class Class6
{
  public const string name = "vitor";
  public static readonly string name2 = "marta";

  static Class6()
  {
    Class6.name2 = "jairo";
  }

}

class Class4
{
  public const string nome = "aviao";
  public virtual void method()
  {
    Console.WriteLine("jairo");
  }
}
abstract class Class3 : Class4
{
  public abstract void methodAbstract();
  public override abstract void method();

}
class Class2
{
  public (string, string) method()
  {
    return ("jairo3", "vrum");

  }
}
record Record1(string nome)
{
  public string nome2 { get; set; }
}

class Class1(string nome)
{
  public string nome { get; set; }
  public string nome2 = nome;
}