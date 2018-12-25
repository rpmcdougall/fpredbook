package com.phatlabs.ninja.exercises

object Sorting extends App {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
        //Checks boundary of array
      if (n >= as.length - 1) true
        // Checks to see if function is satisfied given n and n+1 and that the function will continute again
      else !ordered(as(n), as(n + 1)) && loop(n + 1)
    }
    loop(0)
  }

  //Checks whether or not x > y to check ascending order
  println(isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y))
}
