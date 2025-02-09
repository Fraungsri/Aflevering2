fun main(){
    val employee1 = Employee("Selma", "Andersen", 15000.0)
    val employee2 = Employee("Jenny", "Johanson", 20000.0)

    println("First Name: ${employee1.firstName}")
    println("Last name: ${employee1.lastName}")
    println("Montly Salary before raise: ${employee1.monthlySalary}")

    println("First Name: ${employee2.firstName}")
    println("Last name: ${employee2.lastName}")
    println("Montly Salary before raise: ${employee2.monthlySalary}")

    employee1.giveRaise() // giver 10% lønforhøjelse
    employee2.giveRaise()

    println("Monthly Salary after raise: ${employee1.monthlySalary}")
    println("Monthly Salary after raise: ${employee2.monthlySalary}")
}