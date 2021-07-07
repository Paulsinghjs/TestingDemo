package org.partialabstraction;
              //Child class
public class College extends University {
		
public static void main(String[] args) {
	College a=new College();
	a.ug();
	a.pg();
}
public void ug() {
	System.out.println("UG:50%");	
}
public void pg() {
	System.out.println("PG:50%");	
}
}
