class Solution {
  def calculate(elements: Array[Int]): Int = {
    val sortedArray = elements.sorted
    var missingInteger = 0
      for (i <- 1 until sortedArray.length){
      if ((sortedArray(i) - sortedArray(i - 1)) > 1) {
        missingInteger = sortedArray(i) - 1
        break
      }
    }
    missingInteger
  }
}
