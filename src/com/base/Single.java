package com.base;

public class Single {
	public static Single name;
	private static Single empId() {
		int identityHashCode = System.identityHashCode(name);
		System.out.println("memory address before creating a object :"+identityHashCode);
		if (name==null) {
			name=new Single();
			int identityHashCode2 = System.identityHashCode(name);
			System.out.println("memory addreess after creating a object:"+identityHashCode2);
		}
		return name;
		

	}
	private void empName() {
		System.out.println("employee name is raj ");

	}
	public static void main(String[] args) {
		Single empId = empId();
		int identityHashCode = System.identityHashCode(empId);
		System.out.println(identityHashCode);
		empId.empName();
		Single empId2 = empId;
System.out.println(System.identityHashCode(empId2));		
	}
	
	
	
	 
	
	
	
	

}
