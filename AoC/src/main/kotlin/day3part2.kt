import java.io.File
import java.util.*
var parsed_input_queue = LinkedList<List<Int>>()
var toRemove = LinkedList<List<Int>>()
fun remove(){
    parsed_input_queue.removeAll(toRemove)
    toRemove.clear()
}
fun day3part2() {
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

    var oxygen = ""

    while (day3input.hasNext()) {
        if (day3input.hasNextLine()) {
            input_queue.add(day3input.next())
        }
    }
    for (strings in input_queue) {
        parsed_input_queue.add(strings.map { it.toString().toInt() })
    }
    // to find gamma and epsilon rates
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
    var epsilon = "";
    if (pos1one > pos1zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    };
    if (pos2one > pos2zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos3one > pos3zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos4one > pos4zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos5one > pos5zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos6one > pos6zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos7one > pos7zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos8one > pos8zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos9one > pos9zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos10one > pos10zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos11one > pos11zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }
    if (pos12one > pos12zero) {
        gamma += "1"
        epsilon += "0"
    } else {
        gamma += "0"
        epsilon += "1"
    }

    var oxygen_pos1one = 0
    var oxygen_pos1zero = 0

    //to find oxygen generator rating
    /*
    find most common for index one by using a loop similar to the gamma and epsilon loops
    THIS TIME, everything else can go inside of an if statement and/or in some other loop
     */
    // for currentString[0]. We're needing to drop stuff from the input queue, so I made a new variable

    for (currentString in parsed_input_queue){
        if (currentString[0] == 1) oxygen_pos1one += 1
        else oxygen_pos1zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos1one >= oxygen_pos1zero){
            if (currentString[0] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[0] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos1one >= oxygen_pos1zero){
        oxygen += "1"
    }
    else oxygen += "0"

    // for currentString[1], can't cheat here, so we have to basically copy & paste methods from the gamma/epsilon thing

    var oxygen_pos2one = 0
    var oxygen_pos2zero = 0

    var oxygen_pos3one = 0
    var oxygen_pos3zero = 0

    var oxygen_pos4one = 0
    var oxygen_pos4zero = 0

    var oxygen_pos5one = 0
    var oxygen_pos5zero = 0

    var oxygen_pos6one = 0
    var oxygen_pos6zero = 0

    var oxygen_pos7one = 0
    var oxygen_pos7zero = 0

    var oxygen_pos8one = 0
    var oxygen_pos8zero = 0

    var oxygen_pos9one = 0
    var oxygen_pos9zero = 0

    var oxygen_pos10one = 0
    var oxygen_pos10zero = 0

    var oxygen_pos11one = 0
    var oxygen_pos11zero = 0

    var oxygen_pos12one = 0
    var oxygen_pos12zero = 0

    for (currentString in parsed_input_queue){
        if (currentString[1] == 1) oxygen_pos2one += 1
        else oxygen_pos2zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos2one >= oxygen_pos2zero){
            if (currentString[1] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[1] == 1) {
            toRemove.add(currentString)
            }
    }
    remove()

    if (oxygen_pos2one >= oxygen_pos2zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[2] == 1) oxygen_pos3one += 1
        else oxygen_pos3zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos3one >= oxygen_pos3zero){
            if (currentString[2] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[2] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos3one >= oxygen_pos3zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[3] == 1) oxygen_pos4one += 1
        else oxygen_pos4zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos4one >= oxygen_pos4zero){
            if (currentString[3] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[3] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos4one >= oxygen_pos4zero){
        oxygen += "1"
    }
    else oxygen += "0"

    for (currentString in parsed_input_queue){
        if (currentString[4] == 1) oxygen_pos5one += 1
        else oxygen_pos5zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos5one >= oxygen_pos5zero){
            if (currentString[4] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[4] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos5one >= oxygen_pos5zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[5] == 1) oxygen_pos6one += 1
        else oxygen_pos6zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos6one >= oxygen_pos6zero){
            if (currentString[5] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[5] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos6one >= oxygen_pos6zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[6] == 1) oxygen_pos7one += 1
        else oxygen_pos7zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos7one >= oxygen_pos7zero){
            if (currentString[6] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[6] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos7one >= oxygen_pos7zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[7] == 1) oxygen_pos8one += 1
        else oxygen_pos8zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos8one >= oxygen_pos8zero){
            if (currentString[7] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[7] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos8one >= oxygen_pos8zero){
        oxygen += "1"
    }
    else oxygen += "0"


    for (currentString in parsed_input_queue){
        if (currentString[8] == 1) oxygen_pos9one += 1
        else oxygen_pos9zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos9one >= oxygen_pos9zero){
            if (currentString[8] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[8] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos9one >= oxygen_pos9zero){
        oxygen += "1"
    }
    else oxygen += "0"

    for (currentString in parsed_input_queue){
        if (currentString[9] == 1) oxygen_pos10one += 1
        else oxygen_pos10zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos10one >= oxygen_pos10zero){
            if (currentString[9] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[9] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos10one >= oxygen_pos10zero){
        oxygen += "1"
    }
    else oxygen += "0"

    for (currentString in parsed_input_queue){
        if (currentString[10] == 1) oxygen_pos11one += 1
        else oxygen_pos11zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos11one >= oxygen_pos11zero){
            if (currentString[10] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[10] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos11one >= oxygen_pos11zero){
        oxygen += "1"
    }
    else oxygen += "0"

    for (currentString in parsed_input_queue){
        if (currentString[11] == 1) oxygen_pos12one += 1
        else oxygen_pos12zero += 1
    }

    for (currentString in parsed_input_queue){
        if (oxygen_pos12one >= oxygen_pos12zero){
            if (currentString[11] == 0) {
                toRemove.add(currentString)
            }
        }
        else if (currentString[11] == 1) {
            toRemove.add(currentString)
        }
    }
    remove()

    if (oxygen_pos12one >= oxygen_pos12zero){
        oxygen += "1"
    }
    else oxygen += "0"



    println("oxygen generator rating is equal to: " + oxygen.toInt(2))
    println("CO2 scrubber rating is equal to: " + oxygen.toInt(2).inv())
    println("life support rating is equal to: " + oxygen.toInt(2) * oxygen.toInt(2).inv())
    println("gamma is equal to: " + gamma.toInt(2))
    println("epsilon is equal to: " + epsilon.toInt(2))
    println("power consumption is equal to: " + (epsilon.toInt(2) * gamma.toInt(2)))

}
