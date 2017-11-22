object LoopsWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
 
	//while
	var count=0;System.out.println("""count  : Int = """ + $show(count ));$skip(52); 
  while(count<4){
  	println(count)
  	count+=1
  };$skip(23); 
  //do-while
  count=0;$skip(54); 
  do{
  	println(count)
  	count+=1
  }while(count<4);$skip(56); 
  
 //normal for , 1 to 4
  for(i <- 1 to 4) println(i);$skip(60); 
  
  // normal for 1 to 4-1
  for(i<- 1 until 4) println(i);$skip(72); 
  
  // normal for reverse counting
  for(i <- 4 to 1 by -1) println(i);$skip(177); 
  
	//the combination of pattern <- collection is called a generator
	
	//for as an expression returning a collection
	var power2s = for(i <- 1 to 3) yield Math.pow(i, 2).toInt;System.out.println("""power2s  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(power2s ));$skip(206); 
  //multiline for conditions
  var multilineCon1 = for{
  													i <- 1 to 10
  													j <- 1 to 10
  													product = i*j
  													if product % 2 == 0
  												} yield product;System.out.println("""multilineCon1  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(multilineCon1 ));$skip(131); 
  for{
  			i <- 1 to 4
  			j <- 4 to 1 by -1
  			if (i+j) % 2 == 0
  	}{
  		println(i)
  		println(j)
  		println("="*10)
  	}}
 
	
	
  
  
	

  
  
}
