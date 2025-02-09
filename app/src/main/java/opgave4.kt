fun main() {

//junior koden
  /*  val circle = JuniorShape.Circle("Rød", true, 5.0)
    val triangle = JuniorShape.Triangle("Blå", false, 3.0, 4.0, 5.0)

    println("Cirkel - Perimeter: ${circle.calculatePerimeter()}, Area: ${circle.calculateArea()}")
    println("Trekant - Perimeter: ${triangle.calculatePerimeter()}, Area: ${triangle.calculateArea()}")

   */

// Senior koden
val circle = Circle("Grøn", false, 7.5)
val triangle = Triangle("Gul", true, 6.0, 8.0, 10.0)

println("Cirkel - Omkreds: ${circle.calculatePerimeter()}, Areal: ${circle.calculateArea()}")
println("Trekant - Omkreds: ${triangle.calculatePerimeter()}, Areal: ${triangle.calculateArea()}")

//Describe the differences in the the two solutions. What solution do you prefer? Are there concepts you dont understand. If so learn them and explain them.
/*

Det kommer an på hvad man skal bruge koden til og i hvilken sammenhæng. Hvis det er bare for at løse koden hurtig og direkte, så ville jeg foretrække Junior koden da det er nemt og lige til. Men i længere sigt kan det blive roddet.
Dog hvis der er tale om man skal kode med andre og udvikle et større projekt, giver det helt klart mening at bruge senior koden. I senior koden, sørges der for at dokumentere
for hver dele af koden så man forestår hvad der foregår. Hvis der er andre udvikler der skal bruge det. Der også mere robusthed og precision i Senior koden. Da der bruges "Require" i init-blokke, som sikre at parameterne er korrekte og giver mening.
Det gører det også nemmere at debugge og ligge mærke til fejl i koden.


 */
}