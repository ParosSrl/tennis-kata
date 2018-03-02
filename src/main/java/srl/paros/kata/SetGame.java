package srl.paros.kata;

import srl.paros.kata.Score;

public class SetGame {
  private final String player1;
  private final String player2;
  private final Score score1;
  private final Score score2;

  public SetGame(String player1, String player2) {
    this(player1, player2, new Score(0), new Score(0));
  }

  private SetGame(String player1, String player2, Score score1, Score score2) {
    this.player1 = player1;
    this.player2 = player2;
    this.score1 = score1;
    this.score2 = score2;
  }

  public void playerOneScore() {
    score1.scorePoint();
  }

  public void playerTwoScore() {
    score2.scorePoint();
  }

  public String score() {
    if (score1.get() == 45) {
      return player1 + " win";
    } else if (score2.get() == 45) {
      return player2 + " win";
    } else if (score1.get() == score2.get() && score1.get() == 40) {
      return "deuce";
    } else {
      return score1.get() + ":" + score2.get();
    }
  }
}
