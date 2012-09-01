class StaticBlock{
	static{
		System.out.println("Static Demo");
    }
   public static void main(String args[]){
       Customer customer=new Customer();
       customer.setCustomerNo(1001);
       Customer custOne=new Customer();
       custOne.setCustomerNo(1002);
       System.out.println("Customer id :"+customer.getCustomerNo());
       System.out.println("Customer id :"+custOne.getCustomerNo());
       System.out.println("Total Number of Customers:"+Customer.getTotalCustomer());
       System.out.println("Number of time visited:"+custOne.getnoofTimes());
  }
}
