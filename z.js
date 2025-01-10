const prm = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        resolve('ok')
    }, 1000)
})

const prm2 = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        resolve('ok2')
    }, 1000)
})

prm.then( (value) =>{
    console.log(value)
    return prm2
}).then( (value) =>{
  console.log(value)
});

(function(a){
  console.log(a);
})("jairo");

function* gen(){
  var i = 0;

  while(i < 10){
    yield i++;
  }
}

var iterator = gen();

for(let i of iterator){
  console.log(i);
}

function teste(name1, name2, name3){
  this.name1 = name1
  this.name2 = name2
  this.name3 = name3;
  this.func = function(){
    console.log(this.name1 + this.name2 + this.name3);
  }
}

var a = new teste('jairo', 'silva', 'santos');
console.log(a.func());

var obj = {
  name: "jairo",
  name2: "marco",
  func(){
    console.log(this.name + this.name2);
  },
  func2: function(){
    this.func();
  }
}

obj.func2();

var matriz = new Array(30);

class MyClass{
  #privateName1;
  constructor(name){
    this.name = name;
    this.#privateName1 = name;
  }
  
  get privateName1(){
    return this.#privateName1;
  }

  set privateName1(name){
    this.#privateName1 = name;
  }

  func(){
    console.log(this.#privateName1);  }
}

var obj = new MyClass('jairo222222222222222');
obj.func();

console.log(obj.privateName1);
obj.privateName1 = 'marco';
console
console.log(obj.privateName1);

class Filho extends MyClass{
  constructor(name){
    super(name);
  }

  func(...args){
    super.privateName1 = "ionelle"
   return super.privateName1 + args;
  }
}

var obj = new Filho('vrum');
console.log(obj.func(2,3,4));

Filho.prototype.func2 = function(){
  console.log('aaaa');
}

obj.func2();

var obj = {
  name1: "senna",
  get name(){
    return this.name1;
  },
  set name(name){
    this.name1 = name;
  }
}

console.log(obj.name);

class Myclass{
  constructor(name){
    this.name = name;
    this.func = function(){
      return this.name;
    }
  }
}

var obj = new Myclass('daiane');
console.log(obj.func());
var dinamico = "ts1";

var obj = {
  name1: "ayrton",
  [dinamico]: "senna"
}

console.log(obj[dinamico]);

class MyClass2{
  constructor(name){
    this[dinamico] = name;
  }
}

var obj = new MyClass2('dinamico class');
console.log(obj[dinamico]);