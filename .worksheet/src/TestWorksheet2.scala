object TestWorksheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(50); 

	var t = Array(5,8,7,6,3);System.out.println("""t  : Array[Int] = """ + $show(t ));$skip(22); val res$0 = 
	
	t.sortBy(x => x>7);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(13); 
	
	var sum=0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(53); 
	var k = for(a<-Array(5,8,7,3,1)) yield {sum+=a;sum};System.out.println("""k  : Array[Int] = """ + $show(k ))}
}
