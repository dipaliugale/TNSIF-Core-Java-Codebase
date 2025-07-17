function rollDice() {
  const rolls = [];
  let max = 0;
  let winner = [];

  for (let i = 1; i <= 4; i++) {
    const value = Math.floor(Math.random() * 6) + 1;
    rolls.push(value);
    document.getElementById(`dice_${i}`).src = `dice${value}.png`;

    if (value > max) {
      max = value;
      winner = [i];
    } else if (value === max) {
      winner.push(i); // Tie
    }
  }

  const result = document.getElementById("result");
  result.className = ""; // reset

  if (winner.length === 1) {
    result.textContent = `🏆 Player ${winner[0]} Wins!`;
    result.classList.add("winner");
  } else {
    result.textContent = `🤝 It's a Draw between Players: ${winner.join(", ")}`;
  }
}


