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

  func(){
    console.log(this.#privateName1);  }
}

var obj = new MyClass('jairo222222222222222');
obj.func();