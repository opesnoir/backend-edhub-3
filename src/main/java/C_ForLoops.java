public class C_ForLoops {

  public static void main(String[] args) {

    //
    // ForLoops 1
    //

    // Gebruik een for-loop om een count-down te maken. 3...2...1

      for (int i = 3; i > 0 ; i--) {
          System.out.println(i);
      }

      System.out.println("Lift off!");


    //
    // ForLoops 2
    //

    // Bekijk onderstaand voorbeeld:
     for(char c = 'a'; c <= 'z'; c++){
         System.out.println(c);
     }

      for(char C = 'A'; C <= 'Z'; C++){
          System.out.println(C);
      }
    // Dit voorbeeld gebruikt een for loop om door alle characters van a t/m z te loopen.
    // Implementeer 2 for-loops om a t/m z en daarna A t/m Z te printen.


    //
    // ForLoops 3
    //
    // Hieronder zie je een array. We gaan arrays later behandelen, voor nu hoef je maar 3 dingen te weten.
    // 1. De array is een lijstje van nummers
    // 2. Je kunt de lengte van een Array opvragen met de length property (numbers.length)
    // 3. Je kunt een individueel element ophalen met de index (numbers[0] == 4, numbers[1] == 3)
    int[] numbers = {4, 3, 6, 8, 2, 3, 2, 2, 0, 9};

    // Implementeer een for-loop die elk element in de array print.
      for (int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
      }

  }
}
