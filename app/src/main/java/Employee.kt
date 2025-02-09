// Opgave 1 , bruger var da informationerne skal kunne ændres

class Employee(var firstName: String, var lastName: String, var monthlySalary: Double) {

    init {
        // Sørger for, at monthlySalary ikke er negativ
        if (monthlySalary < 0) {
            monthlySalary = 0.0
        }
}

    // funktion der giver employee 10% lønforhøjelse
        fun giveRaise(){
            monthlySalary *= 1.1
        }

}