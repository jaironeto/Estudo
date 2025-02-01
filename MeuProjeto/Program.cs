class Program{
  public static void Main(){
    Class1 obj = new Class1("name"){prop1 = "ford"};

    var obj2 = new {name = "ford", vacilidade = "mega"};

    Class2<string> obj3 = new Class2<string>("jairo");
    
  }
}

class Class2<T>{
  public T name;

  public Class2(T name){
    this.name = name;
  }
}
class Class1(string a){

  private string[] obj = new string[10];

  public string this[int index]{
    get{
      return obj[index] ;
    }

    set{
      obj[index] = value;
    }
  }
  public required string prop1 {get; set;} = a;

  public void method1(params string[] i){

  }
}