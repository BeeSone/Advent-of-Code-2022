import java.io.File
import java.nio.charset.Charset
import java.util.*

/**
 * Introduce Kotlin & Gradle
 */
fun day2() {
    val arrayinput = LinkedList<String>()
    var sexyVar = 0
    var aim = 0
    var horizontalPos = 0
    var depth = 0
    val fullinput = Scanner(File("AOCday2input.txt"))
    while (fullinput.hasNext()) {
        if (fullinput.hasNextLine()) {
            arrayinput.add(fullinput.next())
        }
    }
    while (arrayinput.isNotEmpty()) {
        val strings = arrayinput.poll()
        if (strings == "forward") {
            sexyVar = arrayinput.poll().toInt()
            horizontalPos += sexyVar
            depth += (aim    * sexyVar)
        }
        if (strings == "down") {
            sexyVar = arrayinput.poll().toInt()
            aim += sexyVar
        }
        if (strings == "up") {
            sexyVar = arrayinput.poll().toInt()
            aim -= sexyVar
        }
    }
    println("horizontalPos = $horizontalPos")
    println("depth = $depth")
}