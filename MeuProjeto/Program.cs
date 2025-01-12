using System;

namespace teste;

class Filho{
  public string Nome { get; set; }
  public string Nome2 { get; set; }

}

class Filho2(string _name){
  public string name = _name; 
}
public record myrecord(string name, int idade);

class Program 
{
  public static async Task Main(string[] args)
  {

    myrecord objrecord = new myrecord("jairo2222222", 25);
    System.Console.WriteLine(objrecord.name);
    
    Filho2 obj2 = new Filho2("vrum");
    System.Console.WriteLine(obj2.name);
    // await Task.Delay(5000);
    System.Console.WriteLine("Hello World!");

    Filho obj = new Filho(){Nome = "jairo", Nome2 = "ionelle"};
    System.Console.WriteLine(obj.Nome);
    System.Console.WriteLine(obj.Nome2);
    var objenum = FileTipo.Text;

    System.Console.WriteLine(objenum);
  
  }
}

public enum FileTipo
{
  Text,
  Image,
  Video,
  Audio
}
