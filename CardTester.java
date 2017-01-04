public class CardTester{
  
  
  public static void main(String[] args){
    
    Card c= new Card();
    
    c.setColor("black");
    c.setSuit("clubs");
    c.setRank('k');
    //set suit
    //set rank
      System.out.println(c.toString());
    //print out card
      
     Card c2= new Card();
    
    c.setColor("black");
    c.setSuit("spades");
    c.setRank('4');
          System.out.println(c.toString());

    //set suit
    Card c3= new Card();
    
    c.setColor("red");
    c.setSuit("heart");
    c.setRank('k');
          System.out.println(c.toString());

     Card c4= new Card();
    
    c.setColor("red");
    c.setSuit("diamond");
    c.setRank('k');
          System.out.println(c.toString());

               Card c5= new Card();
    
    c.setColor("black");
    c.setSuit("spade");
    c.setRank('Q');
    
    
    
            System.out.println(c.toString());

    }
  
  
}