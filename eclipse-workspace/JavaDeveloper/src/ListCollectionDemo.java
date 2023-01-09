
import java.util.LinkedList;

class ListDemo{
	private String name;
	ListDemo(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}

class ListDemoException extends Exception {
	ListDemoException(String meg){
		super(meg);
	}
}

public class ListCollectionDemo {

	public static void main(String[] args) throws ListDemoException {
		// TODO Auto-generated method stub
		LinkedList<ListDemo> list=new LinkedList<ListDemo>();
		list.add(new ListDemo("hrutik"));
		list.add(new ListDemo("praveen"));
		list.add(new ListDemo("Ganguly"));
		list.add(new ListDemo("Prashant"));
		
		System.out.println("Printing in Assending Order");
		for(ListDemo i:list) {
			System.out.println(i);
		}
		
		System.out.println("Printing in Reverse Order");
		for(int index=list.size()-1;index>=0;index--) {
			if(index>=list.size()) {
				throw new ListDemoException("Index Not More Then Size");
			}
			System.out.println(list.get(index));
		}
		
		list.removeFirst();
		list.remove(0);
		list.removeLast();
		System.out.println("Remove All the element Order in the list");
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("Add All the element Order in the list");
		list.addFirst(new ListDemo("hrutik123"));
		list.add(1, new ListDemo("praveen"));
		list.addLast(new ListDemo("Prashant123"));
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
	}


}
