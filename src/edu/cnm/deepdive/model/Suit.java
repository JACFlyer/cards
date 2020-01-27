package edu.cnm.deepdive.model;

/**
 * Encapsulates the suits of standard playing cards.  The enum includes {@Link #symbol()}symbol and
 * {@Link #color() } color methods, to return the immutable Unicode symbol and {@Link Color} Color
 * enum instance of any suit.
 */
public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;
  private static final String[] symbols = {"\u2663", "\u2662", "\u2661", "\u2660"};
  private static final Color[] colors = {Color.BLACK, Color.RED, Color.RED, Color.BLACK};

  /**
   * Returns Unicode playing card symbol for this suit.
   *
   * @return Unicode symbol.
   */
  public String symbol() {
    return symbols[this.ordinal()];

  }

  /**
   * Returns {@Link Color} instance value for this suit.
   * @return {@Link Color} value.
   */
  public Color color() {
    return colors[ordinal()];
  }

  /**
   * Encapsulates the two possible colors (red &amp; black) of playing card suits.
   */
  public enum Color {
    RED, BLACK;
  }
}

