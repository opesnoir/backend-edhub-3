public class E_Combining_Bonus {

  public static void main(String[] args) {

    // Hieronder zie je een array. We gaan arrays later behandelen, voor nu hoef je maar 3 dingen te weten.
    // 1. De array is een lijstje van nummers
    // 2. Je kunt de lengte van een Array opvragen met de length property (numbers.length)
    // 3. Je kunt een individueel element ophalen met de index (numbers[0] == 4, numbers[1] == 3)
    int[] numbers = {7,4,1,67,2,4,6,2,345,5,52,1,2415,7,5,178,14,4};

    //
    // Combination 1
    //
    // implementeer een forloop die alle even nummers print. Je gebruikt hiervoor ook een if statement

    //Als je wilt controleren of een getal deelbaar is door 2, moet je de modulus-operator gebruiken met het getal 2 en controleren of het resultaat gelijk is aan 0.
    //Dus in plaats van "(numbers[i] % 2 = 0)" zou je moeten schrijven "(numbers[i] % 2 == 0)". Het dubbele gelijkteken wordt gebruikt om een vergelijking te maken in plaats van een toekenning.
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0){
        System.out.println(numbers[i]);
      }else {
        System.out.println("Het betreft een oneven getal");
      }
    }
// dit is ook mogelijk
/*    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0){
        System.out.println("het betreft een oneven getal");
      } else {
        System.out.println(numbers[i]);
      }
    }*/


    //
    // Combination 2
    //
    // Implementeer een whileloop de nummers in de lijst optelt tot het resultaat groter is dan 400. Bonus, zorg ook dat de index nooit groter kan worden dan de lengte van de array.
    // Je hebt ook een index nodig voor de array (int index = 0;) en een accumulator voor het resultaat (int result = 0;). Deze index en accumulator kun je in de while loop muteren.

    int index = 0;
    int accumulator = 0;
    //add while

    // accumulator += numbers[index]; is een verkorte schrijfwijze van accumulator = accumulator + numbers[index];. Dit betekent dat we de waarde van de huidige accumulator variabele verhogen met de waarde van het element in de lijst dat zich bevindt op de index index. We gebruiken de += operator om deze berekening te maken en de nieuwe waarde toe te wijzen aan de accumulator variabele.

   while (index < numbers.length && accumulator < 400)
     accumulator += numbers[index];
     index++; // update index
    System.out.println(accumulator);

  }
}
