import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Chill Out Food Court");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Food Item Management");
			System.out.println("\t4. Add Sell or Show Quantity");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You Choose Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(f.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = f.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(f.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = f.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							f.showAllEmployees();
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
				
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You Choose Restaurant  Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Search A Restaurant");
					System.out.println("\t4. Show All Restaurant");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(f.insertRestaurant(r1)){System.out.println("Restaurant Inserted with ID: "+r1.getRid());}
							else{System.out.println("Restaurant can not be inserted");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Restaurant ID to Remove: ");
							String rid2 = sc.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								if(f.removeRestaurant(r2)){ System.out.println("Restaurant Removed with ID: "+r2.getRid());}
								else{System.out.println("Restaurant Can Not be Removed......");}
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							break;
							
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = f.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								System.out.println("Restaurant Found");
								System.out.println("Restaurant Name: "+r3.getName());
								System.out.println("Restaurant NID: "+r3.getRid());
								r3.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							
							
							break;
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Restaurant");
							System.out.println("---------------------------------");
							
							f.showAllRestaurants();
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("You Choose Food Item Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Food Item for a Restaurant");
					System.out.println("\t2. Remove Existing Food Item of a Restaurant");
					System.out.println("\t3. Search An Food Item for a Restaurant");
					System.out.println("\t4. Show All Food Item of a Restaurant");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Create a new Food Item for a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(f.searchRestaurant(rid1) != null)
							{
								System.out.println("\tWhat type of Food Item do you want to create?");
								System.out.println("\t1. Main Dish");
								System.out.println("\t2. Appetiziers");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Food Item Type: ");
								int itemType = sc.nextInt();
								
								if(itemType == 1)
								{
									System.out.print("Enter Food Item ID: ");
									String fid1 = sc.next();
									System.out.print("Enter Food Item Name: ");
									String name1 = sc.next();
									System.out.print("Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Price: ");
									double p1 = sc.nextDouble();
									System.out.println("Catagory: ");
									String cat1 = sc.next();
									
									MainDish md = new MainDish();
									md.setFid(fid1);
									md.setName(name1);
									md.setAvailableQuantity(aq1);
									md.setPrice(p1);
									md.setCategory(cat1);
									
									if(f.searchRestaurant(rid1).insertFoodItem(md))
									{
										System.out.println("Food Item Inserted for "+ rid1 + " with Food Item ID  " + fid1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
									
									
								}
								else if(itemType == 2)
								{
									System.out.print("Enter Food Item ID: ");
									String fid1 = sc.next();
									System.out.print("Enter Food Item Name: ");
									String name1 = sc.next();
									System.out.print("Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter Size: ");
									String sz = sc.next();
									
									Appetiziers ap = new Appetiziers();
									ap.setFid(fid1);
									ap.setName(name1);
									ap.setAvailableQuantity(aq1);
									ap.setPrice(p1);
									ap.setSize(sz);
									
									if(f.searchRestaurant(rid1).insertFoodItem(ap))
									{
										System.out.println("Food Item Inserted for "+ rid1 + " with Food Item ID  " + fid1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
								}
								else if(itemType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid Food Item Type");
								}
							}
							else
							{
								System.out.println("Restaurant ID MISMATCH");
							}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove Existing FooItem");
							System.out.println("---------------------------------");
							
							System.out.println("Enter a restaurant ID: ");
							String rid4 = sc.next();
							
							System.out.print("Enter an food item ID to Remove: ");
							String fid2 = sc.next();
							
							FoodItem f2 =  f.searchRestaurant(rid4).searchFoodItem(fid2);
							
							if(f2 != null)
							{
							
								if(f.searchRestaurant(rid4).removeFoodItem(f2))
								{
									System.out.println("Food Item Removed with ID: "+f2.getFid());
								}
								else{System.out.println("Food Item Can Not be Removed......");}
							}
							else
							{
								System.out.println("Food Item Does Not Exist");
							}
							break;	
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Food Item");
							System.out.println("---------------------------------");
							
							System.out.println("Enter a restaurant ID: ");
							String rid5 = sc.next();
							
							System.out.print("Enter Food Item ID: ");
							String fid3 = sc.next();
							
							FoodItem f3 = f.searchRestaurant(rid5).searchFoodItem(fid3);
							
							if(f3 != null)
							{
								System.out.println("Food Item Found");
								System.out.println("Food Item Name: "+f3.getName());
								System.out.println("Food Item ID: "+f3.getFid());
								f3.showInfo();
							}
							else
							{
								System.out.println("Food Item Does Not Exist");
							}
							break;	
						case 4:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Food Items");
							System.out.println("---------------------------------");
							frwd.readFromFile();
							break;
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;	
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
					
				case 4:
					System.out.println("---------------------------------");
					System.out.println("You Choose Quantity of Foods");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Quantity");
					System.out.println("\t2. Sell Quantity");
					System.out.println("\t3. Show Quantity History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Add Quantity");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(f.searchRestaurant(rid1) != null)
							{
								System.out.print("Enter Food Item ID: ");
								String fid1 = sc.next();
								
								if(f.searchRestaurant(rid1).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Amount to Add Quatity: ");
									int aq = sc.nextInt();
									
									if(f.searchRestaurant(rid1).searchFoodItem(fid1).addQuantity(aq))
									{
										System.out.println("Food Quantity Added Successfull");
										frwd.writeInFile("Food Quantity"+ aq +" in Food Item ID " + fid1 + " by " + rid1);
									}
									else
									{
										System.out.println("Can Not be Added");
									}
								}
								else
								{
									System.out.println("Invalid Food Item ID or Restaurant ID");
								}
								
							}
							else
							{
								System.out.println("Restaurant ID MISMATCH");
							}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to sell FooItem");
							System.out.println("---------------------------------");
							
							System.out.println("Enter a restaurant ID: ");
							String rid4 = sc.next();
							
							System.out.print("Enter an food item ID to sell: ");
							String fid2 = sc.next();
							
							FoodItem f2 =  f.searchRestaurant(rid4).searchFoodItem(fid2);
							
							if(f2 != null)
							{
							
								if(f.searchRestaurant(rid4).removeFoodItem(f2))
								{
									System.out.println("Sold food Item ID: "+f2.getFid());
								}
								else{System.out.println("Food Item is not in stock......");}
							}
							else
							{
								System.out.println("Food Item Does Not Exist");
							}
							break;		
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose See Adding Selling Quantity History");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
							
						default:
						
							break;
					}
					
					break;
				
				case 5:
					System.out.println("---------------------------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------------------------");
					repeat = false;
					break;
				
				default:
					System.out.println("-----------------------------------");
					System.out.println("Invalid Choice.....");
					break;
			}
			System.out.println("-----------------------------------\n");
		}
	}
}