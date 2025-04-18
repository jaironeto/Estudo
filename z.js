function Teste(a){
  this.a = a;
  this.b = function() {
    return this.a;
  }
}

var obj = new Teste(1);
console.log(obj.b()); // 1

Teste.prototype.func = function(){
  return this.a + 3;
}

console.log(obj.func()); // 4