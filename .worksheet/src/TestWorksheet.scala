object TestWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(34); 
  
  def add(a:Int,b:Int) = a + b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(25); 
  
  var sum = add(10,4);System.out.println("""sum  : Int = """ + $show(sum ));$skip(51); 
   
  var n  = for(i <- 10 to 5 by -1) yield i * 2;System.out.println("""n  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(n ));$skip(40); 
  
  var theString = "this is a string";System.out.println("""theString  : String = """ + $show(theString ));$skip(67); 
  
  for(i <- 0 until theString.length) {
  	println(theString(i))
  };$skip(76); 
  
  def myFunction(n:Int) = {
  	var result = 1 to n
  	
  	result
  };System.out.println("""myFunction: (n: Int)scala.collection.immutable.Range.Inclusive""");$skip(41); 
  
  for(i <- myFunction(10)) println(i)}
  
  }
