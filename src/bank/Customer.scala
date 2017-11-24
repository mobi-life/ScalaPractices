package bank

class Customer(var firstName: String,
               var lastName: String,
               var id:String,
               private var _address: Address,
               private var _phoneNumber:PhoneNumber) {
  
  private var _accounts = List[Account]()
  private var _loans = List[Loan]()
  
  def addAccount(a:Account):Unit ={
    require(a.customer==this,"The account isn't related to this customer.")
    if(!_accounts.contains(a))_accounts::=a
  }
  
  def addLoan(loan:Loan):Unit = {
    require(loan.customer==this,"The loan isn't related to this customer.")
    if(!_loans.contains(loan))_loans::=loan
  }
  
  def removeAccount(id:String):Boolean ={
    val index = _accounts.indexWhere(_.id==id)
    if(index> -1){
      _accounts = _accounts.patch(index, Nil, 1)
      true
    }else false
  }
  
  def removeLoan(id:String):Boolean ={
    val index = _loans.indexWhere(_.id==id)
    if(index> -1){
      _loans.patch(index,Nil,1)
      true
    }else false
  }
  
  def loans():List[Loan] = _loans
  def accounts():List[Account] = _accounts
  def address():Address = _address
  def phoneNumber():PhoneNumber = _phoneNumber
  def changeAddress(a:Address):Unit = _address = a
  def changePhoneNumber(pn:PhoneNumber):Unit = _phoneNumber = pn
  
  
}