package com.yubraj.basics

/**
  * Created by ypokhrel on 5/7/2018.
  */
object PlayWithVector{

//  Streams
  def fibFunction(a:Int, b:Int) : Stream[Int] = a #:: fibFunction(b, b+a)
  val fib = fibFunction(1,1)
  println(fib.take(7).toList)

//  Vectors
  val vec = Vector("b","c","d")
  val vec2 = "a" +: vec
  vec2.foreach(print)

}