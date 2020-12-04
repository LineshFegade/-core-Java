package sport;

public class testSports {
   public static void main(String[] args) {
     FootBallPlayer p1=new FootBallPlayer(7,"ronaldo",862,"Portuguese",994);
     BoxingPlayer p2=new BoxingPlayer(4,"Vijender Singh Beniwal",12,"india",190);
     BasketBallPlayer p3=new  BasketBallPlayer(24,"Kobe Bryant",580,"United States",33643);
     System.out.println("\t\t\t*****Player Information*****");
     System.out.println("\t\t\tFootBall Player Info");
     System.out.println(p1);  System.out.println("----------------------------------------------------------------");System.out.println("\t\t\tBoxing Player Info");
     System.out.println(p2);  System.out.println("----------------------------------------------------------------");System.out.println("\t\t\tBasketBall  Player Info");
     System.out.println(p3);  System.out.println("----------------------------------------------------------------");
  }
}
