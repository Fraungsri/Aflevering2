//opgave 3
open class Product(var name: String, var price: Double, var quantity: Int) {
    open fun identifyProductCategory(){ // Når der skrives open før funktionen, tillader det os at "override" funktionen
        println("I am a product")
    }
}

class Shoe(name:String, price: Double, quantity: Int) : Product(name, price, quantity){ // subclass skal gave en konstruktør samt kalde på den baseklassens konstruktor for at vise at de har fælles attributer
    override fun identifyProductCategory(){
        println("I am a shoe")
    }
}

class TShirt(name:String, price: Double, quantity: Int) : Product(name, price, quantity){
    override fun identifyProductCategory(){
        println("I am a T-shirt")
    }
}
class Book(name:String, price: Double, quantity: Int)  : Product(name, price, quantity){
    override fun identifyProductCategory(){
        println("I am a book")
    }
}