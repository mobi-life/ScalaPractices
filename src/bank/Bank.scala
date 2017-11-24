package bank

class Bank(private var _customers:List[Customer]=Nil,
           private var _accounts:List[Account]=Nil,
           private var _loans: List[Loan]=Nil) {
  
  var nextCustomerId:Int = _customers.foldLeft(-7)(_ max _.id.toInt) + 7
  var nextAccountId:Int = _accounts.foldLeft(-5)(_ max _.id.toInt) + 5
  var nextLoanId:Int = _loans.foldLeft(-7)(_ max _.id.toInt) + 7
  
  def addCustomer(firstName:String,lastName:String,address:Address,phone:PhoneNumber):Customer ={
    var id:String = nextCustomerId.toString()
    val c = new Customer(firstName,lastName,"0"*(8-id.length)+id,address,phone)
    _customers::=c
    nextCustomerId+=7
    c
  }
  
  def addAccount(c:Customer):Account = {
    require(_customers.contains(c),"Customer doesn't exist")
    var id:String = nextAccountId.toString
    val a = new Account(0,c,"0"*(8-id.length)+id)
    _accounts ::= a
    a
  }
  
  
  def closeAccount(a:Account):Boolean = {
      val index = _accounts.indexOf(a)
      if(index<0) false else{
        a.customer.removeAccount(a.id)
        _accounts = _accounts.patch(index,Nil,1)
        true
      }
  }
  
  def makeLoan(c: Customer, amount:Int): Loan = {
    require(_customers.contains(c),"Customer doesn't exist")
    val id = nextLoanId.toString
    val loan = new Loan(amount,c,"0"*(8-id.length)+id)
    _loans ::= loan
    nextLoanId+=7;
    loan
  }
  
  def findCustomer(firstName:String,lastName:String): Option[Customer] = {
    _customers.find(c=>c.firstName==firstName && c.lastName==lastName)
  }
  
  def findAccount(id:String):Option[Account] ={
    _accounts.find(_.id==id)
  }
  
  def findLoan(id:String):Option[Loan]= {
    _loans.find(_.id==id)
  }
  
}