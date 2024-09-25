
function Car(name, carro){
  this.name = name;
  this.carro = carro;
  this.func = function(){
    console.log(this.name + this.carro)
  }
}

var obj = new Car("jairo", "ford");
obj.func();