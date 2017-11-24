package bank

class Loan(private var _balance:Int,
           var customer:Customer,
           var id:String) {
  
  customer.addLoan(this)
  
  def balance:Int = _balance
  
  def payment(amount:Int):Boolean={
    if(amount>0 && amount<=_balance){
      _balance -= amount
      return true
    }else false
  }
}