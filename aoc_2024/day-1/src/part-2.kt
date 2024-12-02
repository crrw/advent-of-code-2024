import java.io.File

fun main() {
//    val input = "aoc_2024/day-1/sample.txt"
    val input = "aoc_2024/day-1/input.txt"
    val lines = File(input).readLines()

    val left = mutableListOf<Int>()
    val right = mutableMapOf<Int, Int>()
    for(line in lines) {
        val pos = line.split("   ").map { it.toInt() }
        left.add(pos[0])
        right.put(pos[1], right.getOrDefault(pos[1], 0) + 1)
    }

    var cnt = 0
    left.forEach {
        val curr = right.getOrDefault(it, 0)
        cnt += (curr * it)
    }

    println(cnt)
}
