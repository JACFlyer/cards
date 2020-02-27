package edu.cnm.deepdive.model;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/** Creates an array of 52 cards, and initiates random shuffle.*/
public class Deck  {

  private List<Card> cards;
  private List<Card> dealt;


  public Deck() {
    cards = new ArrayList<>();
    dealt = new LinkedList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }
  }

public Card deal()  {
    Card card = cards.isEmpty() ? null : cards.remove(0);
  if (card != null) {

    dealt.add(card);
  }
  return card;
}

public void shuffle(Random rng) {
  gather();
  Collections.shuffle(cards, rng);
}

  private void gather() {
    cards.addAll(dealt);
    dealt.clear();
  }

  public int remaining() {
    return cards.size();
}

public int dealt() {
    return cards.size();
}



  @Override
  public String toString() {
    return cards.toString();
  }


  public void sort(boolean gather) {
    if (gather) {
      gather();
    }
    cards.sort(null);
  }

}
