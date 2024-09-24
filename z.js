class myClass{
  
  #idade;
  #profissao;

  constructor(name, idade, profissao){
    this.name = name;
    this.#idade = idade;
    this.#profissao = profissao;
  }

  #func(){
    console.log(this.name + this.#idade + this.#profissao);
  }

  a(){
    this.#func();
  }
}

var obj = new myClass("jairo", 24, "programador");
obj.a();