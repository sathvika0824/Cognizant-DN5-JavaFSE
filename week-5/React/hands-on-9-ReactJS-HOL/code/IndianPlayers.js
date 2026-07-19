function IndianPlayers() {
  const team = ['Rohit', 'Virat', 'Rahul', 'Pant', 'Hardik', 'Jadeja'];
  const oddPlayers = team.filter((_, index) => index % 2 !== 0);
  const evenPlayers = team.filter((_, index) => index % 2 === 0);

  const T20players = ['Rohit', 'Virat', 'Rahul'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Vihari'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {oddPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Even Team Players</h2>
      {evenPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      {mergedPlayers.map((p, i) => <p key={i}>{p}</p>)}
    </div>
  );
}

export default IndianPlayers;