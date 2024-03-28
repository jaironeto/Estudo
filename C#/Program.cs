public abstract class Person{
  private string _name;

  public Person(string name){
    this._name = name;
  }

  public string name{
    get => this._name;
    set => this._name = name;
  }

  public abstract string sobrenome {get;}
}

public class Sobre : Person{
  private string _sobrenome;

  public Sobre(string nome, string sobrenome): base(nome){
    this._sobrenome = sobrenome;
  }

  public override string sobrenome {
    get => this._sobrenome;
  }
}