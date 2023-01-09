import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
 class AdminHome{ 
	 Scanner sc=new Scanner(System.in);
	 String adminname="abc",adminpass="123",add_film="";
	 int flag=0;
	 LinkedList<String> list1=new LinkedList<>();
	 ArrayList<String> arr=new ArrayList<>();
	public void AdminPage() {
		System.out.println("Enter a Admin name");
		String aname=sc.next();
		System.out.println("Enter a Admin password");
		String apass=sc.next();
		if(aname.equals(adminname)&& apass.equals(adminpass)) {
			System.out.println("Login Successful");
			list1.add("James");
			list1.add("KGF");
			list1.add("Vikrant Rona");
			list1.add("Robert");
			list1.add("#777Charlie");
			list1.add("Martin");
			System.out.println("______Welcome Admin_______");
			boolean entry=true;
			while(entry) {
				System.out.println("1. Add new film name");
				System.out.println("2. View film name");
				System.out.println("3. Remove film name");
				System.out.println("4. Search film name");
				System.out.println("5. History");
				System.out.println("6. Logout");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Add new film name");
					add_film=sc.next();
					if(!list1.contains(add_film)) {
						flag++;
						list1.add(add_film);
						System.out.println("new film added successfully");
					}else {
						System.out.println("Already Exits");
					}
					break;
				case 2:
					System.out.println("Films are available");
					for(String listdemo:list1) {
						System.out.println(listdemo);
					}
					break;
				case 3:
					System.out.println("Enter which film you want to remove");
					String remove_film=sc.next();
					if(list1.contains(remove_film)) {
						list1.remove(remove_film);
						System.out.println("Removed Successfully");
					}else {
						System.out.println("Oops!! Move not found");
					}
					break;
				case 4:
					System.out.println("4.Search film name");
					String search_film=sc.next();
					boolean sfilm=list1.contains(search_film);
					if(sfilm) {
						System.out.println("Film found: "+search_film);
					}else {
						System.out.println("Oops! not found");
					}
					break;
				case 6:
					System.out.println("Logout successful");
					arr.clear();
					System.exit(0);
				case 5:
					if(flag==0) {
						System.out.println("No Addition of film");
					}else if(flag>=1) {
						arr.add(add_film);
						System.out.println("History: "+arr);
					}
					break;
				default:
					System.out.println("invalid Choice");
				}
			}
		}else {
			System.out.println("Wrong credentials");
		}
	}
}

