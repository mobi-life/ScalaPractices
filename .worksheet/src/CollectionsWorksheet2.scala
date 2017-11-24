object CollectionsWorksheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  def myRandom(start:Int,end:Int):Int = ((Math.random*end)%start).toInt;System.out.println("""myRandom: (start: Int, end: Int)Int""");$skip(47); 
  
  val col1 = Array.fill(10)(myRandom(5,10));System.out.println("""col1  : Array[Int] = """ + $show(col1 ));$skip(143); 
	val col2 = Array.fill(5)(Array
														.fill(myRandom(5,10))(myRandom(65,122))
														.map(p=>p.toChar)
														.mkString);System.out.println("""col2  : Array[String] = """ + $show(col2 ));$skip(64); 
														
	var tabulatedCol = Array.tabulate(10)(i => i+1);System.out.println("""tabulatedCol  : Array[Int] = """ + $show(tabulatedCol ));$skip(181); 
	val oddsAndEvens = List.tabulate(20)(i => ((i+1)%2) match {
																					case 0 => s"${i+1} is Even"
																					case _ => s"${i+1} is Odd"
																				});System.out.println("""oddsAndEvens  : List[String] = """ + $show(oddsAndEvens ));$skip(56); 
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
  nums.slice(1, 4);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(19); val res$9 = 
  words.splitAt(2);System.out.println("""res9: (List[String], List[String]) = """ + $show(res$9));$skip(15); val res$10 = 
  nums.take(3);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(20); val res$11 = 
  nums.takeRight(3);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(25); val res$12 = 
  nums.diff(List(5,8,2));System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(31); val res$13 = 
  List(7,5,1,7,2,1,9).distinct;System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(34); val res$14 = 
  nums.intersect(List(8,1,2,3,5));System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(30); val res$15 = 
  nums.union(List(8,1,2,3,5));System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(29); val res$16 = 
  nums.mkString("[",",","]");System.out.println("""res16: String = """ + $show(res$16));$skip(15); val res$17 = 
  nums.product;System.out.println("""res17: Int = """ + $show(res$17));$skip(14); val res$18 = 
  nums.sorted;System.out.println("""res18: List[Int] = """ + $show(res$18));$skip(33); val res$19 = 
  nums.zip(List(30,31,32,33,34));System.out.println("""res19: List[(Int, Int)] = """ + $show(res$19));$skip(21); val res$20 = 
  words.zipWithIndex;System.out.println("""res20: List[(String, Int)] = """ + $show(res$20));$skip(37); 
  
  val List(n1,n2,n3,_,_,_) = nums;System.out.println("""n1  : Int = """ + $show(n1 ));System.out.println("""n2  : Int = """ + $show(n2 ));System.out.println("""n3  : Int = """ + $show(n3 ));$skip(14); 
  println(n2);$skip(36); 
  
  val firstWord::theRest = words;System.out.println("""firstWord  : String = """ + $show(firstWord ));System.out.println("""theRest  : List[String] = """ + $show(theRest ));$skip(132); 
  
  def itemCount(list:List[Int]):Int ={
  	list match{
  		case Nil =>0
  		case item::theRest => 1 + itemCount(theRest)
  	}
  };System.out.println("""itemCount: (list: List[Int])Int""");$skip(21); val res$21 = 
  
  itemCount(nums);System.out.println("""res21: Int = """ + $show(res$21));$skip(124); 
  
  def itemsSum(list:List[Int]):Int = list match {
  	case Nil => 0
  	case item::theRest => item + itemsSum(theRest)
  };System.out.println("""itemsSum: (list: List[Int])Int""");$skip(20); val res$22 = 
  
  itemsSum(nums);System.out.println("""res22: Int = """ + $show(res$22));$skip(28); 
  
  words.foreach(println);$skip(34); 
  nums.foreach(i => println(i*2));$skip(33); val res$23 = 
  nums.map(Math.pow(_, 2).toInt);System.out.println("""res23: List[Int] = """ + $show(res$23));$skip(22); val res$24 = 
  words.map(_.length);System.out.println("""res24: List[Int] = """ + $show(res$24));$skip(19); val res$25 = 
  nums.filter(_<6);System.out.println("""res25: List[Int] = """ + $show(res$25));$skip(27); val res$26 = 
  words.filter(_.length>3);System.out.println("""res26: List[String] = """ + $show(res$26));$skip(22); val res$27 = 
  nums.filter(_%2==0);System.out.println("""res27: List[Int] = """ + $show(res$27));$skip(29); val res$28 = 
  
  words.count(_.length<3);System.out.println("""res28: Int = """ + $show(res$28));$skip(25); val res$29 = 
  nums.dropWhile(_%2==0);System.out.println("""res29: List[Int] = """ + $show(res$29));$skip(28); val res$30 = 
  words.exists(_=="Behzad");System.out.println("""res30: Boolean = """ + $show(res$30));$skip(25); val res$31 = 
  nums.filterNot(_%2==0);System.out.println("""res31: List[Int] = """ + $show(res$31));$skip(25); val res$32 = 
  words.find(_=="scala");System.out.println("""res32: Option[String] = """ + $show(res$32));$skip(22); val res$33 = 
  nums.forall(_%2==0);System.out.println("""res33: Boolean = """ + $show(res$33));$skip(31); val res$34 = 
  words.indexWhere(_=="scala");System.out.println("""res34: Int = """ + $show(res$34));$skip(30); val res$35 = 
  nums.lastIndexWhere(_%2==0);System.out.println("""res35: Int = """ + $show(res$35));$skip(25); val res$36 = 
  nums.partition(_%2==0);System.out.println("""res36: (List[Int], List[Int]) = """ + $show(res$36));$skip(28); val res$37 = 
  nums.prefixLength(_%2==0);System.out.println("""res37: Int = """ + $show(res$37));$skip(23); val res$38 = 
  nums.takeWhile(_<10);System.out.println("""res38: List[Int] = """ + $show(res$38));$skip(24); val res$39 = 
  nums.foldLeft(1)(_+_);System.out.println("""res39: Int = """ + $show(res$39));$skip(19); val res$40 = 
  nums.reduce(_+_);System.out.println("""res40: Int = """ + $show(res$40));$skip(24); val res$41 = 
  nums.scanLeft(0)(_+_);System.out.println("""res41: List[Int] = """ + $show(res$41));$skip(22); val res$42 = 
  
  nums.map(1 to _);System.out.println("""res42: List[scala.collection.immutable.Range.Inclusive] = """ + $show(res$42));$skip(23); val res$43 = 
  nums.flatMap(1 to _);System.out.println("""res43: List[Int] = """ + $show(res$43));$skip(28); val res$44 = 
  
  words.maxBy(s => s(0));System.out.println("""res44: String = """ + $show(res$44));$skip(26); val res$45 = 
  nums.maxBy(n => n*(-1));System.out.println("""res45: Int = """ + $show(res$45));$skip(26); val res$46 = 
  nums.minBy(n => n*(-1));System.out.println("""res46: Int = """ + $show(res$46));$skip(24); val res$47 = 
  words.sortBy(s=>s(1));System.out.println("""res47: List[String] = """ + $show(res$47));$skip(32); val res$48 = 
  nums.sortWith((n1,n2)=>n1>n2);System.out.println("""res48: List[Int] = """ + $show(res$48));$skip(32); val res$49 = 
  nums.sortWith((n1,n2)=>n1<n2);System.out.println("""res49: List[Int] = """ + $show(res$49));$skip(40); 
  
  val list = List(82,42,14,15,65,96);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(29); val res$50 = 
  list.foldLeft(-1)(_ max _);System.out.println("""res50: Int = """ + $show(res$50))}
  
  
  
  
}
