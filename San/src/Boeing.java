

class Boeing {
		public String ModelNo;
		public void setModelNo(String no){
			ModelNo=no;
		}
		public String getModelnNo(){
			return ModelNo;
		}
}
class International extends Boeing{
		private int Capacity;
		private String seating;
		public void setCapacity(int no){
			Capacity=no;
		}
		public int getCpy(){
			return Capacity;
		}
		public void setseating(String preference){
			seating=preference;
		}
		public String getstp(){
			return seating;
		}

}

class Domestic extends International{
	private String seating;
	public void setseating(String preference){
		seating=preference;
	}
	public String getstp(){
		return seating;
	}
}
