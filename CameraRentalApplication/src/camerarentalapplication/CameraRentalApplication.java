package camerarentalapplication;

import java.util.ArrayList;
import java.util.Scanner;

class Data {
	
	private int camera_id;
	private String model;
	private double price;
	private boolean status;
	private String brand;
	
	Data(int camera_id, String brand, String model, double price, boolean Available)
	{
		
		this.camera_id = camera_id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = Available;
		
	}
	
	public int getId()
	{
		return camera_id;
		
	}
	
	public String getBrand()
	{
		return brand;
	
	}
	
	public String getModel() 
	{
		return model;
		
	}
	
	public double getPrice()
	{
		return price;
		
	}
	
	public boolean isAvailable()
	{
		return status;
		
	}
	
	public void setAvailable(boolean Available)
	{
		this.status = Available;
		
	}
	
}

public class CameraRentalApplication {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		System.out.println("+------------------------------------+");
		System.out.println("|  Welcome To The Camera Rental App  |");
		System.out.println("+------------------------------------+\n");
		
		System.out.println("Please Login To Contiune:\n");
		
		double INR = 1500;
		
		String username, password;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Username:");// username:user
		username = s.nextLine();
		
		System.out.println("Enter Password:");// password:user
		password = s.nextLine();
		
		if (username.equals("Piyush Garg") && password.equals("Piyush@19")) {
			
			System.out.println("      ");
			System.out.println("+********************+");
			System.out.println("| Login Successfully |");
			System.out.println("+********************+\n");
			
			int ID = 1;
			
			ArrayList<Data> list = new ArrayList<>();
			
			list.add(new Data(ID++, "Canon", "DSLR", 1000, true));
			list.add(new Data(ID++, "Sony", "Ds123", 500, false));
			list.add(new Data(ID++, "LG", "5050", 280, true));
			list.add(new Data(ID++, "Lenova", "XPL", 300, true));
			list.add(new Data(ID++, "Nikon", "SRL", 350, true));
			list.add(new Data(ID++, "Sony", "2130", 260, false));
			list.add(new Data(ID++, "Samsung", "DL", 550, true));
			list.add(new Data(ID++, "LG", "Digital", 120, true));
			
			// int l=list.size();
			
			int x = 0;
			
			do {
				int option;
				
				Scanner sc = new Scanner(System.in);
				
				// public void main_option()
				
				System.out.println("**********");
				System.out.println("Main Menu");
				System.out.println("**********\n");
				
				System.out.println("1.MY CAMERA");
				System.out.println("2.RENT A CAMERA");
				System.out.println("3.VIEW ALL CAMERA");
				System.out.println("4.MY WALLET");
				System.out.println("5.EXIT\n");
				
				System.out.println("Please Select your option:");
				
				option = sc.nextInt();
				
				switch(option){
				
				case 1:
					
					int k=0;
					
					do {
						
						int choose;
						
						System.out.println("           ");
						System.out.println("***********");
						System.out.println(" MY CAMERA ");
						System.out.println("***********\n");
						
						System.out.println("1.ADD");
						System.out.println("2.REMOVE");
						System.out.println("3.VIEW MY CAMERA");
						System.out.println("4.GO TO PREVIOUS MENU\n");
						
						System.out.println("Please Enter Your Choice:");
						
						choose = sc.nextInt();
						
						switch(choose){
						
						case 1:
							
							int camera_id = ID++;
							
							System.out.println("ENTER CAMERA BRAND: ");
							String brand = sc.next();
							
							System.out.println("ENTER CAMERA MODEL: ");
							String model = sc.next();
							
							System.out.println("ENTER CAMERA PRICE PER DAY: ");
							
							double price = sc.nextFloat();
							boolean Available = true;
							
							list.add(new Data(camera_id, brand, model, price, Available));
							
							System.out.println("                    ");
							System.out.println("********************");
							System.out.println("Successfully Added");
							System.out.println("********************\n");
							
							System.out.println("Do you want to view the camera list");
							System.out.println("Please select option:");
							System.out.println("(1.YES 2.NO)");
							
							int m = sc.nextInt();
							if (m == 1)
							{
								System.out.println("==================================================");
								System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
								System.out.println("==================================================");
								
								for (int i = 0; i < list.size(); i++)
								{
									Data data = list.get(i);
									String status = data.isAvailable() ? "Available" : "Rended";
									System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()+ "\t" + data.getPrice() + "\t" + status);
									
								}
								
								System.out.println("==================================================");
								
							}
							
							System.out.println("\nIf you want go again my camera");
							System.out.println("Please select option:");
							System.out.println("(1.YES 2.NO):");
							
							k = sc.nextInt();
							break;
							
						case 2:
							
							System.out.println("Which one you want to remove 'Enter Camera Id':");
							int cameraId = sc.nextInt();
							
							for (int i = 0; i < list.size(); i++)
							{
								Data camera = list.get(i);
								if (camera.getId() == cameraId)
								{
									
									list.remove(i);
									
									System.out.println("  ");
									System.out.println("********************");
									System.out.println("Removed Successfully");
									System.out.println("********************\n");
									break;
									
								}
								
							}
							
							System.out.println("You want view camera list");
							System.out.println("Please select option:");
							System.out.println("(1.YES 2.NO)");
							
							int l = sc.nextInt();
							if (l == 1)
							{
								
								System.out.println("==================================================");
								System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
								System.out.println("==================================================");
								
								for (int i = 0; i < list.size(); i++)
								{
									Data data = list.get(i);
									String status = data.isAvailable() ? "Available" : "Rended";
									System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()+ "\t" + data.getPrice() + "\t" + status);
									
								}
								
								System.out.println("==================================================");
								
							}
							
							System.out.println("\nIf you want go again my camera");
							System.out.println("Please select option:");
							System.out.println("(1.YES 2.NO)");
							
							k = sc.nextInt();
							break;
							
						case 3:
							
							System.out.println("==================================================");
							System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
							System.out.println("==================================================");
							
							for (int i = 0; i < list.size(); i++)
							{
								Data data = list.get(i);
								String status = data.isAvailable() ? "Available" : "Rended";
								System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()+ "\t" + data.getPrice() + "\t" + status);
								
							}
							
							System.out.println("==================================================");
							System.out.println("\nIf you want go again my camera");
							System.out.println("Please select option:");
							System.out.println("(1.YES 2.NO)");
							
							k = sc.nextInt();
							break;
							
						case 4:
							
							x = 1;
							k = 2;
							break;
							
						}
						
					}
					
					while (k == 1);
					break;
					
				case 2:
					
					System.out.println("==================================================");
					System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
					System.out.println("==================================================");
					
					for (Data data : list)
					{
						if (data.isAvailable())
						{
							String status = data.isAvailable() ? "Available" : "Rended";
							System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t"+ data.getPrice() + "\t" + status);
							
						}
						
					}
					
					System.out.println("==================================================");
					
					int index = -1;
					
					System.out.println("\nWhich one you want to rent 'Enter Camera Id':");
					
					int cameraId = sc.nextInt();
					
					for (int i = 0; i < list.size(); i++)
					{
						Data camera = list.get(i);
						if (camera.getId() == cameraId)
						{
							index = i;
							break; // Found the camera, exit the loop
							
						}
						
					}
					
					if (index != -1)
					{
						Data a = list.get(index);
						if (a.getPrice() <= INR)
						{
							System.out.println("Rended Successfully\n");
							a.setAvailable(false);
							
							INR = INR - a.getPrice();
							System.out.println("Current wallet balance -"+INR);
							
						}
						
						else{
							
							System.out.println("You do not have sufficient balance in your wallet");
							}
						}
					
					else{
						
						System.out.println("Camera with id "+cameraId+"is not found in the list.");
						}
					
					System.out.println("\nIf you want go main menu");
					System.out.println("Please select option:");
					System.out.println("(1.YES 2.NO)");
					
					x = sc.nextInt();
					break;
					
				case 3:
					
					System.out.println("==================================================");
					System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
					System.out.println("==================================================");
					
					for (int i = 0; i < list.size(); i++)
					{
						Data data = list.get(i);
						String status = data.isAvailable() ? "Available" : "Rended";
						System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t" + data.getPrice() + "\t" + status);
						
					}
					
					System.out.println("==================================================");
					System.out.println("\nIf you want go main menu");
					System.out.println("Please select option:");
					System.out.println("(1.YES 2.NO)");
					
					x = sc.nextInt();
					break;
					
				case 4:
					
					System.out.println("Your current wallet balance is:" + INR);
					System.out.println("Do you want to deposit more amount to your wallet?");
					System.out.println("Please select option");
					System.out.println("(1.YES 2.NO)");
					
					int m = sc.nextInt();
					if (m == 1)
					{
						System.out.println("\nEnter deposit amount:");
						
						double addAmount = sc.nextDouble();
						INR = INR + addAmount;
						
						System.out.println("Your wallet balance updated successfully...\n");
						
					}
					
					System.out.println("Current wallet balance:" + INR);
					System.out.println("\nIf you want to go menu");
					System.out.println("Please select option:");
					System.out.println("(1.YES 2.NO)");
					
					x = sc.nextInt();
					break;
					
				case 5:
					
					x = 2;
					break;
					
				default:
					
					System.out.println("Invalid Input\n");
					break;
					
				}
				
			}
			
			while (x == 1);
			}
		
		else{
			
			System.out.println("**********************");
			System.out.println("Authentication Failed");
			System.out.println("**********************");
			}
		
		System.out.println("Thank You For Visiting Camera Rental Application Project");
	}
	
}


