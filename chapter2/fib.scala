// not so great but it works
def fib(n: Int): Int =
  @annotation.tailrec
  def iter(x: Int, result: Int, i: Int, end: Int): Int = 
    if i >= end then 
      result
    else 
      val new_result = result + x
      val new_x = result
      val next_i = i + 1
      iter(new_x, new_result, next_i, end)

  if n == 1 then 0
  else if n == 2 then 1
  else iter(1, 1, 2, n-1)

// better fib
def new_fib(n: Int): Int =
  @annotation.tailrec
  def iter(n: Int, prev: Int, curr: Int): Int =
    if n <= 3 then prev + curr
    else iter(n - 1, curr, prev + curr)

  if n == 1 then 0
  else if n == 2 then 1
  else iter(n, 0, 1)

@main def main: Unit =
  println(fib(1))
  println(fib(2))
  println(fib(5))
  println(fib(10))
  println(new_fib(1))
  println(new_fib(2))
  println(new_fib(5))
  println(new_fib(10))
