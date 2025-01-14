class Class1 {

  constructor(...name1){
    this.name1 = name1[0];
    this.name2 = name1[0] + "name2";
  }

  get f(){
    console.log(this.name1 + " " + this.name2 + " vrum");
  }

  set f(name){
    this.name1 = name
    this.name2 = name + "name2"
  }

}

var o = {
  name1: "jairo",
  name2: "vrum",
  get f(){
    console.log(this.name1 + " " + this.name2 + " vrum");
  },
  set f(name){
    this.name1 = name
    this.name2 = name + "name2"
  }
}

_jav
