class Teste{
  constructor(){
    this.func = function(){
      console.log("Teste func");
    }

    this.a = arguments[0];
  }
}

var obj = new Teste("vrum");
obj.func(); // Teste func
console.log(obj.a) // undefined