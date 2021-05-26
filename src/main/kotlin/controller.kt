import java.util.*
import kotlin.random.Random.Default.nextInt

//Main controller function
fun main() {
    //simple getter and setter
    val person = Person("Jack", 15)

    println("Greeting before age change:")
    person.greet()
    println()

    person.age = 16
    println("Greeting after age change:")
    person.greet()
    println()

    //accessing field in another class
    println("The counter before incremented:")
    println(person.counter)
    println()

    person.counter += 1
    println("The counter after incremented:")
    println(person.counter)
}