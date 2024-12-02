import java.io.File

fun main() {
//    val input = "day-2/sample.txt"
    val input = "day-2/input.txt"
    val lines = File(input).readLines()

    var cnt = 0
    for(line in lines) {
        val arr = line.split(" ").map { it.toInt() }

        if(arr[0] < arr[1]) {
            if(inc(arr)) {
                cnt++
            }
        } else {
            if(dec(arr)) {
                cnt++
            }
        }
    }

    println(cnt)
}

