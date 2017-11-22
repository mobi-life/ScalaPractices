import io.Source._


object FileTest extends App {
  val lines = fromFile("src/matrix.txt").getLines()
  val values = lines.map(line => line.split(",").map(_.toInt))
  values.foreach(line=>{line.foreach(print);println})
  
  val lines2 = fromFile("src/students.txt").getLines()
  var students = List[(String,Array[Int],Array[Int],Array[Int])]()
  while(lines2.hasNext){
    val name = lines2.next()
    val quizzes = lines2.next().split(",").map(_.toInt)
    val assignments = lines2.next().split(",").map(_.toInt)
    val tests = lines2.next().split(",").map(_.toInt)
    
    students = (name,quizzes,assignments,tests) :: students
  }
  students.reverse
  
  students.foreach(student=>{println(student._1);student._2.foreach(q=>print(s"$q/"));println})
}