// Final Project
// Authors: 
// Leah Mae Mamaril
// Cyrex Joshua Cuizon
// John Henly A. Montera

package cashier2;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Cashier2 
{
	static int quant;
	static double total, payment, change, Cash;
	static String all = "", order = "";
	static char Decision, Decision2, Decision3;

	public static void main(String[] args) 
	{

		Heading();
		Main2();

	}
//	
//	
//	
// METHOD MENU FOR CATEGORIES
//	
//	
//	

	private static void Main2()
	{
		String Choice;
		char FinalDecision;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		do 
		{
			System.out.println("------------------------------------------------------");
			System.out.println("\nSelect Category\n");
			System.out.println("1 - Food");
			System.out.println("2 - Drinks");
			System.out.println("3 - Exit");
			System.out.print("\nEnter Choice: ");
			Choice = scan.next();
			switch (Choice) 
			{
			case "1":
				Food();
				break;
			case "2":
				Drinks();
				break;
			case "3":
				Exit();
				break;
			default : 
				System.out.println("");
				System.out.println("------------------------------------------------------");
				System.out.println("       	    Invalid Input Please Try Again");
			}
			System.out.print("        Do You Still Want To Continue? [Y/N]: ");
			FinalDecision = scan.next().charAt(0); 
		}
		while(( FinalDecision == 'Y' || FinalDecision == 'y' ));
		System.out.println("\n______________________________________________________");
		System.out.println("\n******************************************************");
		System.out.println("______________________________________________________\n");
		System.out.println("           \"Thank You For Using This Program\"");
		System.out.println("               \"Have A Wonderful Day :D\"");
		System.out.println("______________________________________________________\n\n******************************************************");
		System.out.println("");
		System.exit(0);
	}

	private static void Heading() 
	{
		DateFormat dateFormat = new SimpleDateFormat("        EE MMMM dd yyyy HH:mm:ss aa");
		Date date = new Date();
		System.out.println("\n------------------------------------------------------");
		System.out.println(" _    _ _   _                       __           \r\n" + 
				"/  |_//  (_   /   _  | . _ . _  _   (    | _ _ \r\n" + 
				"\\__| \\\\____)  \\__(|)| )|(-| || )()  _)\\/_)|_(-|||\r\n" + 
				"                                  _/      /          "
				);
		System.out.println("------------------------------------------------------");
		System.out.println("       Location: Gaisano Mall of Davao 3rd floor      ");
		System.out.println("             Building Permit: 163 RT 0500             ");
		System.out.println("                   Store#: 051200");
		System.out.println(                dateFormat.format(date) + " CJ KEN");

	}
//	
//	
//	
// METHOD FOR FOOD CHOICE
//	
//	
//	
	private static void Food() 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("------------------------------------------------------");
		String[] Foodchoice = {"Carbonara", "Spaghetti with Fries" , "1pc. Chicken with Rice", "Top Burger with Fries"};
		double Foodprice[] = {110 , 140 , 90 , 80};
		String Food;
		System.out.println();
		System.out.println("Please Choose Category:\n");
		System.out.println("   <Type of Food>\t\t       <Food Price>\n");
		System.out.println("1 - Carbonara\t\t\t\tPhp 110.00");
		System.out.println("2 - Spaghetti with Fries\t\tPhp 140.00");
		System.out.println("3 - 1pc. Chicken with Rice\t\tPhp 90.00");
		System.out.println("4 - Top Burger with Fries\t\tPhp 80.00");
		System.out.println("5 - Back");
		System.out.print("\nSelect: ");
		Food = scan.next();

		switch(Food)
		{
		case "1":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Carbonara Would You Like To Order: ");
			quant = scan.nextInt();
			total += Foodprice[0] * quant;
			all += "\n" + Foodchoice[0] + "\t\t\t" + Foodprice[0] + "\t" + quant + "\t" +(Foodprice[0] * quant);
			order += "\n" + Foodchoice[0] + "\t\t\t" + Foodprice[0] + "\t" + quant + "\t" +(Foodprice[0] * quant);
			break;
		case "2":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Spaghetti w/ Fries Would You Like To Order: ");
			quant = scan.nextInt();
			total += Foodprice[1] * quant;
			all += "\n" + Foodchoice[1] + "\t\t" + Foodprice[1] + "\t" + quant + "\t" +(Foodprice[1] * quant);
			order += "\n" + Foodchoice[1] + "\t\t" + Foodprice[1] + "\t" + quant + "\t" +(Foodprice[1] * quant);
			break;
		case "3":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much 1pc.Chicken w/ Rice Would You Like To Order: ");
			quant = scan.nextInt();
			total += Foodprice[2] * quant;
			all += "\n" + Foodchoice[2] + "\t\t" + Foodprice[2] + "\t" + quant + "\t" +(Foodprice[2] * quant);
			order += "\n" + Foodchoice[2] + "\t\t" + Foodprice[2] + "\t" + quant + "\t" +(Foodprice[2] * quant);
			break;
		case "4":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Top Burger w/ Fries Would You Like To Order: ");
			quant = scan.nextInt();
			total += Foodprice[3] * quant;
			all += "\n" + Foodchoice[3] + "\t\t" + Foodprice[3] + "\t" + quant + "\t" +(Foodprice[3] * quant);
			order += "\n" + Foodchoice[3] + "\t\t" + Foodprice[3] + "\t" + quant + "\t" +(Foodprice[3] * quant);
			break;
		case "5":
			Main2();
		default : 
			System.out.println("\n------------------------------------------------------");
			System.out.println("         Sorry Wrong Input Please Try Again");
			System.out.print("        Do You Still Want To Continue? [Y/N]: ");
			Decision3 = scan.next().charAt(0);
			if( Decision3 == 'Y' || Decision3 == 'y') 
			{
				Food();
			}
			else 
			{
				Exit();
			}

		}

		System.out.print("        Do You Still Want To Continue? [Y/N]: ");
		Decision = scan.next().charAt(0);
		if( Decision == 'Y' || Decision == 'y') 
		{
			Main2();
		}
		else 
		{
			Total();
		}

	}
//	
//	
//	
// METHOD MENU FOR DRINKS CHOICE
//	
//	
//	
	private static void Drinks() 
	{

		String kd;
		char FinalDecision;
		do
		{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("\n------------------------------------------------------");
			System.out.println("\nPlease Choose Kinds of Drinks: \n");
			System.out.println("1 - Alcoholic Drinks");
			System.out.println("2 - Soft Drinks");
			System.out.println("3 - Back");
			System.out.print("\nSelect: ");
			kd = scan.next();
			switch (kd)
			{
			case "1":
				Drinks1();
				break;
			case "2":
				Drinks2();
				break;
			case "3":
				Main2();
				break;
			default:
				System.out.println("");
				System.out.println("------------------------------------------------------");
				System.out.println("       	    Invalid Input Please Try Again");
			}
			System.out.print("        Do You Still Want To Continue? [Y/N]: ");
			FinalDecision = scan.next().charAt(0); 
		}
		while(( FinalDecision == 'Y' || FinalDecision == 'y' ));
		System.out.println("------------------------------------------------------");
		System.out.println("\n******************************************************");
		System.out.println("______________________________________________________\n");
		System.out.println("           \"Thank You For Using This Program\"");
		System.out.println("               \"Have A Wonderful Day :D\"");
		System.out.println("______________________________________________________\n\n******************************************************");
		System.exit(0);
	}
//	
//	
//	
// METHOD FOR ALCOHOLIC DRINKS
//	
//	
//	
	private static void Drinks1()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] Drinkschoice = {  "Heineken", "Red Horse", "Tanduay Select", "Mule", "Back"};
		double Drinksprice [] = {70, 80, 70, 65};
		String Drinks;
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("\nPlease Choose Category:");
		System.out.println("\n<Type of Drinks>\t\t      <Drink Price>\n");
		System.out.println("1 - Heineken\t\t\t\tPhp 70.00");
		System.out.println("2 - Red Hourse\t\t\t\tPhp 80.00");
		System.out.println("3 - Tanduay Select\t\t\tPhp 70.00");
		System.out.println("4 - Mule\t\t\t\tPhp 65.00");
		System.out.println("5 - Back");
		System.out.print("\nSelect: ");
		Drinks = scan.next();
		switch (Drinks)
		{
		case "1":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Heineken Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice[0] * quant;
			all+="\n"+ Drinkschoice[0] + "\t\t\t" + Drinksprice[0] + "\t" + quant + "\t" + (Drinksprice[0] * quant);
			order +="\n"+ Drinkschoice[0] + "\t\t\t\t" + Drinksprice[0] + "\t" + quant + "\t" + (Drinksprice[0] * quant);
			break;

		case "2": 
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Red Horse Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice[1] * quant;
			all+="\n"+ Drinkschoice[1] + "\t\t\t" + Drinksprice[1] + "\t" + quant + "\t" + (Drinksprice[1] * quant);
			order +="\n"+ Drinkschoice[1] + "\t\t\t" + Drinksprice[1] + "\t" + quant + "\t" + (Drinksprice[1] * quant);
			break;

		case "3":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Tanduay Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice[2] * quant;
			all+="\n"+ Drinkschoice[2] + "\t\t\t" + Drinksprice[2] + "\t" + quant + "\t" + (Drinksprice[2] * quant);
			order +="\n"+ Drinkschoice[2] + "\t\t\t\t" + Drinksprice[2] + "\t" + quant + "\t" + (Drinksprice[2] * quant);
			break;
		case "4":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Mule Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice[3] * quant;
			all+="\n"+ Drinkschoice[3] + "\t\t\t\t" + Drinksprice[3] + "\t" + quant + "\t" + (Drinksprice[3] * quant);
			order +="\n"+ Drinkschoice[3] + "\t\t\t" + Drinksprice[3] + "\t" + quant + "\t" + (Drinksprice[3] * quant);
			break;

		case "5":

			Drinks();

		default:System.out.println("Sorry Wrong Input Please Try Again");
		System.out.print("        Do You Still Want To Continue? [Y/N]: ");
		Decision3 = scan.next().charAt(0);
		if( Decision3 == 'Y' || Decision3 == 'y') 
		{
			Drinks1();
		}
		else 
		{
			Exit();
		}

		}
		System.out.print("Would You Like To Add More? [Y/N]: ");
		Decision = scan.next().charAt(0);
		if( Decision == 'Y' || Decision == 'y') 
		{
			Main2();
		}
		else 
		{
			Total();
		}

	}
//	
//	
//	
// METHOD FOR SOFT DRINKS
//	
//	
//	
	private static void Drinks2()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] Drinkschoice2 = {  "Cola", "Ice Tea", "PineApple Juice", "Ice Cream Float", "Back"};
		double Drinksprice2 [] = {35, 40, 45, 50};
		String Drinks1;
		System.out.println("");
		System.out.println("\n------------------------------------------------------");
		System.out.println("Please Choose Category:");
		System.out.println("\n<Type of Drinks>\t\t      <Drink Price>\n");
		System.out.println("1 - Cola\t\t\t\tPhp 35.00");
		System.out.println("2 - Ice Tea\t\t\t\tPhp 40.00");
		System.out.println("3 - PineApple Juice\t\t\tPhp 45.00");
		System.out.println("4 - Ice Cream Float\t\t\tPhp 50.00");
		System.out.println("5 - Back");
		System.out.print("\nSelect: ");
		Drinks1 = scan.next();
		switch (Drinks1)
		{
		case "1":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Cola Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice2[0] * quant;
			all+="\n"+ Drinkschoice2[0] + "\t\t\t\t" + Drinksprice2[0] + "\t" + quant + "\t" + (Drinksprice2[0] * quant);
			order +="\n"+ Drinkschoice2[0] + "\t\t\t\t" + Drinksprice2[0] + "\t" + quant + "\t" + (Drinksprice2[0] * quant);
			break;

		case "2":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much Ice Tea Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice2[1] * quant;
			all+="\n"+ Drinkschoice2[1] + "\t\t\t\t" + Drinksprice2[1] + "\t" + quant + "\t" + (Drinksprice2[1] * quant);
			order +="\n"+ Drinkschoice2[1] + "\t\t\t\t" + Drinksprice2[1] + "\t" + quant + "\t" + (Drinksprice2[1] * quant);
			break;

		case "3":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much PineApple Juice Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice2[2] * quant;
			all+="\n"+ Drinkschoice2[2] + "\t\t\t" + Drinksprice2[2] + "\t" + quant + "\t" + (Drinksprice2[2] * quant);
			order +="\n"+ Drinkschoice2[2] + "\t\t\t" + Drinksprice2[2] + "\t" + quant + "\t" + (Drinksprice2[2] * quant);

			break;

		case "4":
			System.out.println("");
			System.out.print("");
			System.out.println("------------------------------------------------------");
			System.out.print("How Much IceCream Float Juice Would You Like To Order: ");
			quant = scan.nextInt();
			total+= Drinksprice2[3] * quant;
			all+="\n"+ Drinkschoice2[3] + "\t\t\t" + Drinksprice2[3] + "\t" + quant + "\t" + (Drinksprice2[3] * quant);
			order +="\n"+ Drinkschoice2[3] + "\t\t\t" + Drinksprice2[3] + "\t" + quant + "\t" + (Drinksprice2[3] * quant);

			break;

		case "5":

			Drinks();

		default:

			System.out.println("Sorry Wrong Input Please Try Again");
			System.out.print("        Do You Still Want To Continue? [Y/N]: ");
			Decision3 = scan.next().charAt(0);
			if( Decision3 == 'Y' || Decision3 == 'y') 
			{
				Drinks2();
			}
			else 
			{
				Exit();
			}

		}
		System.out.print("Would You Like To Add More? [Y/N]: ");
		Decision = scan.next().charAt(0);
		if( Decision == 'Y' || Decision == 'y') 
		{
			Main2();
		}
		else 
		{
			Total();
		}
	}
//	
//	
//	
// METHOD EXIT
//	
//	
//	
	private static void Exit() 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char FinalDecision;
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.print("    Are You Sure You Don't Want To Continue? [Y/N]: ");
		FinalDecision = scan.next().charAt(0);
		if (( FinalDecision == 'Y' || FinalDecision == 'y')) 
		{
			System.out.println("------------------------------------------------------");
			System.out.println("\n******************************************************");
			System.out.println("______________________________________________________\n");
			System.out.println("           \"Thank You For Using This Program\"");
			System.out.println("               \"Have A Wonderful Day :D\"");
			System.out.println("______________________________________________________\n\n******************************************************");
			System.exit(0);
		}
		else 
		{
			Main2();
		}

	}
//	
//	
//	
// METHOD FOR TOTAL
//	
//	
//	
	private static void Total()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.printf("\nTotal Order: Php %.2f" + " ", total);
		System.out.println("\n");
		System.out.print("Would You Like To Continue Ordering? [Y/N] : ");
		Decision = scan.next().charAt(0);
		if (Decision == 'Y' || Decision == 'y')
		{
			Main2();
		}
		else
		{
			Compute();
		}

	}
//	
//	
//	
// METHOD FOR COMPUTING
//	
//	
//	
	private static void Compute() 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char FinalDecision;
		System.out.print("\nEnter Cash: Php ");
		Cash = scan.nextDouble();

		if ( Cash >= total) 
		{
			change = Cash - total;
			System.out.print("\nDo you want a Official Receipt? [Y/N] : ");
			FinalDecision = scan.next().charAt(0);
			if (( FinalDecision == 'Y' || FinalDecision == 'y')) 
			{
				Receipt();
			}
			else 
			{
				System.out.println("------------------------------------------------------");
				System.out.printf("\nTotal Order: Php %.2f" + " ", total);
				System.out.printf("\nCash Rendered: Php %.2f" + " ", Cash);
				System.out.printf("\nChange Php %.2f" + " ", change);
				System.out.println("\n______________________________________________________\n");
				System.out.println("           \"Thank You For Using This Program\"");
				System.out.println("               \"Have A Wonderful Day :D\"");
				System.out.println("______________________________________________________\n\n******************************************************");
				System.exit(0);
			}

		}
		else 
		{
			System.out.println("------------------------------------------------------");
			System.out.println("______________________________________________________\n");
			System.out.println("                  \" Insufficient Money\"");
			System.out.println("______________________________________________________\n");
			Compute();
		}


	}
//	
//	
//	
// METHOD FOR RECEIPT
//	
//	
//	
	public static void Receipt()
	{
		DateFormat dateFormat = new SimpleDateFormat("        EE MMMM dd yyyy HH:mm:ss aa");
		Date date = new Date();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n______________________________________________________\n");
		System.out.print("");
		System.out.println("" + 
				" _    _ _   _                       __           \r\n" + 
				"/  |_//  (_   /   _  | . _ . _  _   (    | _ _ \r\n" + 
				"\\__| \\\\____)  \\__(|)| )|(-| || )()  _)\\/_)|_(-|||\r\n" + 
				"                                  _/      /          ");
		System.out.println("       Location: Gaisano Mall of Davao 3rd floor      ");
		System.out.println("             Building Permit: 163 RT 0500             ");
		System.out.println("                   Store#: 051200");
		System.out.println(dateFormat.format(date) + " CJ KEN");
		System.out.println("__________________________________________________");
		System.out.println("\nOrder\t\t\t\tPrice\tQnty\tTotal\n"+all+"\n---------------------------"
				+ "---------------------------\nTotal\t\t\t\t\t\t"+total+"\n------------------------------------------------------");
		System.out.print("Cash Rendered\t\t\t\t\t" + Cash);
		System.out.print("\nChange\t\t\t\t\t\t" + change + "\n");
		System.out.println("\n______________________________________________________");
		System.out.println("\n******************************************************");
		System.out.println("______________________________________________________\n");
		System.out.println("           \"Thank You For Using This Program\"");
		System.out.println("               \"Have A Wonderful Day :D\"");
		System.out.println("______________________________________________________\n\n******************************************************");
		System.out.println("");
		System.exit(0);


	}



}
