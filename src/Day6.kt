import kotlin.random.Random

/*
    The area of a circle is defined as πr^2.
    Estimate π to 3 decimal places using a Monte Carlo method.
    Hint: The basic equation of a circle is x2 + y2 = r2.
*/

val day6 = {
    print("Result: ${estimatePiUpTo(3.141)}")
}

private fun estimatePiUpTo(targetValue: Double): Double {
    var inCircle = 0.0
    var iterations = 0

    while (true) {
        iterations++
        val (x, y) = Random.nextDouble() to Random.nextDouble()
        if (Math.sqrt(x * x + y * y) <= 1) inCircle++
        val piSample = 4 * (inCircle / iterations)

        if(piSample.toString().startsWith(targetValue.toString())) {
            return piSample
        }
    }
}
