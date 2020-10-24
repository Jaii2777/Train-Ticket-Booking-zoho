package TrainTicket;

import java.util.Scanner;
public class Ticket {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//TrainSeats ts=new TrainSeats();
		Booking b=new Booking();
		b.assign();
		//TrainSeats ts=new TrainSeats();
		while(true)
		{
			System.out.println("-----------------------WELCOME----------------------");
			System.out.println("1.BOOKING");
			System.out.println("2.CANCEL");
			System.out.println("3.PRINT BOOKED DETAILS");
			System.out.println("4.SHOW AVAILABLE");
			char c=sc.nextLine().charAt(0);
			switch(c)
			{
			
			case '1':
			{
				int no_Tickets;
				System.out.println("Enter number of tickets");
				 no_Tickets=Integer.parseInt(sc.nextLine());//Integer.parseInt(sc.nextLine());//sc.nextInt();//Integer.parseInt(sc.nextLine());//s.nextInt();
				b.Book(no_Tickets);
				//break;
			}
			case '3':
			{
				String Reg_name;
				System.out.println("Enter Your Registered Name ");
				Reg_name=sc.nextLine();
				System.out.println(Reg_name);
				b.checkDetails(Reg_name);
				//break;
			}
			case '4':
			{
				b.printaAvailabel();
			}
			}
		}

	}
}


