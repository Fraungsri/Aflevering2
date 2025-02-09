open class Computer(val model: String, val price: Double, val quantity: Int) {

    fun openComputer(){
        println("Computer open")
    }

    fun closeComputer(){
        println("Computer closed")
    }

}

class Laptop(model: String, price: Double, quantity: Int, batteryCapacity: Int): Computer(model, price, quantity){

    fun showBatteryLife(){
        println("Battery on 90%")
    }
}

class Smartphone(model: String, price: Double, quantity: Int, val brand: String): Computer(model, price, quantity){

    fun sendMessage(){
        println("Hello")
    }
}
