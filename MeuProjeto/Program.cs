using System;
namespace ProgramNamespace;

class Program{
  public static async Task Main(String[] args){
    
  
    A a = new A();
    System.Console.WriteLine("aqui1 ");
    await a.methodAsync();

  }
}

static class C{
  public static string[] methodExtensao(this string a){
    var i = a.Split(" ");
    return i;
  }
}

class A{

  public async Task methodAsync(){
    await Task.Delay(5000);
        System.Console.WriteLine("aqui2");
  }


  public const string name1 = "vrum";
  public string _name;
  public string name{
    get => this._name;
    set => this._name = value;
  }

  public virtual (string, string) method(){
    return ("jairo", "name1");
  }
}
