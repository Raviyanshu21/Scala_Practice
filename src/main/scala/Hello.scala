object Hello extends App{

  /**
   * Printing Hello World N times   (Remember foreach)
   */
  var n = scala.io.StdIn.readInt()
  (0 to n).foreach(_ => println("Hello World"))


}
