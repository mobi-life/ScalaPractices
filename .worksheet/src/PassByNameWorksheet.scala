object PassByNameWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(155); 
  
  def myWhile(condition: => Boolean)(body: =>Unit):Unit ={
  	if(condition){
  		body
  		myWhile(condition)(body)
  	}
  };System.out.println("""myWhile: (condition: => Boolean)(body: => Unit)Unit""");$skip(19); 
  
  var counter=0;System.out.println("""counter  : Int = """ + $show(counter ));$skip(52); 
  myWhile(counter<5)({counter+=1;println(counter)})}
}
