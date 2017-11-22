object TestWorksheet2 {

	var t = Array(5,8,7,6,3)                  //> t  : Array[Int] = Array(5, 8, 7, 6, 3)
	
	t.sortBy(x => x>7)                        //> res0: Array[Int] = Array(5, 7, 6, 3, 8)
	
	var sum=0                                 //> sum  : Int = 0
	var k = for(a<-Array(5,8,7,3,1)) yield {sum+=a;sum}
                                                  //> k  : Array[Int] = Array(5, 13, 20, 23, 24)
}