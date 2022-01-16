object FilteringArray extends App {

  /**
   *
   * @param delim
   * @param arr
   * @return  the filtered array of integers and output those values that are less than the specified value
   */

  def arrayFilter(delim: Int, arr: List[Int]): List[Int] = arr.filter(_ < delim)

  println(arrayFilter(3, List(10,9,8,2,7,5,1,3,0)))

}
