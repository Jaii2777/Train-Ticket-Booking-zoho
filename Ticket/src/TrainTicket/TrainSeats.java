package TrainTicket;

public class TrainSeats 
{
	String name,gender,Berth;
	int age,seats;
	
	public void print(String name,int age,String gender,String Berth,int seats)
	{
		System.out.println("YOU ARE"+"--"+name);
		System.out.println("YOUR AGE IS"+"--"+age);
		System.out.println("YOU ARE"+"--"+gender);
		System.out.println("YOUR BERTH IS"+"--"+Berth);
		System.out.println("Seat Num Is"+"--"+seats);
	}
		public void set(String name,int age,String gender,String Berth,int seats)
		{
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.Berth=Berth;
			this.seats=seats;
			
			//print(name,age,gender,Berth,seats);
		}
		
		
}
