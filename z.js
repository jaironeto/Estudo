class myClass{
  #campoPrivado = 0;

  constructor(idade, profissao){
    this.idade = idade;
    this.profissao = profissao;
  }

  get func(){
    return this.#campoPrivado;
  }

  set func(value){
    this.#campoPrivado = value;
  }


}

var obj = new myClass(24, "programador");
obj.func = 30
console.log(obj.func);