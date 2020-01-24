package edu.cnm.deepdive.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {

  static final Object[][] cardData = {
      {Suit.CLUBS, Rank.ACE},
      {Suit.DIAMONDS, Rank.TWO},
      {Suit.HEARTS, Rank.THREE}

  };

  @Test
  void getSuitplus() {
    for (Object[] testCase : cardData) {
      Card c = new Card((Suit) testCase[0], (Rank) testCase[1]);
      assertEquals(testCase[0], c.getSuit());


    }
  }
  @Test
  void getSuit() {
    Card c1 = new Card(Suit.CLUBS, Rank.ACE);
    Card c2 = new Card(Suit.DIAMONDS, Rank.TWO);
    Card c3 = new Card(Suit.HEARTS, Rank.THREE);
    assertEquals(Suit.CLUBS, c1.getSuit());
    assertEquals(Suit.DIAMONDS, c2 .getSuit());
    assertEquals(Suit.HEARTS, c3 .getSuit());
  }

  @Test
  void getRank() {
    for (Object[] testCase : cardData) {
    Card c = new Card((Suit) testCase[0], (Rank) testCase[1]);
    assertEquals(testCase[1], c.getRank());

  }
  }

  @Test
  void testHashCode() {
    for (Object[] testCase : cardData) {
    Card c1 = new Card((Suit) testCase[0], (Rank) testCase[1]);
    Card c2 = new Card((Suit) testCase[0], (Rank) testCase[1]);
    assertEquals(c1.hashCode(), c2.hashCode());
  }
  }

  @Test
  void testEquals() {
    Card prev = null;
    for (Object[] testCase : cardData) {
    Card c1 = new Card((Suit) testCase[0], (Rank) testCase[1]);
    Card c2 = new Card((Suit) testCase[0], (Rank) testCase[1]);
    assertEquals(c1, c2);
    assertNotEquals(c1, prev);
    prev = c1;
  }
  }
}