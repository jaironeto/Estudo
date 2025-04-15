var prom = new Promise((resolve, reject)=>{
    setTimeout(()=>{resolve('done')}, 1000)
})

prom.then((result)=>{
    console.log(result)
})