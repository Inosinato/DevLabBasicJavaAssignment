package lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter date in format dd/MM/yyyy");
		String date = reader.next();
		reader.close();
		convertDate(date);
		
	}
	
	static void convertDate(String inputDate) {
		try
		{
			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(inputDate);
			System.out.println("Date is: " + date);
			
			
		/*	SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outputsdf.format(inputDate);//format
            System.out.println("After changing date format to yyyy/MM/dd : "+outputDate);
			*/
			
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
