class myClass{
  constructor(idade, profissao){
    this.idade = idade;
    this.profissao = profissao;
  }

  func(){
    console.log(this.idade + " " + this.profissao);
  }
}

var obj = new myClass(24, "programador");

obj.func();