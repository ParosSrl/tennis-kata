package srl.paros.kata;

public final class Score {
  private int score;

  public Score(int score) {
    this.score = score;
  }

  public void scorePoint() {
    if (score == 30) {
      score += 10;
    } else if (score == 40) {
      score += 5;
    } else {
      score += 15;
    }
  }

  public int get() {
    return score;
  }
}
