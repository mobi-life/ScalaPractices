object PassByNameWorksheet {
  
  def myWhile(condition: => Boolean)(body: =>Unit):Unit ={
  	if(condition){
  		body
  		myWhile(condition)(body)
  	}
  }                                               //> myWhile: (condition: => Boolean)(body: => Unit)Unit
  
  var counter=0                                   //> counter  : Int = 0
  myWhile(counter<5)({counter+=1;println(counter)})
                                                  //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  
  
}