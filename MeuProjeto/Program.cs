class Program
{
  public static void Main()
  {
    System.Console.WriteLine("vrum");

    var i = new[] { new { name = "jairo" } };

    System.Console.WriteLine(i[0].name);

    var obj = new { jairo = "vrum"};

    var nu = 20;

  }
}

public record MyRecord(string name1, string name2);

public record MyRecord2()
{

}

class MyExtensions{

  public string this[int indice]{
      get{
        return "vrum"; _
      }
  }
}