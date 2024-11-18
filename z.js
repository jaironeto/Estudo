
function teste(){
  var index = 0;

  return function(){
    console.log(++index);
  }
}

var funcClosure = teste();

funcClosure();
funcClosure();