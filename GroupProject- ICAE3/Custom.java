import java.util.Scanner;

class CoffeeShop
{
	/*double bonus;
	
	CoffeeShop(){}
	
	CoffeeShop(String firstName, String lastName, String TPnumber, String ID,double bonus)
	{
		super(firstName,lastName,TPnumber,ID);
		this.bonus=bonus;
	}*/
	
	public void displayMenu()
	{
		System.out.println("\n\n           **** WHITE-MOON COFFEE SHOP ****\n");
		System.out.println ("             WELCOME TO OUR COFFEE SHOP");
		System.out.println ("         **********************************\n");
		System.out.println("          $$$$$$$$$$     MENU CARD    $$$$$$$$$$\n          ");
		System.out.println ("ITEM_NO     HOT COFFEE                    ITEM_NO        SNACKS\n");
		System.out.println ("  1.    Capaccino       Rs.300               5.    Sandwitch      Rs.250");
		System.out.println ("  2.    Cafe Latte      Rs.300               6.    Garlic Bread   Rs.180");
		System.out.println ("  3.    Cinnamon Coffee Rs.350               7.    Veg Pizza      Rs.900");
		System.out.println ("  4.    Vanilla Latte   Rs.250               8.    Veg Burger     Rs.450\n");
		System.out.println ("            COLD COFFEE                                 DESSERT\n");
		System.out.println ("  9.    Chocolate Shake Rs.480              12.    CheeseCake     Rs.250");
		System.out.println (" 10.    Iced Tead       Rs.200              13.    Brownies       Rs.150");
		System.out.println (" 11.    Cold Mocha      Rs.300              14.    StrawberryCake Rs.550\n");
		System.out.println ("       -----------ORDER ONLY OFFLINE---------\n");
		System.out.println ("Hotline: \t +999 999 999 | Whitemooncafe@gmail.com\n ");
		System.out.println ("-------------------------------------------------------");
		System.out.println ("............Place your orders below........\n...........  To get bill press 0...........");
		System.out.println ("-------------------------------------------------------\n");
	
	}
}
class Customer extends CoffeeShop {

    private String firstName;
    private String lastName;
    private String TPnumber;
	private String ID;
	private double total;
	String billArray[]=new String[10];
	int quantityArray[]=new int[10];
	int i;
	
	
	Customer()
	{
		total=0.0;
		
	}
	

    public Customer( String firstName, String lastName, String TPnumber, String ID )
	{
        this.firstName = firstName;
        this.lastName = lastName;
        this.TPnumber=TPnumber;
		this.ID=ID;
    }

    public String getFirstName() {
        return firstName;
    }
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}

    public String getLastName() {
        return lastName;
    }
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public String gettelephone() {
		return TPnumber;
	}
	
	public void settelephone(String TPnumber)
	{
		this.TPnumber=TPnumber;
	}
	public String getid() {
		return ID;
	}
	
	public void setID(String ID)
	{
		this.ID=ID;
	}
	public double getTotal()
	{
		return total;
	}
	
	
	public void getOrder()
	{
	
			Scanner sc=new Scanner (System.in);
			int choice, quantity;
			char choose;
			
			do{
				
            displayMenu();
			
			for(i=0; i<14; i++)
			{
				System.out.print("Choose the item you want to taste from the menu card: ");
				choice = sc.nextInt();
				if(choice==0)
					break;
				System.out.print("Enter the amount you want: ");
				quantity = sc.nextInt();
				quantityArray[i]=quantity;
				
				

				switch (choice) 
				{
					case 1:
						total+=quantity*300;
						billArray[i]="Capaccino       Rs.300.0";
									
						break;
					case 2:
						total+=quantity*300;
						billArray[i]="Cafe Latte      Rs.300.00";
						break;
					case 3:
						total+=quantity*350;
						billArray[i]="Cinnamon Coffee Rs.350.00";
						break;
					case 4:
						total+=quantity*250;
						billArray[i]="Vanilla Latte   Rs.250.00";
						break;
					case 5:
						total+=quantity*250;
						billArray[i]="Sandwitch   Rs.250.00";
						break;
					case 6:
						total+=quantity*180;
						billArray[i]="Garlic Bread   Rs.180.00";
						break;
					case 7:
						total+=quantity*900;
						billArray[i]="Veg Pizza   Rs.900.00";
						break;
					case 8:
						total+=quantity*450;
						billArray[i]="Veg Burger   Rs.450.00";
						break;
					case 9:
						total+=quantity*480;
						billArray[i]="Chocolate Shake   Rs.480.00";
						break;
					
					case 10:
						total+=quantity*200;
						billArray[i]="Iced Tead   Rs.200.0";
						break;
					case 11:
						total+=quantity*300;
						billArray[i]="Cold Mocha   Rs.300.0";
						break;
					case 12:
						total+=quantity*250;
						billArray[i]="CheeseCake   Rs.250.0";
						break;
					case 13:
						total+=quantity*150;
						billArray[i]="Brownies   Rs.150.0";
						break;
					case 14:
						total+=quantity*550;
						billArray[i]="StrawberryCake   Rs.550.0";
						break;
					default :
						System.out.println ("Enter valid choice!");
				}
				
			}
				getDetails();
				printBill();
				
				System.out.println ("Do you need to re order: (Y/N)");
				choose=sc.next().charAt(0);
			}while(choose=='y' || choose=='y');
			
			
			 	
    }
	
	public void getDetails()
	{
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Fill your details below....... :\n");
		
		System.out.print("Enter your First Name :");
		String firstName= sc.next();
		setFirstName(firstName);
		System.out.print("Enter your Last Name :");
		String lastName= sc.next();
		setLastName(lastName);
		System.out.print("Enter your Phone Number :");
		String TPnumber= sc.next();
		settelephone(TPnumber);
		System.out.print("Enter your NIC :");
		String ID=sc.next();
		setID(ID);
		
	}

	public void printBill()
	{
		System.out.println (" \n\n     WHITE-MOON COFFEE SHOP   ");
		System.out.println ("**********************************\n");
		System.out.println ("Customer name:"+getFirstName()+getLastName()+"\n\n");
		System.out.println ("Quantity  \tItem\t     Price\n"); 
		
		for(int j=0; j<i; j++)
		{
			System.out.println (quantityArray[j]+ "\t     " + billArray[j] + "\n"); 	
		}
		System.out.println ("\nTotal                        Rs." + getTotal()); 
		System.out.println("\n-----------Thank you!-----------");
	}
	
	
}

class CoffeeApp
{
	public static void main(String args[])
	{
	
	Customer abj2=new Customer();
	
	
	abj2.getOrder();
	
		
	
	}
}




