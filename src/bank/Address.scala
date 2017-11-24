package bank

class Address(address:String) {
  private var _lines: List[String]=Nil
  
  addAddress(address)
  
  def addAddress(addr:String):Address = {
    require(!addr.isEmpty(),"Address can not be empty string.")
    _lines ::= addr
    this
  }
  
  override def toString():String = _lines.reverse.reduce(_+"\n"+_)
}