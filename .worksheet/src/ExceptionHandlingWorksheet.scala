object ExceptionHandlingWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(51); 
	
	val str="-";System.out.println("""str  : String = """ + $show(str ));$skip(168); 
	val num = try{ str.toInt } catch{	//if it not be valid number string it would return 0 into num
																		case e:NumberFormatException => 0
																	};System.out.println("""num  : Int = """ + $show(num ));$skip(100); 
 val division = try{10/0} catch{
 																	case e:ArithmeticException =>0
 															};System.out.println("""division  : Int = """ + $show(division ))}
  // in Scala try/catch is alwasy an expression which returns a value
}
