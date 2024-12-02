fun dec(arr: List<Int>): Boolean {
    for(i in 1 until arr.size) {
        val diff = arr[i - 1] - arr[i]
        if(diff != 1 && diff != 2 && diff != 3) {
            return false
        }
    }
    return true
}

fun dec_2(arr: List<Int>): Boolean {
    var cnt = 0
    for(i in 1 until arr.size) {
        val diff = arr[i - 1] - arr[i]
        if(diff != 1 && diff != 2 && diff != 3) {
            cnt++
        }
    }
    return cnt <= 1
}

fun inc(arr: List<Int>): Boolean {
    for(i in 1 until arr.size) {
        val diff = arr[i] - arr[i - 1]
        if(diff != 1 && diff != 2 && diff != 3) {
            return false
        }
    }
    return true
}

fun inc_2(arr: List<Int>): Boolean {
    var cnt = 0
    for(i in 1 until arr.size) {
        val diff = arr[i] - arr[i - 1]
        if(diff != 1 && diff != 2 && diff != 3) {
            cnt++
        }
    }
    return cnt <= 1
}
