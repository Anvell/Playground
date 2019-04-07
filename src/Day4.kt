/*
    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns
    the first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

    Given this implementation of cons:

    def cons(a, b):
       def pair(f):
          return f(a, b)
       return pair
    Implement car and cdr.
*/

val day4 = {
    val cons = cons(1, 2)
    print(
            "car: ${car(cons)}\n" +
            "cdr: ${cdr(cons)}\n"
    )
}

fun cons(a: Int, b: Int): (f: (a: Int, b: Int) -> Int) -> Int = { f ->
    f(a, b)
}

fun car(fn: (f: (a: Int, b: Int) -> Int) -> Int): Int {
    return fn.invoke { a, _ -> a }
}

fun cdr(fn: (f: (a: Int, b: Int) -> Int) -> Int): Int {
    return fn.invoke { _, b -> b }
}
