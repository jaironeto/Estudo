
function myClass(name){
  this.name = name
}

var obj = new myClass("jairo");
myClass.prototype.idade = 24;

console.log(obj.idade)