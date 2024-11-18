class myclass{
  static campo1;

  static methodo(){
    return this.campo1;
  }

  static{
    myclass.campo1 = "jairo";
  }
}

console.log(myclass.methodo())