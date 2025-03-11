var obj = new Promise((resolve, reject)=>{
  resolve("teste");
})

obj.then((value)=>{
  console.log(value);
})

function teste(){
  var index = 0;

  return function(){
    console.log(index++);
  }
}

var t = teste();
t();
t();
t();

class MyClass{
  constructor(...name){
    this.name = name[0];
  }
}

var myClass = new MyClass("jairo");
console.log(myClass.name);

function MyConstrutor(name){
  this.name = name;
}

var myConstrutor = new MyConstrutor("jairo");
MyConstrutor.prototype.getName = function(){
  return this.name;
}

console.log(myConstrutor.getName());

var obj = { name: "jairo" };
obj.prototype.prof = "developer";
console.log(obj.prof);

var obj ={
  name: "jairo",
  teste: function(){
    console.log(this.name);
  }
}

_jav