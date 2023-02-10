package vectorDemoPackage;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(100);
		v.add('c');
		v.add("Kumar");
		v.add(10.25);
		v.add(1001);
		v.add(null);
		v.add("Prince");
		v.add('c');
		v.add("Kumar");
		v.add(10.25);
		v.add(null);
		
		System.out.println(v);
		
		Vector v1=new Vector(v);
		
		v1.addElement("Keshav");
		System.out.println(v1);
		

		
		
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.removeElement("Kumar"));
		System.out.println(v1.capacity());
		

	}

}
