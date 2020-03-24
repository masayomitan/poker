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
  int[] orderedRanks = new int[5];
  boolean flush=true, straight=false;
  int sameCards=1,sameCards2=1;
  int index=0;
  int topStraightValue=0;

  for (int x=0; x<=13; x++)
  {
    ranks[x]=0;
  }
  for (int x=0; x<=4; x++)
  {
    ranks[ cards[x].getRank() ]++;
  }
  for (int x=0; x<4; x++)
  {
    if ( cards[x].getSuit() != cards[x+1].getSuit() )
        flush=false;
  }

  for (int x=13; x>=1; x--)
  {
    if (ranks[x] > sameCards)
    {
      if (sameCards1 !=1 )
     {
      sameCards2 = sameCards;
      smallGroupRank = largeGroupRank;
     } 
     sameCards = ranks[x];
     largeGroupRank = x;
  } else if (ranks[x] > sameCards2)
  {
    sameCards2 = ranks[x];
    smallGroupRank = x;
  }
}


