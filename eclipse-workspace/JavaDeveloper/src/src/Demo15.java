package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc1=new Scanner(System.in);
		System.out.println("Enter");
		int i=sc1.nextInt();
		double d=sc1.nextDouble();
		String s=sc1.next();
		System.out.println("String :"+s);
		System.out.println("Double :"+d);
		System.out.println("Int :"+i);
		sc1.close();
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a=0;
		while(a<k){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    ArrayList<String> arr=new ArrayList<String>();
		    for(int i1=0;i1<n;i1++){
		    	arr.add(sc.next());
		    }
		    for(int j=0;j<m;j++){
		      System.out.print(arr.get(j)+"\t");
		      j+=(arr.get(j).length()+2);
		    }
		      System.out.println();
		    a++;
		}
		sc.close();*/
		
		/*HashSet<Object> set=new HashSet();// Store heterogeneous value
		set.add(10);
		set.add("20");
		System.out.println(set);
		
		LinkedHashSet set1=new LinkedHashSet(); // Store heterogeneous value
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();// Store homogeneous value
		set1.add(10);
		set1.add("20");
		System.out.println(set1);*/
		
		
		/*Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a=0;
		while(a<x){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    HashSet<Integer> set1=new HashSet<Integer>();
		    HashSet<Integer> set2=new HashSet<Integer>();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=(i+1);
		    }
		    for(int i=0;i<m;i++){
		        set1.add(sc.nextInt());
		    }
		    for(int i=0;i<k;i++){
		        set2.add(sc.nextInt());
		    }
		    /*int count=0;
		    for(int i=0;i<m;i++){
		        if(set1.get(i).contains(set2.get(i))){
		            count++;
		            break;
		        }
		    }
		    set1.retainAll(set2);
		    System.out.print(set1.size()+" ");
		    set1.addAll(set2);
		    ArrayList al=new ArrayList(Arrays.asList(arr));
	        set1.removeAll(al);
	        System.out.println(set1);
		    a++;*/
		/* 
		Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(5);
        mySet.add(10);
        mySet.add(15);
        mySet.add(20);
        mySet.add(25);
        mySet.add(30);
        System.out.println(mySet);
        
        int max=Collections.max(mySet);
        System.out.println(max);
        //It will help you to get the index position based on value
        int i = new ArrayList<>(mySet).indexOf(20);
        System.out.println(i);*/
		
		/*
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<t;i++){
		    set.add(sc.nextInt());
		}
		int v=0,u=0,x=0,index = 0;
		for(int i=0;i<t-1;i++){
		    v=sc.nextInt();
		    u=sc.nextInt();
		    x=Collections.max(set);
		    index=new ArrayList<>(set).indexOf(x);
		    if(index==v || index==u){
		        set.remove(index);
		    }
		    
		}
		System.out.println(x);
		//set.add(x);*/
		
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


