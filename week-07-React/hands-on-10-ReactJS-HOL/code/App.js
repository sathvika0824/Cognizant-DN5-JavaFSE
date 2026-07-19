function App() {
  const offices = [
    { name: 'Skyline Business Center', rent: 55000, address: 'MG Road, Bangalore' },
    { name: 'Tech Park Hub', rent: 72000, address: 'Whitefield, Bangalore' },
    { name: 'Coastal Co-Work', rent: 48000, address: 'Beach Road, Vizag' },
    { name: 'Metro Office Suites', rent: 85000, address: 'Hitech City, Hyderabad' }
  ];

  return (
    <div>
      <h1>Office Space Rentals</h1>
      <img
        src="https://images.unsplash.com/photo-1497366216548-37526070297c?w=400"
        alt="office space"
        width="400"
      />

      {offices.map((office, index) => (
        <div key={index} style={{ marginBottom: '15px' }}>
          <h3>{office.name}</h3>
          <p>Address: {office.address}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            Rent: {office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;