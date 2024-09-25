
class pai{
  constructor(name, idade){
    this.name = name;
    this.idade = idade;
  }

  func(){
    console.log("pai" + `${this.name} is ${this.idade}`)
  }
}

class filho extends pai{
  constructor(name, idade){
    super(name, idade)
  }

  func(){
    console.log("filho" + `${this.name} + ${this.idade}`)
  }
}

var obj = new filho("jairo", 24);

obj.func();