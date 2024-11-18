class teste{

  constructor(name1, name2){
    this.name1 = name1;
    this.name2 = name2;
  }
  
  methodo(){
    console.log(this.name1 + " " + this.name2);
  }
}

var obj = new teste("jairo", "ionelle");
obj.methodo();