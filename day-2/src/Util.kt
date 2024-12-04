fun dec(arr: List<Int>): Boolean {
    for(i in 1 until arr.size) {
        val diff = arr[i - 1] - arr[i]
        if(diff != 1 && diff != 2 && diff != 3) {
            return false
        }
    }
    return true
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
