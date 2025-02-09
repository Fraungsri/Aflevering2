import kotlin.math.PI
import kotlin.math.sqrt

// Senior løsningen
/**
 * Abstrakt superklasse for former.
 *
 * @property color Farven på formen.
 * @property isTransparent Angiver om formen er gennemsigtig.
 */
abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

/**
 * Circle-klassen repræsenterer en cirkel med en specifik radius.
 *
 * @property radius Radius af cirklen.
 */
class Circle(
    color: String,
    isTransparent: Boolean,
    private val radius: Double
) : Shape(color, isTransparent) {

    init {
        require(radius > 0) { "Radius skal være større end 0." }
    }

    override fun calculatePerimeter(): Double = 2 * PI * radius

    override fun calculateArea(): Double = PI * radius * radius
}

/**
 * Triangle-klassen repræsenterer en trekant defineret ved sine tre sider.
 *
 * @property a Længden af side a.
 * @property b Længden af side b.
 * @property c Længden af side c.
 */
class Triangle(
    color: String,
    isTransparent: Boolean,
    private val a: Double,
    private val b: Double,
    private val c: Double
) : Shape(color, isTransparent) {

    init {
        require(a > 0 && b > 0 && c > 0) { "Alle sider skal være større end 0." }
        require(a + b > c && a + c > b && b + c > a) { "De angivne sider danner ikke en gyldig trekant." }
    }

    override fun calculatePerimeter(): Double = a + b + c

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}
