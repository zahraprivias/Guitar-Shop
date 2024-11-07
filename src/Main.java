import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<Guitar> guitars = new Vector<Guitar>();
	
	void insertGuitar() {
		String model = null;
		String brand;
		int stringnum;
		int baseprice = 0;
		String amp;
		String hybrid;
		String type;
		
		while (true) {
			System.out.println("Input guitar type:");
			System.out.println("1. Electric");
			System.out.println("2. Accoustic");
			System.out.println("3. Cancel");
			System.out.println("Input [Case Sensitive]: ");
			type = sc.nextLine();
			
			switch (type) {
			case "Electric":
				do {
				System.out.println("Input model [5-10 characters]: ");
				model = sc.nextLine();
				} while (model.length()<5 || model.length()>10);
				
				do {
					System.out.println("Input brand [Yamaha|Fender|Cort][Case Sensitive]: ");
					brand = sc.nextLine();
				} while (!brand.equals("Yamaha") && !brand.equals("Fender") && !brand.equals("Cort"));
				
				if (brand.equals("Yamaha")) {
					baseprice = 1500000;
				}
				if (brand.equals("Fender")) {
					baseprice = 2000000;
				}
				if (brand.equals("Cort")) {
					baseprice = 1000000;
				}
				
				do {
					System.out.println("Input numberOfStrings [6-8]: ");
					stringnum = sc.nextInt();
					sc.nextLine();
				} while (stringnum < 6 || stringnum > 8);
				
				do {
					System.out.println("Includes amp? [Yes|No][Case Insensitive]: ");
					amp = sc.nextLine();
				} while (!amp.equalsIgnoreCase("Yes") && !amp.equalsIgnoreCase("No"));
				
				guitars.add(new Electric(type, model, brand, stringnum, baseprice, amp));
				
				System.out.println("New electric guitar added!");
				System.out.println("Press enter to continue");
				sc.nextLine();
				return;
				
			case "Accoustic":
				do {
				System.out.println("Input model [5-10 characters]: ");
				model = sc.nextLine();
				} while (model.length()<5 || model.length()>10);
				
				do {
					System.out.println("Input brand [Yamaha|Fender|Cort][Case Sensitive]: ");
					brand = sc.nextLine();
				} while (!brand.equals("Yamaha") && !brand.equals("Fender") && !brand.equals("Cort"));
					
				if (brand.equals("Yamaha")) {
					baseprice = 1500000;
				}
				if (brand.equals("Fender")) {
					baseprice = 2000000;
				}
				if (brand.equals("Cort")) {
					baseprice = 1000000;
				}
					
				do {
					System.out.println("Input numberOfStrings [6-8]: ");
					stringnum = sc.nextInt();
					sc.nextLine();
				} while (stringnum < 6 || stringnum > 8);
				
				do {
					System.out.println("Is the guitar Hybrid? [Yes|No][Case Insensitive]: ");
					hybrid = sc.nextLine();
				} while (!hybrid.equalsIgnoreCase("Yes") && !hybrid.equalsIgnoreCase("No"));
				
				guitars.add(new Accoustic(type, model, brand, stringnum, baseprice, hybrid));
				
				System.out.println("New Accoustic guitar added!");
				System.out.println("Press enter to continue");
				sc.nextLine();
				return;

			case "Cancel":
				return;
			default:
				break;
			}
			}
	}
	
	void viewGuitar() {
		int index = 0;
		
		if (guitars.size() == 0) {
			System.out.println("There are no guitars in this catalogue yet!");
			System.out.println("Press enter to continue");
			
		} else {
			for (Guitar guitar : guitars) {
				System.out.println("No: "+ ++index);
				if (guitar instanceof Electric) {
					Electric elec = (Electric)guitar;
					System.out.println("Type: " + elec.getType());
					System.out.println("Model: " + elec.getModel());
					System.out.println("Brand: " + elec.getBrand());
					System.out.println("Strings: " + elec.getStringnum());
					System.out.println("Hybrid: -");
					System.out.println("Amp: " + elec.getAmp());
					System.out.println("Price: " + elec.calculatePrice());
					System.out.println(" ");
				} else if(guitar instanceof Accoustic){
					Accoustic acco = (Accoustic)guitar;
					System.out.println("Type: " + acco.getType());
					System.out.println("Model: " + acco.getModel());
					System.out.println("Brand: " + acco.getBrand());
					System.out.println("Strings: " + acco.getStringnum());
					System.out.println("Hybrid: " + acco.getHybrid());
					System.out.println("Amp: -");
					System.out.println("Price: " + acco.calculatePrice());
					System.out.println(" ");

				}
			}
			
		}
	}
	
	void deleteGuitar() {
		int index;
		if (guitars.size() > 0) {
			viewGuitar();
			
			do {
				System.out.println("Choose index to delete [1-" + guitars.size() + "]: ");
				index = sc.nextInt();
				sc.nextLine();
			} while (index < 1 || index > guitars.size());
			guitars.removeElementAt(index-1);
			System.out.println("Guitar "+index+" deleted!");
			System.out.println("Press enter to continue");
		} else {
			System.out.println("There are no guitars in this catalogue yet!");
		}
		
	}
	
	public Main() {
		int option;
		while (true) {
			System.out.println("1. Insert guitar");
			System.out.println("2. View guitar catalogue");
			System.out.println("3. Delete guitar");
			System.out.println("4. Exit");
			System.out.println("Input menu: ");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 1:
				insertGuitar();
				break;
			case 2:
				viewGuitar();
				break;
			case 3:
				deleteGuitar();
				break;
			case 4:
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
