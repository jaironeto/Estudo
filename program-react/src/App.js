import Profile from "./Teste";
import { useState } from "react";

function MyButton({count, onClick}){
  return(
    <button onClick={onClick}>click me {count}</button>
  );
}

export default function App2() {
  const [count, setCount] = useState(0);
  
  function handleClick() {
    setCount(count + 1);
  }

  return(
    <div>
      <MyButton onClick={handleClick} count={count}/>
      <MyButton onClick={handleClick} count={count}/>

    </div>
  );
}

_react