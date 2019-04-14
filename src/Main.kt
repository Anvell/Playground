
val days = mutableListOf(
        day1,
        day2,
        day3,
        day4,
        day5
)

fun main() {
    for ((index, day) in days.withIndex()) {
        print("\n\nDay $index:\n")
        day.invoke()
    }
}