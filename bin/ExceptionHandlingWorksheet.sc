object ExceptionHandlingWorksheet {
	
	val str="-"                               //> str  : String = -
	val num = try{ str.toInt } catch{	//if it not be valid number string it would return 0 into num
																		case e:NumberFormatException => 0
																	}
                                                  //> num  : Int = 0
 val division = try{10/0} catch{
 																	case e:ArithmeticException =>0
 															}
                                                  //> division  : Int = 0
  // in Scala try/catch is alwasy an expression which returns a value
}