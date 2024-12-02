import java.io.File

fun main() {
    val input = "aoc_2024/day-1/sample.txt"
//    val input = "aoc_2024/day-1/input.txt"
    val lines = File(input).readLines()

    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()
    for(line in lines) {
        val pos = line.split("   ").map { it.toInt() }
        left.add(pos[0])
        right.add(pos[1])
    }

    left.sort()
    right.sort()

    var cnt = 0
    assert(left.size == right.size)

    left.zip(right).forEach {
        cnt += Math.abs(it.first - it.second)
    }

    println(cnt)
}
