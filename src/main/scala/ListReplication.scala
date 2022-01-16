object ListReplication extends App {
  /**
   * Repeating each element in the list n amount of time
   */
  def replicateList(num: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(e => List.fill(num)(e))
  }
  val arrInt = List(1, 2, 3, 4)
  println(replicateList(3, arrInt))
}
