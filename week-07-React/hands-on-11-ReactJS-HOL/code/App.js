import { useState } from 'react';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);
  const [message, setMessage] = useState('');
  const [clicked, setClicked] = useState('');

  function increment() {
    setCount(count + 1);
    sayHello();
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    setMessage('Hello! Counter was incremented.');
  }

  function sayWelcome(name) {
    setMessage(`Welcome ${name}`);
  }

  function handlePress(e) {
    setClicked('I was clicked');
  }

  return (
    <div>
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <p>{message}</p>

      <button onClick={() => sayWelcome('welcome')}>Say Welcome</button>

      <button onClick={handlePress}>OnPress Button</button>
      <p>{clicked}</p>

      <CurrencyConvertor />
    </div>
  );
}

export default App;