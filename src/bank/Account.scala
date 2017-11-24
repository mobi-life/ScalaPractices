package bank

class Account(private var _balance:Int,
                      var customer:Customer,
                      var id:String) {
  customer.addAccount(this)
  
  def balance:Int = _balance
  
  def withdraw(amount:Int):Boolean = {
    if(amount>0 && amount<=_balance){
      _balance -= amount
      true
    }else false
  }
  
  def deposit(amount:Int):Boolean = {
    if(amount>0){
      _balance += amount
      true
    }else false
  }
}