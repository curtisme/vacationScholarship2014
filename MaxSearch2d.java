//A modification of MaxSearch that fixes the lengths of two edges
//and varies the two remaining. This is achieved by ensuring that
//the last two components of step * gradF are set to zero
public class MaxSearch2d {
	public static void main(String[] args) {
		
		//Objects for vector operations and function evaluation
		VectorOps V = new VectorOps();
		Functions2 F = new Functions2();

		//maxValues keeps two most recent 'best' points
		Vector v,next;
		Vector[] maxValues = new Vector[2];

		//step = stepsize
		double step;
		double[] start;
		final double epsilon = 0.0001;

		if (args.length != 5) {
			System.exit(0);
		}

		//read in values 
		step = Double.parseDouble(args[args.length-1]);
		start = new double[args.length-1];
		for (int i=0;i<args.length-1;i++) {
			start[i] = Double.parseDouble(args[i]);
		}

		//initialise starting position and maxValue array
		v = new Vector(start);
		maxValues[0] = new Vector(start);
		maxValues[1] = V.add(v, V.neg(F.dF(v)));

		//main loop
		do {
			//calculate gradient vector and multiply by step
			next = V.mult(F.dF(v), step);
			
			//set last two components to zero
			next.set(2,0);
			next.set(3,0);
			
			/*if next step will take us out of the allowed region,
			  reduce stepsize. if it gets to small, we're on the
			  boundary and trying to escape*/
			while (!F.inRange(V.add(v,next))) {
				next = V.mult(next, 0.1);
				if (next.size() < epsilon ) {
					//to come: code to move along the boundary
					System.out.println(v);
					System.exit(0);
				}
			}
			
			/*legal step, do assignment and leave old v for
			  garbage collector*/
			v = V.add(v,next);
			
			//simple loop check
			if (v.isEqual(maxValues[0]))
				break;
				
			//update maxValues
			if (F.F(v)>F.F(maxValues[0])) {
				maxValues[1].copy(maxValues[0]);
				maxValues[0].copy(v);
			}
			//System.out.println(v);
		} while (F.abs(F.F(maxValues[0]) - F.F(maxValues[1])) > epsilon);
		
		//broken loop, print out best point and associated function value
		System.out.println(maxValues[0] + " " + F.F(maxValues[0]));
		
		//Good show.
	}
}

