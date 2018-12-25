package com.phatlabs.ninja.exercises

object fibonacci extends App {

  def fib(n: BigInt): BigInt = {
    def go(n: BigInt, p: BigInt = 0, next: BigInt = 1): BigInt = {
      println(s"At fib: $next")
      if(n == 0) 0
      else if (n == 1) n
      else go(n -1, next, next + p)
    }
    go(n)
  }

  fib(500)

}
