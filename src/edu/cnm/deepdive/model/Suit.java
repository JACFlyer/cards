package edu.cnm.deepdive.model;

public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  private static final String[] symbols = {"\u2663", "\u2662", "\u2661", "\u2660"};
  private static final Color[] colors = {}
  public String symbol() {Color.BLACK, Color.RED, Color.RED, Color.BLACK};


    return symbols[ordinal()];

  }
// Rank.java
  private static final String[] symbols = {
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K",
  };
  public String symbol() {
    return symbols[ordinal()];

  }

  public Color color() {
    return colors[ordinal()];
  }
  public enum Color {
    RED, BLACK;
  }

}
