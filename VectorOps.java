//object for performing operations on vectors
public class VectorOps {
	
	public Vector add(Vector v1, Vector v2) {
		Vector v = new Vector(v1.length());
		try {
			for (int i=0;i<v1.length();i++) 
				v.set(i, v1.get(i) + v2.get(i));
		}
		catch(Exception e) {
			System.out.println("Addition Error");
			System.exit(0);
		}
		return v;
	}

	public Vector mult(Vector v1, double a) {
		Vector v = new Vector(v1.length());
		for (int i=0;i<v1.length();i++)
		       v.set(i, a*v1.get(i));
		return v;
	}	

	public Vector neg(Vector v) {
		return mult(v,-1);
	}
}

