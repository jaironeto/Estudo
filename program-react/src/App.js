/*
      src='https://i.imgur.com/MK3eW3As.jpg'
      '✔
*/
import Profile from "./Teste"

var theme = {
  backgroundColor: "red",
  color: "blue",
}

function Item({name, condicional}){
  return(
    <li>
      {name} {condicional && "✔"}
    </li>
  );
}
export default function App1() {
  return (
    <>
      <section style={theme}>
        <h1>Teste2</h1>
        <Profile />
        <Profile />
        <Item name="jairo" condicional={true} />
        <Item name="marco" condicional={false} />

      </section>
    </>
  );
}
