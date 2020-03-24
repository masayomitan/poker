package javapoker;
public class Hand {
    private Card[] cards;
    private int[] value;

    Hand(Deck d)
    {
        value = new int[6];
        cards = new Card[5];
        for (int x=0; x<5; x++)
        {
            cards[x] = d.drawFromDeck();
        }

        int[] ranks = new int[14];
       
        int[] orderedRanks = new int[5];
        boolean flush=true, straight=false;
        int sameCards=1,sameCards2=1;
        int largeGroupRank=0,smallGroupRank=0;
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
        for (int x=0; x<4; x++) {
            if ( cards[x].getSuit() != cards[x+1].getSuit() )
                flush=false;
        }

        for (int x=13; x>=1; x--)
        {
                 if (ranks[x] > sameCards)
                 {
                     if (sameCards != 1)
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

        if (ranks[1]==1)
        {
            orderedRanks[index]=14;
            index++;
        }

        for (int x=13; x>=2; x--)
        {
            if (ranks[x]==1)
            {
                orderedRanks[index]=x; 
                index++;
            }
        }
        
        for (int x=1; x<=9; x++)
        
        {
            if (ranks[x]==1 && ranks[x+1]==1 && ranks[x+2]==1 && 
                ranks[x+3]==1 && ranks[x+4]==1)
            {
                straight=true;
                topStraightValue=x+4;
                break;
            }
        }

        if (ranks[10]==1 && ranks[11]==1 && ranks[12]==1 && 
            ranks[13]==1 && ranks[1]==1) 
        {
            straight=true;
            topStraightValue=14; 
        }
        
        for (int x=0; x<=5; x++)
        {
            value[x]=0;
        }
        