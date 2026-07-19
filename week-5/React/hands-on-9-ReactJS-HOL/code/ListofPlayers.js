function ListofPlayers() {
  const players = [
    { name: 'Rohit', score: 85 },
    { name: 'Virat', score: 92 },
    { name: 'Rahul', score: 45 },
    { name: 'Pant', score: 60 },
    { name: 'Hardik', score: 55 },
    { name: 'Jadeja', score: 75 },
    { name: 'Ashwin', score: 40 },
    { name: 'Bumrah', score: 20 },
    { name: 'Shami', score: 65 },
    { name: 'Siraj', score: 30 },
    { name: 'Kishan', score: 80 }
  ];

  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}

      <h2>Players with score below 70</h2>
      {lowScorers.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}
    </div>
  );
}

export default ListofPlayers;