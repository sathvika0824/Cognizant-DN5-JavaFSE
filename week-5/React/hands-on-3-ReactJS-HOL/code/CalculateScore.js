import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = props.total / props.goal;

  return (
    <div className="score-box">
      <h2>{props.name}</h2>
      <h4>{props.school}</h4>
      <p>Total: {props.total}</p>
      <p>Goal: {props.goal}</p>
      <p>Average Score: {average}</p>
    </div>
  );
}

export default CalculateScore;