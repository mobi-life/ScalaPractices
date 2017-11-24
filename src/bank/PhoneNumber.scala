package bank

class PhoneNumber(phone:String) {
  private var _numbers:List[String]=Nil
  
  addNumber(phone)
  
  def addNumber(phone:String):PhoneNumber={
    require(!phone.isEmpty(),"Phone number can not be empty.")
    _numbers ::= phone
    this
  }
  
  override def toString():String = _numbers.reverse.reduce(_+"\n"+_)
}