function func1(){
  var i = 0;

  return function funcInterna(){
    console.log(++i);
  }
}

var teste = func1();

teste();
teste();
teste();