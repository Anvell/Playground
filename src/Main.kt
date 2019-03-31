
val days = mutableListOf(
        day1,
        day2
)

fun main() {
    for ((index, day) in days.withIndex()) {
        print("\n\nDay $index:\n")
        day.invoke()
    }
}