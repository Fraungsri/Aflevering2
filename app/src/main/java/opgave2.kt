fun main(){
    val laptop = Laptop("Macbook pro m2", 2200.99, 15, 100)
    val smartphone = Smartphone("Iphone 16 proMax", 1599.99, 20, "Apple")

    laptop.openComputer()
    laptop.showBatteryLife()

    smartphone.closeComputer()
    smartphone.sendMessage()

}