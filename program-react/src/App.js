/*
      src='https://i.imgur.com/MK3eW3As.jpg'
      '✔
*/
import Profile from "./Teste"

var theme = {
  backgroundColor: "red",
  color: "blue"
}

var name = "jairo"

function Card({children}){
  return(
    <div>
      <p>teste1</p>
      {children}
    </div>    
  )
}

function Teste({condicao = false}){
  var obj = null;
  if(condicao){
    obj = (
    <div>
      <p>is true</p>
    </div>);
  }

  return obj;
}

export default function App1(){
  return(
    <>
      <section className="teste1">
        <h1> {name} teste</h1>
        <Profile/>
        <Profile/>
        <Card>
          <p>vrummm</p>
        </Card>
        <Teste condicao={true}/>
        <Teste condicao={false}/>
        <Teste condicao={true}/>

      </section> 
    </>
  );
}