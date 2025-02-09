import kotlin.math.PI
import kotlin.math.sqrt

// junior kode
open class JuniorShape {
    // Abstrakt superklasse for alle former
    abstract class JuniorShape(val color: String, val isTransparent: Boolean) {
        abstract fun calculatePerimeter(): Double
        abstract fun calculateArea(): Double
    }

    // Circle-klassen med en privat radius
    class Circle(color: String, isTransparent: Boolean, private val radius: Double) : JuniorShape(color, isTransparent) {
        override fun calculatePerimeter(): Double {
            return 2 * PI * radius
        }

        override fun calculateArea(): Double {
            return PI * radius * radius
        }
    }

    // Triangle-klassen med tre private side-længder (a, b, c)
    class Triangle(
        color: String,
        isTransparent: Boolean,
        private val a: Double,
        private val b: Double,
        private val c: Double
    ) : JuniorShape(color, isTransparent) {
        override fun calculatePerimeter(): Double {
            return a + b + c
        }

        override fun calculateArea(): Double {
            val s = (a + b + c) / 2
            return sqrt(s * (s - a) * (s - b) * (s - c))
        }
    }
}