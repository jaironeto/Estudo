class Program{
  public static void Main(){
    Class1 obj = new Class1();

    name del = obj.method;

    System.Console.WriteLine(del("jairo"));
  }
}
  _
public class Class1{

  private string[] name = new string[10];

  public string this[int index]{
    get{
      return this.name[index];
    }
    set => this.name[index] = value;
  }

  public string method(string i){
    return i + "vrum";
  }
}
public delegate string name(string i);