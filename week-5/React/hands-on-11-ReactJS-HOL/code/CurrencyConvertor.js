import { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState(0);
  const [euros, setEuros] = useState(0);

  function handleSubmit() {
    setEuros((rupees / 90).toFixed(2));
  }

  return (
    <div>
      <h2>Currency Convertor</h2>
      <input
        type="number"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
        placeholder="Enter amount in Rupees"
      />
      <button onClick={handleSubmit}>Convert</button>
      <p>Euros: {euros}</p>
    </div>
  );
}

export default CurrencyConvertor;