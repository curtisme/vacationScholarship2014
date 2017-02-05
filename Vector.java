public class Vector {
	private double[] V;
	//general iteration variable
	private int i;

	//create new empty vector of given length
	public Vector(int length) {
		V = new double[length];
		for (i=0;i<length;i++) 
			V[i] = 0;
	}
	//create new vector intialised with particular values
	public Vector(double[] values) {
		V = new double[values.length];
		for (i=0;i<values.length;i++) 
			V[i] = values[i];
	}

	//return value of particular component
	public double get(int pos) {
		return V[pos];
	}

	//set particular component value
	public void set(int pos, double x) {
		V[pos] = x;
	}

	//return size of array
	public int length() {
		return V.length;
	}

	//return vector magnitude
	public double size() {
		double total=0;
		for (i=0;i<V.length;i++) 
			total+=Math.pow(V[i],2);
		return Math.sqrt(total);
	}
	
	//test vector equality
	public boolean isEqual(Vector v) {
		if (v.length()!=V.length)
			return false;
		for (i=0;i<V.length;i++) 
			if (Math.abs(V[i] - v.get(i)) > 0.00001)
				return false;
		return true;
	}

	//Use to assign new values to vectors. Should be be of 
	//same length but will make do 
	public void copy(Vector v) {
		if (v.length() < V.length)
			return;
		for (i=0;i<V.length;i++) 
			V[i] = v.get(i);
	}

	
	public double[] toArray() {
		double[] n = new double[V.length];
		for (i=0;i<V.length;i++)
			n[i] = V[i];
		return n;
	}

	public String toString() {
		String s="";
		for(i=0;i<V.length;i++) 
			s+= Double.toString(V[i]) + " ";
		return s;
	}
}
