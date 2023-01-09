import java.util.ArrayList;

import java.util.Iterator;

class Demo12{
String name;
int id;
public Demo12(String name,int id){
this.name=name;
this.id=id;
}
public String toString(){
return name+" "+id;
}
}



public class ListDemos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Demo12> cars = new ArrayList<Demo12>();
	    cars.add(new Demo12("hrutik", 12));
	    cars.add(new Demo12("Praveen",13));
	    cars.add(new Demo12("Ganguly",14));
	    cars.add(new Demo12("Prashant",15));
	  
	  
	    // First way Print the item
	    //for(Demo12 c:cars){
	    //	 System.out.println(c);
	    //}
	    
	    // Secound way Print the item
	    //for(int index=0;index<cars.size();index++) {
			//System.out.println(cars.get(index));
		//}
	    
	    //Third way to print the item
	    Iterator<Demo12> it = cars.iterator();
	    while(it.hasNext()) {
	    	Demo12 c = it.next();
	          System.out.println(c);
	    }


	}

}
