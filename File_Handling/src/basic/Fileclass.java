package basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Fileclass {

	public static void main(String[] args) throws ParseException {
		//Creating the file
		try {
		File myob=new File("D:FileHandling.txt");
		Scanner sc = new Scanner(myob);
		Date date;
		if(myob.createNewFile())
		{
			System.out.println("File Created"+myob.getName());
		}else
		{
			System.out.println("File already Exist");
			System.out.println(myob.getAbsolutePath());
			System.out.println(myob.canRead());
			System.out.println(myob.canWrite());
			System.out.println(myob.canExecute());
			System.out.println(myob.length());
			System.out.println("Hidden: "+myob.isHidden());
			//System.out.println("Deleted "+myob.delete());
			while (sc.hasNext())
			{
			
			// date = new SimpleDateFormat("mm-dd-yyyy").parse("12032019");
			// System.out.println(data);
			}
			sc.close();
			
		}
		}catch(IOException E)
		{
			System.out.println("An Error");
			E.printStackTrace();
		}
				
		
		//FileWriter fw = new FileWriter("D:FileHandling.txt");
		//fw.write("Hello i will be availble on 09/12/2019 and not any other date");
		//fw.close();
		System.out.println("Succesfully wrote in the file");
		
		String a ="Madam";
		Stringbuffer 
		
	}

}
