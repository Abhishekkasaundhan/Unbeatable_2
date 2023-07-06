import java.util.*;

public class Electricity_bill
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   String name ="" , contact = "" , address="";
	   int meter_no , new_reading , old_reading;
	   
	   System.out.print("Enter the Customer Name : ");
	   name = sc.nextLine();
	   System.out.print("Enter the contact No. : ");
	   contact=sc.nextLine();
	   System.out.print("Enter the address : ");
	   address=sc.nextLine();
	   System.out.print("Enter the Meter No. : ");
	   meter_no  = sc.nextInt();
	   System.out.print("Enter the New Reading : ");
	   new_reading = sc.nextInt();
	   System.out.print("Enter the Old Reading : ");
	   old_reading = sc.nextInt();
	   
	   int current_reading = new_reading - old_reading;
	   
	   float tax=0, charges=0;
	   
	   if(current_reading>=1 && current_reading<100)
	   {
	       charges = current_reading*0.80f;
	       tax = charges*0.02f;
	   }
	   else if(current_reading>100 && current_reading<=300)
	   {
	       charges = current_reading*1;
	       tax = charges*0.05f;
	   }
	   else if(current_reading>300 && current_reading<=500)
	   {
	       charges = current_reading*1.2f;
	       tax = charges*0.07f;
	   }
	   else if(current_reading>500 && current_reading<=800)
	   {
	       charges = current_reading*2;
	       tax = charges*0.11f;
	   }
	   else if(current_reading>800 && current_reading<=1200)
	   {
	       charges = current_reading*2.5f;
	       tax = charges*0.15f;
	   }
	   else if(current_reading>1200)
	   {
	       charges = current_reading*3.40f;
	       tax = charges*0.18f;
	   }
	   
	    int meter_rent =50;
	     
	    float total_charges =charges + tax + meter_rent;
	    
	    System.out.println("\n********** Electricity Bill ***********\n");
	    System.out.println("Name of the Customer : " + name);
	    System.out.println("Contact No. of the Customer : " + contact);
	    System.out.println("Address of the Customer : " + address);
	    System.out.println("Meter No. of the Customer : " + meter_no);
	    System.out.println("New Reading of the Customer : " + new_reading);
	    System.out.println("Old Reading : " + old_reading);
	    System.out.println("Current Reading : "+ current_reading);
	    System.out.println("Charges of the Customer : " + charges);
	    System.out.println("Tax of the Customer : " +tax);
	    System.out.println("Meter Rent of the Customer : " + meter_rent);
	    System.out.println("Total charges of the customer : " + total_charges);
	    System.out.println("\n********** The End *********");
	    
	}
}