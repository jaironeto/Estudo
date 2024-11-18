
var myPromiss = new Promise((resolve, reject)=>{
  setTimeout(()=> console.log("promiss 1"), 20000);
});

var myPromiss2 = new Promise((resolve, reject)=>{
  setTimeout(()=> console.log("promiss 2"), 10000);
})

myPromiss.then(resul =>{
  return myPromiss2;
}).then (resul)