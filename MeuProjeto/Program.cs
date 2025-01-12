using System;

class Program 
{
  public static async Task Main(string[] args)
  {
    Class2 p2 = new Class2();
    Class1 p1 = new Class1();

    p1.method();
    p2.method();
  
  }
}

class Class1{
  public virtual void method(){
    System.Console.WriteLine("Class1");
  }
}
class Class2 : Class1{
  public new void method(){
    base.method();
    System.Console.WriteLine("Class2");
  }
}

struct Pessoa{
  public string name1;

  public Pessoa(string name1){
    this.name1 = name1;
  }
}

class Filho{
  public string Nome { get; set; }
  public string Nome2 { get; set; }

}

class Filho2(string _name){
  public string name = _name; 
}
public record myrecord(string name, int idade);

public record myrecord2(string name, int idade){
  public string name3 {get; set;}
}


public enum FileTipo
{
  Text,
  Image,
  Video,
  Audio
}
