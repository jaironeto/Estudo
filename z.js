var func1 = new Promise((resolve, rejecjt) => {
  setTimeout(() => { resolve("11111") }, 5000);
});
var func2 = new Promise((resolve, rejecjt) => {
  setTimeout(() => { resolve("22222") }, 5000);
});

func1.then(resul => {
  console.log(resul)
  return func2;
}).then(resul2 => {
  console.log(resul2)
})
