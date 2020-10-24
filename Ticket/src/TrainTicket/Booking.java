package TrainTicket;
import java.util.Scanner;
public class Booking 
{
	TrainSeats[] ts=new TrainSeats[63];
	TrainSeats[] rac=new TrainSeats[18];
	public void assign()
	{
	for(int i=0;i<63;i++)
	{
		ts[i]=new TrainSeats();
		ts[i].set("empty",-1,"empty","empty",-1);
	}
	}
	TrainSeats t=new TrainSeats();
	Scanner s=new Scanner(System.in);
	int no_Tickets,age;
	String name,gender,Reg_name;
		
	static int  seatnum=0,Rac=0;
	 
		public void Book(int  no_Tickets)
		{
			if(seatnum<=63)
			{
			boolean f=true;
			for(int i=0;i<no_Tickets;i++)
			{
				System.out.println("Enter your name");
				name=s.nextLine();
				
				System.out.println("Enter gender");
				gender=s.nextLine();
				System.out.println("Enter age");
				age=Integer.parseInt(s.nextLine());
						
				if(age>=60 || gender.equals("Female") || age<6 )
				{
					///ts[seatnum]=new TrainSeats();
					ts[seatnum].set(name,age,gender,"LOWER",seatnum);
				}
				else
				{
					//ts[seatnum]=new TrainSeats();
					if(f)
					{
					ts[seatnum].set(name, age, gender,"MIDDLE",seatnum );
					}
					else
					{
						ts[seatnum].set(name, age, gender,"UPPER",seatnum);
					}
					f=!f;
				}
				seatnum++;
			}
			}
			if(seatnum>63)
			{
				if(Rac<19)
				{
				rac[seatnum].set(name, age, gender,"RAC",Rac);
				Rac++;
				seatnum++;
			    }
		}
		}
		
		//Check Details For a User 
		public void checkDetails(String Reg_name)
		{
			for(int i=0;i<seatnum;i++)
			{
					if(Reg_name.equals(ts[i].name))
					{
						System.out.println("YOUR DETAILS IS----------------");
						t.print(ts[i].name,ts[i].age,ts[i].gender,ts[i].Berth,ts[i].seats);
					}
		}
		}
		public void printaAvailabel()
		{
			//String k="empty";
			for(int i=0;i<63;i++)
			{
				/*if(ts[i].name.equals("empty"))*/
				System.out.println(ts[i].name+" "+ts[i].age+" "+ts[i].gender+" "+ts[i].Berth+" ");
			}
		}
		
}
