object CollectionsWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 
                
	def myRandom(start:Int,end:Int):Int = ((Math.random*end)%start).toInt;System.out.println("""myRandom: (start: Int, end: Int)Int""");$skip(45); 


	val col1 = Array.fill(10)(myRandom(5,10));System.out.println("""col1  : Array[Int] = """ + $show(col1 ));$skip(143); 
	val col2 = Array.fill(5)(Array
														.fill(myRandom(5,10))(myRandom(65,122))
														.map(p=>p.toChar)
														.mkString);System.out.println("""col2  : Array[String] = """ + $show(col2 ));$skip(50); 

	var tabulatedCol = Array.tabulate(10)(i => i+1);System.out.println("""tabulatedCol  : Array[Int] = """ + $show(tabulatedCol ));$skip(186); 
	

	
	val oddsAndEvens = List.tabulate(20)(i => ((i+1)%2) match {
																					case 0 => s"${i+1} is Even"
																					case _ => s"${i+1} is Odd"
																				});System.out.println("""oddsAndEvens  : List[String] = """ + $show(oddsAndEvens ));$skip(41); 
	
	
	var cons1 = 4 :: 1 :: 3 :: 6 :: Nil;System.out.println("""cons1  : List[Int] = """ + $show(cons1 ));$skip(24); 
	val cons2 = 9 :: cons1;System.out.println("""cons2  : List[Int] = """ + $show(cons2 ));$skip(25); 
	var cons3 = List[Int]();System.out.println("""cons3  : List[Int] = """ + $show(cons3 ));$skip(13); 
	cons3 ::= 4;$skip(13); 
	cons3 ::= 9;$skip(13); 
	cons3 ::= 7;$skip(15); val res$0 = 
	cons3.reverse;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(94); 
	
	def makeListWithCons(n:Int):List[Int] = {
		if(n<1) Nil
		else n::makeListWithCons(n-1)
	};System.out.println("""makeListWithCons: (n: Int)List[Int]""");$skip(36); 
	
	val cons4 = makeListWithCons(10);System.out.println("""cons4  : List[Int] = """ + $show(cons4 ));$skip(15); val res$1 = 
	cons4.reverse;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(33); 
	
	val nums = List(5,8,3,6,7,24);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(48); 
  val words = List("me","you","Behzad","scala");System.out.println("""words  : List[String] = """ + $show(words ));$skip(18); val res$2 = 
  
  nums.drop(2);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(20); val res$3 = 
  nums.dropRight(2);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(12); val res$4 = 
  nums.head;System.out.println("""res4: Int = """ + $show(res$4));$skip(12); val res$5 = 
  nums.last;System.out.println("""res5: Int = """ + $show(res$5));$skip(22); val res$6 = 
  nums.patch(2,Nil,3);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(30); val res$7 = 
  nums.patch(3,List(1,2,3),3);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(19); val res$8 = 
  nums.slice(1, 4);System.out.println("""res8: List[Int] = """ + $show(res$8))}
}

																				