package bank

object bankApp extends App {
  
  var customers = List[Customer]()
  var accounts = List[Account]()
  var loans = List[Loan]()
  
  val bank = new Bank(customers,accounts,loans)
  
  val address1 = new Address("My address1")
  address1.addAddress("my address 2")
  val phone1 = new PhoneNumber("111111")
  val customer1 = bank.addCustomer("Behzad", "Ghaffarnejad", address1, phone1)
  bank.addAccount(customer1)
  
  val address2 = new Address("Customer 2's address")
  val phone2 = new PhoneNumber("22222")
  val customer2 = bank.addCustomer("Customer 2", "C 2", address2, phone2)
  bank.addAccount(customer2)
  
  val c:Customer = bank.findCustomer(customer1.firstName,customer1.lastName).get
  
  println(c.address().toString())
}