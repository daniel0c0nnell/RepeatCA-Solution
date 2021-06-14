package ie.lyit.flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // To be able to read the array list of passengers and enter in a apassengers name 

public class Booking{
	private Flight outboundFlight;
	private Flight inboundFlight;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private int count;
	static public int nextCount=1+;
	Scanner PassengerName= new Scanner(System.in);
	
	
	public Booking(Flight outboundFlight, Flight inboundFlight, ArrayList<Passenger> passengers, double totalPrice) {
		 this.outboundFlight=outboundFlight;
		 this.inboundFlight=inboundFlight;
		 this.passengers=passengers;
		 this.totalPrice=totalPrice; 
		 this.count=nextCount++;
		}
	
	
	@Override  // Overrides Object toString()
	public String toString(){
		return "Booking Number here" + count + " ==> "+outboundFlight+" to "+inboundFlight;
	}
	
		
		public boolean equals(Object obj) {
		   Booking bObject;
		   if (obj instanceof Booking)
			   bObject = (Booking)obj;
		   else
		       return false;
		 
		   return super.equals(bObject)
		          && this.count == bObject.count
		          && this.totalPrice == bObject.totalPrice;
}
				public boolean findPassenger(ArrayList<Passenger> List, Passenger p ) {
				boolean onFlight = false;
				String search= PassengerName.nextLine(); //allows for a searchlike option in finding a passenger
				
					for(int i =0; i < List.size(); i++) {
						if(p.getName() == List.get(i).getName()) {
							onFlight = true;
						
						}
					}
					return onFlight;
				}
		    
		   
		    		
		    		public Double calculatePrice() {
		    			totalPrice = (passengers.add(size inboundFlight.getprice() + outboundFlight.getprice()));
		    			return totalPrice;
		    	
		    		    }
		    		//set and get methods
		    		public void settotalPrice(double totalPrice){
		    		    this.totalPrice=totalPrice;
		    		}
		    		public double gettotalPrice(){
		    		   return totalPrice;
		    	    }
		    	   public void setpassengers(ArrayList<Passenger> passenger){
		    		    this.passengers=passengers;
		    		}
		    		public ArrayList<Passenger> getpassengers(){
		    		   return passengers;
		    	    }
		    	    public void setinboundFlight(Flight inboundFlight){
		    	       this.inboundFlight=inboundFlight;
		    	    }
		    	    public Flight getinboundFlight(){
		    	       return inboundFlight;
		    	    }
		    	    public void setoutboundFlight(Flight outboundFlight){
		    	       this.outboundFlight=outboundFlight;
		    	    }
		    	    public Flight getoutboundFlight(){
		    	       return outboundFlight;  
		    	       
		    	    }
		    		}
