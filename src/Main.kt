
val days = mutableListOf(
        day1,
        day2,
        day3
)

fun main() {
    for ((index, day) in days.withIndex()) {
        print("\n\nDay $index:\n")
        day.invoke()
    }
}