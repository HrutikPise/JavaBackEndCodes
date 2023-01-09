package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

class Demo{
	private String name;
	private int age;
	public Demo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+"	"+age;
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {
		/*ArrayList<Demo> list=new ArrayList<>();
		list.add(new Demo("Hrutik1",10));
		list.add(new Demo("Hrutik2",20));
		list.add(new Demo("Hrutik3",30));
		list.add(new Demo("Hrutik",5));
		for(Demo lt:list) {
			System.out.println(lt);
		}
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(0,20);//add 20 in 0th index
		list1.remove(0);//remove 0th index
		System.out.println(list1);
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"Hello");
		map.put(5,"Hi");
		map.put(2,"Java");
		map.put(6,"Programming");
		map.put(9,"Code");
		map.put(12,"world");*/
		/*
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a=0;
		while(a<k){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    ArrayList<String> arr=new ArrayList<String>();
		    for(int i=0;i<n;i++){
		    	arr.add(sc.next());
		    }
		    for(int j=0;j<m;j++){
		      System.out.print(arr.get(j)+"\t");
		      j+=(arr.get(j).length()+2);
		    }
		      System.out.println();
		    a++;*/
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a=0;
		while(a<t){
		    ArrayList<String> list=new ArrayList<>();
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    for(int i=0;i<n;i++){
		        list.add(sc.next());
		    }
		    HashSet<String> set=new HashSet<String>(list);
		    int len=(set.size()-m);
		    System.out.println(len);
		}
		
	}

}
