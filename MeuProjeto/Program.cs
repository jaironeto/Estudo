class Program{
  public static void Main(){
    Class1 obj = new Class1(){propriedade1 = "vrum"}; 
  }
}

class Class1{
  public required string propriedade1 { get; set; } 
}