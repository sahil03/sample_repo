class Customer{
   private int customerNo;
   private static int newCustomer;
   private int nooftimes;
   public Customer(){
      ++totalCustomer;
      ++nooftimes;
   }
   public void setCustomerNo(int cNo){
      customerNo=cNo;
   }
   public int getCustomerNo(){
       return customerNo;
   }
   public static int getTotalCustomer(){
       return totalCustomer;
   }
    public  int getnoofTimes(){
          return nooftimes;
   }
   static{
       totalCustomer=10;
       int nooftimes=20;

   }
}