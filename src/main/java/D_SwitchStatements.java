public class D_SwitchStatements {

  public static void main(String[] args) {

    //
    // Switch Statement 1
    //

    // Voeg aan onderstaand switch statement de juiste cases toe. Vergeet ook niet op de juiste plekken een `break` toe te voegen.
    int y = 1;
    switch (y) {
      case 1:
        System.out.println("=one");
        break;
      case 2:
        System.out.println("=two");
        break;
      default:
        System.out.println("!=one && !=two");
        break;
    }


    //
    // Switch Statement 2
    //

    // Coca-Cola maakt Cola, Fanta en Sprite
    // PepsiCo maakt Pepsi,7Up en Mountain Dew
    // Implementeer een switch statement dat, gegeven het drankje, het merk print.
    // Bij geen resultaat print het statement "onbekend".
    String drink = "Fanta";

    switch (drink){
      case "Cola":
      case "Fanta":
      case "Sprite":
        System.out.println("Coca-cola");
        break;
      case "Pepsi":
      case "7up":
      case "Mountain Dew":
        System.out.println("PepsiCo");
        break;
      default:
        System.out.println("Onbekend");
        break;
    }
  }
}
