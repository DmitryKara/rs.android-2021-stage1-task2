package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        val registerA = a.toUpperCase()
        var j = ""
        for (i in registerA){
            if (b.contains(i)) j += i
        }
        return if (j == b)
            "YES"
        else "NO"
    }
}
