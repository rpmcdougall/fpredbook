package com.phatlabs.ninja.exercises

object Sorting extends App {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else !ordered(as(n), as(n + 1)) && loop(n + 1)
    }
    loop(0)
  }


  println(isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y))
}
