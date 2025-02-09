fun main(){
    val shoe = Shoe("Sneakers", 89.99, 10)
    val tshirt = TShirt( "Pink T-shirt", 13.99, 15)
    val book = Book("How to understand Kotlin", 30.50, 20)

    shoe.identifyProductCategory()
    tshirt.identifyProductCategory()
    book.identifyProductCategory()
}