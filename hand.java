package javapoker;
public class Hand {
  private Card[] cards;
  private int[] value;

  Hand(Deck d)
  {
    value = new int[6];
    cards = new Card[5];
    for (int i =0; x<5; x++)
    {
      cards[x] =d.drawFromDeck();
    }
  }
  int[] ranks = new int[14];
  int[]orderedRanks = new int[5];

}
