
class Car{
  #name;
  #idade;

  constructor(name, idade){
    this.#idade = idade;
    this.#name = name;
  }
  get func2(){
    return this.#name;
  }
  set func2(value){
    this.#name = value
  }
}

const obj = new Car("jairo", 24);
console.log(obj.func2)
obj.func2 = "marcos"
console.log(obj.func2)
