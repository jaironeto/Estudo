var prom = new Promise((resolve, reject)=>{
    setTimeout(()=>{resolve('done')}, 1000)
})

prom.then((result)=>{
    console.log(result)
})

var array1 = [12,33,2,4]
for (var i of array1){
    console.log(i)
}

var obj1 = {
  name: 'John',
  age: 30,
  city: 'New York'
}

for (var i in obj1){
    console.log(obj1[i])
}