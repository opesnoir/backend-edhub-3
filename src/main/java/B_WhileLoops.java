public class B_WhileLoops {

  public static void main(String[] args) {

    //
    // WhileLoops 1
    //

    int i = 0;
    // Voeg een while loop toe die van 1 tot en met 10 telt.
    //i++ < 10: Dit is een expressie die de waarde van i eerst gebruikt in de vergelijking i < 10, en vervolgens i verhoogt met 1 na de evaluatie van de vergelijking. Dit betekent dat de lus in elke iteratie zal controleren of de huidige waarde van i kleiner is dan 10, en pas daarna i zal verhogen met 1.
    //Dus, als je de lus while (i+1 < 10) zou schrijven, zou dit betekenen dat de lus zal doorgaan totdat i gelijk is aan 8 (omdat i+1 dan gelijk is aan 9, wat kleiner is dan 10). In tegenstelling hiermee zal de lus while (i++ < 10) doorgaan totdat i gelijk is aan 10 (omdat i eerst gecontroleerd wordt op kleiner dan 10, en daarna wordt verhoogd met 1).
    while (i++ < 10){
      System.out.println(i);
    }


    //
    // WhileLoops 2
    //

    int x = 20;
    int y = 3;
    // Voeg een while loop toe zodat onderstaand statement wordt geprint zolang x of y niet kleiner worden dan 1

    while (x > 0 && y > 0){
      System.out.println("Size = " + x-- + " x " + y--);
    }





    //
    // WhileLoops 3
    //

    int smallest = 0;
    int largest = 10;
    int numberOfLoops = 0;
    while(smallest < largest ) {
      // pas de increment en decrement van smallest en largest aan zodat de loop 4x wordt uitgevoerd.
      smallest += 2;
      largest -= 1;
      numberOfLoops++;
    }
    System.out.println(numberOfLoops);
  }
}
