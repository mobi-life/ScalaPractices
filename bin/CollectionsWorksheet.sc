object CollectionsWorksheet {
  def myRandom(start:Int,end:Int):Int = ((Math.random*end)%start).toInt
                                                  //> myRandom: (start: Int, end: Int)Int
  
  val col1 = Array.fill(10)(myRandom(5,10))       //> col1  : Array[Int] = Array(3, 4, 4, 2, 2, 3, 2, 2, 3, 4)
	val col2 = Array.fill(5)(Array
														.fill(myRandom(5,10))(myRandom(65,122))
														.map(p=>p.toChar)
														.mkString)
                                                  //> col2  : Array[String] = Array(%., "", "", "", $)
														
	var tabulatedCol = Array.tabulate(10)(i => i+1)
                                                  //> tabulatedCol  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	val oddsAndEvens = List.tabulate(20)(i => ((i+1)%2) match {
																					case 0 => s"${i+1} is Even"
																					case _ => s"${i+1} is Odd"
																				})
                                                  //> oddsAndEvens  : List[String] = List(1 is Odd, 2 is Even, 3 is Odd, 4 is Even
                                                  //| , 5 is Odd, 6 is Even, 7 is Odd, 8 is Even, 9 is Odd, 10 is Even, 11 is Odd,
                                                  //|  12 is Even, 13 is Odd, 14 is Even, 15 is Odd, 16 is Even, 17 is Odd, 18 is 
                                                  //| Even, 19 is Odd, 20 is Even)
																				var cons1 = 4 :: 1 :: 3 :: 6 :: Nil
                                                  //> cons1  : List[Int] = List(4, 1, 3, 6)
	val cons2 = 9 :: cons1                    //> cons2  : List[Int] = List(9, 4, 1, 3, 6)
	var cons3 = List[Int]()                   //> cons3  : List[Int] = List()
	cons3 ::= 4
	cons3 ::= 9
	cons3 ::= 7
	cons3.reverse                             //> res0: List[Int] = List(4, 9, 7)
	
	def makeListWithCons(n:Int):List[Int] = {
		if(n<1) Nil
		else n::makeListWithCons(n-1)
	}                                         //> makeListWithCons: (n: Int)List[Int]
	
	val cons4 = makeListWithCons(10)          //> cons4  : List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
	cons4.reverse                             //> res1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	val nums = List(5,8,3,6,7,24)             //> nums  : List[Int] = List(5, 8, 3, 6, 7, 24)
  val words = List("me","you","Behzad","scala")   //> words  : List[String] = List(me, you, Behzad, scala)
  
  nums.drop(2)                                    //> res2: List[Int] = List(3, 6, 7, 24)
  nums.dropRight(2)                               //> res3: List[Int] = List(5, 8, 3, 6)
  nums.head                                       //> res4: Int = 5
  nums.last                                       //> res5: Int = 24
  nums.patch(2,Nil,3)                             //> res6: List[Int] = List(5, 8, 24)
  nums.patch(3,List(1,2,3),3)                     //> res7: List[Int] = List(5, 8, 3, 1, 2, 3)
  nums.slice(1, 4)                                //> res8: List[Int] = List(8, 3, 6)
  words.splitAt(2)                                //> res9: (List[String], List[String]) = (List(me, you),List(Behzad, scala))
  nums.take(3)                                    //> res10: List[Int] = List(5, 8, 3)
  nums.takeRight(3)                               //> res11: List[Int] = List(6, 7, 24)
  nums.diff(List(5,8,2))                          //> res12: List[Int] = List(3, 6, 7, 24)
  List(7,5,1,7,2,1,9).distinct                    //> res13: List[Int] = List(7, 5, 1, 2, 9)
  nums.intersect(List(8,1,2,3,5))                 //> res14: List[Int] = List(5, 8, 3)
  nums.union(List(8,1,2,3,5))                     //> res15: List[Int] = List(5, 8, 3, 6, 7, 24, 8, 1, 2, 3, 5)
  nums.mkString("[",",","]")                      //> res16: String = [5,8,3,6,7,24]
  nums.product                                    //> res17: Int = 120960
  nums.sorted                                     //> res18: List[Int] = List(3, 5, 6, 7, 8, 24)
  nums.zip(List(30,31,32,33,34))                  //> res19: List[(Int, Int)] = List((5,30), (8,31), (3,32), (6,33), (7,34))
  words.zipWithIndex                              //> res20: List[(String, Int)] = List((me,0), (you,1), (Behzad,2), (scala,3))
  
  val List(n1,n2,n3,_,_,_) = nums                 //> n1  : Int = 5
                                                  //| n2  : Int = 8
                                                  //| n3  : Int = 3
  println(n2)                                     //> 8
  
  val firstWord::theRest = words                  //> firstWord  : String = me
                                                  //| theRest  : List[String] = List(you, Behzad, scala)
  
  def itemCount(list:List[Int]):Int ={
  	list match{
  		case Nil =>0
  		case item::theRest => 1 + itemCount(theRest)
  	}
  }                                               //> itemCount: (list: List[Int])Int
  
  itemCount(nums)                                 //> res21: Int = 6
  
  def itemsSum(list:List[Int]):Int = list match {
  	case Nil => 0
  	case item::theRest => item + itemsSum(theRest)
  }                                               //> itemsSum: (list: List[Int])Int
  
  itemsSum(nums)                                  //> res22: Int = 53
  
  words.foreach(println)                          //> me
                                                  //| you
                                                  //| Behzad
                                                  //| scala
  nums.foreach(i => println(i*2))                 //> 10
                                                  //| 16
                                                  //| 6
                                                  //| 12
                                                  //| 14
                                                  //| 48
  nums.map(Math.pow(_, 2).toInt)                  //> res23: List[Int] = List(25, 64, 9, 36, 49, 576)
  words.map(_.length)                             //> res24: List[Int] = List(2, 3, 6, 5)
  nums.filter(_<6)                                //> res25: List[Int] = List(5, 3)
  words.filter(_.length>3)                        //> res26: List[String] = List(Behzad, scala)
  nums.filter(_%2==0)                             //> res27: List[Int] = List(8, 6, 24)
  
  words.count(_.length<3)                         //> res28: Int = 1
  nums.dropWhile(_%2==0)                          //> res29: List[Int] = List(5, 8, 3, 6, 7, 24)
  words.exists(_=="Behzad")                       //> res30: Boolean = true
  nums.filterNot(_%2==0)                          //> res31: List[Int] = List(5, 3, 7)
  words.find(_=="scala")                          //> res32: Option[String] = Some(scala)
  nums.forall(_%2==0)                             //> res33: Boolean = false
  words.indexWhere(_=="scala")                    //> res34: Int = 3
  nums.lastIndexWhere(_%2==0)                     //> res35: Int = 5
  nums.partition(_%2==0)                          //> res36: (List[Int], List[Int]) = (List(8, 6, 24),List(5, 3, 7))
  nums.prefixLength(_%2==0)                       //> res37: Int = 0
  nums.takeWhile(_<10)                            //> res38: List[Int] = List(5, 8, 3, 6, 7)
  nums.foldLeft(1)(_+_)                           //> res39: Int = 54
  nums.reduce(_+_)                                //> res40: Int = 53
  nums.scanLeft(0)(_+_)                           //> res41: List[Int] = List(0, 5, 13, 16, 22, 29, 53)
  
  nums.map(1 to _)                                //> res42: List[scala.collection.immutable.Range.Inclusive] = List(Range 1 to 5
                                                  //| , Range 1 to 8, Range 1 to 3, Range 1 to 6, Range 1 to 7, Range 1 to 24)
  nums.flatMap(1 to _)                            //> res43: List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 1, 
                                                  //| 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
                                                  //| 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)
  
  words.maxBy(s => s(0))                          //> res44: String = you
  nums.maxBy(n => n*(-1))                         //> res45: Int = 3
  nums.minBy(n => n*(-1))                         //> res46: Int = 24
  words.sortBy(s=>s(1))                           //> res47: List[String] = List(scala, me, Behzad, you)
  nums.sortWith((n1,n2)=>n1>n2)                   //> res48: List[Int] = List(24, 8, 7, 6, 5, 3)
  nums.sortWith((n1,n2)=>n1<n2)                   //> res49: List[Int] = List(3, 5, 6, 7, 8, 24)
  
  val list = List(82,42,14,15,65,96)              //> list  : List[Int] = List(82, 42, 14, 15, 65, 96)
  list.foldLeft(-1)(_ max _)                      //> res50: Int = 96
  
  
  
  
}