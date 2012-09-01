import java.util.Scanner;

class Reservation{
		public static void main(String args[]){
			int num;
			
			
			Scanner input = new Scanner( System.in );
			
			System.out.println("Welcome to American Airlines Helpdesk");
			System.out.println("Press 1 for International Airlines or 2 for Domestic Airlines");			
			num = input.nextInt();
			System.out.println();
			if (num!= 1 && num !=2)
		          
		          {
		              System.out.println("Wrong input");
		            }
		             
			else
		          {
		              switch(num)
		              {
		              
		       
		   
		   case 1 :
		   {
			   
		   
			  International inl = new International();
		     inl.setModelNo("787-400");
			 inl.setCapacity(414);
			 inl.setseating("Business");
		     System.out.println("Welcome to American Airlines International Services");
		     System.out.println("Model No :"+inl.getModelnNo());
		     System.out.println("Total Capacity :"+inl.getCpy());
		     System.out.println("Seating Preference :"+inl.getstp());
		    break;
		   
		   }
		   
		   case 2 :
		   {
		    Domestic dom=new Domestic();
		     dom.setModelNo("787-700");
			 dom.setCapacity(300);
			 dom.setseating("Economy");
		     System.out.println("Welcome to American Airlines Domestic Services");
		     System.out.println("Model No :"+dom.getModelnNo());
		     System.out.println("Total Capacity :"+dom.getCpy());
		     System.out.println("Seating Preference :"+dom.getstp());
		    break;
		    
		   }
		   
		}
		   
			
		
		          }
		      }

		}

	


		