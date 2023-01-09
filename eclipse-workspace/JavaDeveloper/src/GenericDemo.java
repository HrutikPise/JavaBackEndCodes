class SimpleGeneric<E>{
	void showObjectType(Object item) {
		System.out.println(item+": "+item.getClass().getName());
	}
}

class Demoo{ 
	String name;
	int age;
	Demoo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name+" "+age;
	}
}


public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoo d=new Demoo("hrutik",21);
	
		SimpleGeneric<String>  genClass = new SimpleGeneric<>();
		SimpleGeneric<String>  genClass1 = new SimpleGeneric<>();
		genClass.showObjectType("Hrutik");
		genClass1.showObjectType(1);
		
		SimpleGeneric<Demoo>  genClass2 = new SimpleGeneric<>();
		genClass2.showObjectType(d);
	}

}
