object SumOfTwoNum extends App {

  /**
   * Adding two numbers in functional way
   */
  println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)


}
