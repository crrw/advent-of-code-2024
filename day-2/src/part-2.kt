import java.io.File

fun main() {
//    val input = "day-2/sample.txt"
    val input = "day-2/input.txt"
    val lines = File(input).readLines()

    var cnt = 0
    for(line in lines) {
        val arr = line.split(" ").map { it.toInt() }

        var flag = false
        if(isSafe(arr)) {
            flag = true

        } else {
            for(remove in arr.indices) {
                val newArr = arr.toMutableList()
                newArr.removeAt(remove)

                if(isSafe(newArr)) {
                    flag = true
                    break
                }
            }
        }
        if(flag) {
            cnt++
        }
    }

    println(cnt)
}

fun isSafe(arr: List<Int>): Boolean {
    if(arr[0] < arr[1]) {
        return inc(arr)
    }

    return dec(arr)
}
