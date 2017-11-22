object LoopsWorksheet {
 
	//while
	var count=0                               //> count  : Int = 0
  while(count<4){
  	println(count)
  	count+=1
  }                                               //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
  //do-while
  count=0
  do{
  	println(count)
  	count+=1
  }while(count<4)                                 //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
  
 //normal for , 1 to 4
  for(i <- 1 to 4) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  
  // normal for 1 to 4-1
  for(i<- 1 until 4) println(i)                   //> 1
                                                  //| 2
                                                  //| 3
  
  // normal for reverse counting
  for(i <- 4 to 1 by -1) println(i)               //> 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
  
	//the combination of pattern <- collection is called a generator
	
	//for as an expression returning a collection
	var power2s = for(i <- 1 to 3) yield Math.pow(i, 2).toInt
                                                  //> power2s  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 9)
  //multiline for conditions
  var multilineCon1 = for{
  													i <- 1 to 10
  													j <- 1 to 10
  													product = i*j
  													if product % 2 == 0
  												} yield product
                                                  //> multilineCon1  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6
                                                  //| , 8, 10, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 6, 12, 18, 24, 30, 4, 8, 12, 16
                                                  //| , 20, 24, 28, 32, 36, 40, 10, 20, 30, 40, 50, 6, 12, 18, 24, 30, 36, 42, 48,
                                                  //|  54, 60, 14, 28, 42, 56, 70, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 18, 36, 
                                                  //| 54, 72, 90, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
  for{
  			i <- 1 to 4
  			j <- 4 to 1 by -1
  			if (i+j) % 2 == 0
  	}{
  		println(i)
  		println(j)
  		println("="*10)
  	}                                         //> 1
                                                  //| 3
                                                  //| ==========
                                                  //| 1
                                                  //| 1
                                                  //| ==========
                                                  //| 2
                                                  //| 4
                                                  //| ==========
                                                  //| 2
                                                  //| 2
                                                  //| ==========
                                                  //| 3
                                                  //| 3
                                                  //| ==========
                                                  //| 3
                                                  //| 1
                                                  //| ==========
                                                  //| 4
                                                  //| 4
                                                  //| ==========
                                                  //| 4
                                                  //| 2
                                                  //| ==========
 
	
	
  
  
	

  
  
}