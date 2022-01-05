import java.io.File
import java.util.*

fun day3(){
        /*
        Plan:
        get input into queue
        poll each string and parse them into individual strings
        run loop to check the strings in each position, if strings = 1, pos1num1Inputs += 1
        if strings = 0, pos1num0inputs += 1
        etc. for each thing
       later ToBinary() [figure this out later]
         */
        val day3input = Scanner(File("AOCday3input.txt"))
        var input_queue = LinkedList<String>()
        var parsed_input_queue = LinkedList<List<Int>>()
        var currentBinaryPos = 0

        var pos1one = 0
        var pos1zero = 0
        var pos2one = 0
        var pos2zero = 0
        var pos3one = 0
        var pos3zero = 0
        var pos4one = 0
        var pos4zero = 0
        var pos5one = 0
        var pos5zero = 0
        var pos6one = 0
        var pos6zero = 0
        var pos7one = 0
        var pos7zero = 0
        var pos8one = 0
        var pos8zero = 0
        var pos9one = 0
        var pos9zero = 0
        var pos10one = 0
        var pos10zero = 0
        var pos11one = 0
        var pos11zero = 0
        var pos12one = 0
        var pos12zero = 0

        while (day3input.hasNext()){
                if (day3input.hasNextLine()){
                        input_queue.add(day3input.next())
                }
        }
        for (strings in input_queue) {
                parsed_input_queue.add(strings.map { it.toString().toInt() })
        }
        for (currentString in parsed_input_queue) {
                        if (currentString[0] == 1) pos1one += 1
                        else pos1zero += 1

                        if (currentString[1] == 1) pos2one += 1
                        else pos2zero += 1

                        if (currentString[2] == 1) pos3one += 1
                        else pos3zero += 1

                        if (currentString[3] == 1) pos4one += 1
                        else pos4zero += 1


                        if (currentString[4] == 1) pos5one += 1
                        else pos5zero += 1


                        if (currentString[5] == 1) pos6one += 1
                        else pos6zero += 1

                        if (currentString[6] == 1) pos7one += 1
                        else pos7zero += 1

                        if (currentString[7] == 1) pos8one += 1
                        else pos8zero += 1

                        if (currentString[8] == 1) pos9one += 1
                        else pos9zero += 1

                        if (currentString[9] == 1) pos10one += 1
                        else pos10zero += 1

                        if (currentString[10] == 1) pos11one += 1
                        else pos11zero += 1

                        if (currentString[11] == 1) pos12one += 1
                        else pos12zero += 1
        }
        var gamma = "";
        var epsilon ="";
        if (pos1one > pos1zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        };
        if (pos2one > pos2zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos3one > pos3zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos4one > pos4zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos5one > pos5zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos6one > pos6zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos7one > pos7zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos8one > pos8zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos9one > pos9zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos10one > pos10zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos11one > pos11zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }
        if (pos12one > pos12zero){
                gamma += "1"
                epsilon += "0"
        }
        else {
                gamma += "0"
                epsilon += "1"
        }

        println("gamma is equal to:" + gamma.toInt(2))
        println("epsilon is equal to:" + epsilon.toInt(2))
        println("power consumption is equal to:" + (epsilon.toInt(2) * gamma.toInt(2)))
}