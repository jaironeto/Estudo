
carro.OtherPerson carrin = new carro.OtherPerson();

System.Console.WriteLine(Person.method());
System.Console.WriteLine(carrin.method());

public class Person{
  public static string method(){
    return "ford";
  }
}

namespace carro {
  public class OtherPerson{
    public string method(){
      return "vrum";
    }
  }
}  