object TestWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def add(a:Int,b:Int) = a + b                    //> add: (a: Int, b: Int)Int
  
  var sum = add(10,4)                             //> sum  : Int = 14
   
  var n  = for(i <- 10 to 5 by -1) yield i * 2    //> n  : scala.collection.immutable.IndexedSeq[Int] = Vector(20, 18, 16, 14, 12,
                                                  //|  10)
  
  var theString = "this is a string"              //> theString  : String = this is a string
  
  for(i <- 0 until theString.length) {
  	println(theString(i))                     //> t
                                                  //| h
                                                  //| i
                                                  //| s
                                                  //|  
                                                  //| i
                                                  //| s
                                                  //|  
                                                  //| a
                                                  //|  
                                                  //| s
                                                  //| t
                                                  //| r
                                                  //| i
                                                  //| n
                                                  //| g
  }
  
  def myFunction(n:Int) = {
  	var result = 1 to n
  	
  	result
  }                                               //> myFunction: (n: Int)scala.collection.immutable.Range.Inclusive
  
  for(i <- myFunction(10)) println(i)             //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  
  }