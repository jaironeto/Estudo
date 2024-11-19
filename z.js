function myConstrutor(name1, name2){
  this.name1 = name1;
  this.name2 = name2;
  this.func = function(){
    console.log(this.name1 + this.name2);
  }
}