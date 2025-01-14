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

    Class1 obj = new Class1("jairo") { nome = "João" };
    System.Console.WriteLine(obj.nome);
    System.Console.WriteLine(obj.nome2);
    DiasDaSemana dia = DiasDaSemana.Segunda;
    System.Console.WriteLine(dia);
    await Task.Delay(3000);
    System.Console.WriteLine("Hello World!");
  }
}

class Class1(string nome)
{
  public string nome { get; set; }
  public string nome2 = nome;
}