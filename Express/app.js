const express = require('express');
const router = require("./bird");
const app = express();
const port = 3000;

app.use("/bird", router);

app.get("/", function(req, res, next){
  res.send("home app")
})

app.listen(port, function(){
  console.log("ready")
})