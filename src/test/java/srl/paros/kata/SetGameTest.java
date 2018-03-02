package srl.paros.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class SetGameTest {
  private SetGame game;

  @BeforeEach
  void beforeEach() {
    this.game = new SetGame("player1", "player2");
  }

  @Test
  void playerOneShouldScore() {
    game.playerOneScore();

    assertThat(game.score()).isEqualTo("15:0");
  }

  @Test
  void playerTwoShouldScore() {
    game.playerOneScore();
    game.playerTwoScore();

    assertThat(game.score()).isEqualTo("15:15");
  }

  @Test
  void playerOneShouldScoreTwice() {
    game.playerOneScore();
    game.playerOneScore();

    assertThat(game.score()).isEqualTo("30:0");
  }

  @Test
  void playerOneShouldScoreTrice() {
    game.playerOneScore();
    game.playerOneScore();
    game.playerOneScore();

    assertThat(game.score()).isEqualTo("40:0");
  }

  @Test
  void playerOneShouldWin() {
    game.playerOneScore();
    game.playerOneScore();
    game.playerOneScore();
    game.playerOneScore();

    assertThat(game.score()).isEqualTo("player1 win");
  }

  @Test
  void bothShouldScoreThreePoints() {
    game.playerOneScore();
    game.playerOneScore();
    game.playerOneScore();

    game.playerTwoScore();
    game.playerTwoScore();
    game.playerTwoScore();

    assertThat(game.score()).isEqualTo("deuce");
  }
}
