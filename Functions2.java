//F = min(f1-9), dF = grad F 

public class Functions2 {
	public double f1(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + w + x)*(w + x + y + z))/(w*x);
    }

   public double f2(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + y + z)*(w + x + y + z))/(y*z);
    }

   public double f3(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + w + x)*(w + y + x*y + w*z))/(x*y);
    }


   public double f4(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + y + z)*(w + y + x*y + w*z))/(w*z);
    }


   public double f5(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((w + x + y + z)*(w + y + x*y + w*z))/(w*y);
    }


   public double f6(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + w + x)*(x + x*y + z + w*z))/(w*z);
    }


   public double f7(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((1 + y + z)*(x + x*y + z + w*z))/(x*y);
    }


   public double f8(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((w + x + y + z)*(x + x*y + z + w*z))/(x*z);
    }


   public double f9(Vector v) {
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        return ((w + y + x*y + w*z)*(x + x*y + z + w*z))/(w*x*y*z);
    }
	
	public Vector df1(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,(1 + w + x)/(w*x) + (w + x + y + z)/(w*x) - ((1 + w + x)*(w + x + y + z))/(Math.pow(w,2)*x));
        n.set(1,(1 + w + x)/(w*x) + (w + x + y + z)/(w*x) - ((1 + w + x)*(w + x + y + z))/(w*Math.pow(x,2)));
        n.set(2,(1 + w + x)/(w*x));
        n.set(3,(1 + w + x)/(w*x));
        return n;
    }


   public Vector df2(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,(1 + y + z)/(y*z));
        n.set(1,(1 + y + z)/(y*z));
        n.set(2,(1 + y + z)/(y*z) + (w + x + y + z)/(y*z) - ((1 + y + z)*(w + x + y + z))/(Math.pow(y,2)*z));
        n.set(3,(1 + y + z)/(y*z) + (w + x + y + z)/(y*z) - ((1 + y + z)*(w + x + y + z))/(Math.pow(y,2)*z));
        return n;
    }


   public Vector df3(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,((1 + w + x)*(1 + z))/(x*y) + (w + y + x*y + w*z)/(x*y));
        n.set(1,(1 + w + x)/x + (w + y + x*y + w*z)/(x*y) - ((1 + w + x)*(w + y + x*y + w*z))/(Math.pow(x,2)*y));
        n.set(2,((1 + x)*(1 + w + x))/(x*y) - ((1 + w + x)*(w + y + x*y + w*z))/(x*Math.pow(y,2)));
        n.set(3,((1 + x)*(1 + w + x))/(x*y) - ((1 + w + x)*(w + y + x*y + w*z))/(x*Math.pow(y,2)));
        return n;
    }


   public Vector df4(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,((1 + z)*(1 + y + z))/(w*z) - ((1 + y + z)*(w + y + x*y + w*z))/(Math.pow(w,2)*z));
        n.set(1,(y*(1 + y + z))/(w*z));
        n.set(2,((1 + x)*(1 + y + z))/(w*z) + (w + y + x*y + w*z)/(w*z));
        n.set(3,((1 + x)*(1 + y + z))/(w*z) + (w + y + x*y + w*z)/(w*z));
        return n;
    }


   public Vector df5(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,((1 + z)*(w + x + y + z))/(w*y) + (w + y + x*y + w*z)/(w*y) - ((w + x + y + z)*(w + y + x*y + w*z))/(Math.pow(w,2)*y));
        n.set(1,(w + x + y + z)/w + (w + y + x*y + w*z)/(w*y));
        n.set(2,((1 + x)*(w + x + y + z))/(w*y) + (w + y + x*y + w*z)/(w*y) - ((w + x + y + z)*(w + y + x*y + w*z))/(w*Math.pow(y,2)));
        n.set(3,((1 + x)*(w + x + y + z))/(w*y) + (w + y + x*y + w*z)/(w*y) - ((w + x + y + z)*(w + y + x*y + w*z))/(w*Math.pow(y,2)));
        return n;
    }


   public Vector df6(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0, (1 + w + x)/w + (x + x*y + z + w*z)/(w*z) - ((1 + w + x)*(x + x*y + z + w*z))/(Math.pow(w,2)*z));
        n.set(1,((1 + w + x)*(1 + y))/(w*z) + (x + x*y + z + w*z)/(w*z));
        n.set(2,(x*(1 + w + x))/(w*z));
        n.set(3,(x*(1 + w + x))/(w*z));
        return n;
    }


   public Vector df7(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,(z*(1 + y + z))/(x*y));
        n.set(1,((1 + y)*(1 + y + z))/(x*y) - ((1 + y + z)*(x + x*y + z + w*z))/(Math.pow(x,2)*y));
        n.set(2,(1 + y + z)/y + (x + x*y + z + w*z)/(x*y) - ((1 + y + z)*(x + x*y + z + w*z))/(x*Math.pow(y,2)));
        n.set(3,(1 + y + z)/y + (x + x*y + z + w*z)/(x*y) - ((1 + y + z)*(x + x*y + z + w*z))/(x*Math.pow(y,2)));
        return n;
    }


   public Vector df8(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0,(w + x + y + z)/x + (x + x*y + z + w*z)/(x*z));
        n.set(1,((1 + y)*(w + x + y + z))/(x*z) + (x + x*y + z + w*z)/(x*z) - ((w + x + y + z)*(x + x*y + z + w*z))/(Math.pow(x,2)*z));
        n.set(2,(w + x + y + z)/z + (x + x*y + z + w*z)/(x*z));
        n.set(3,(w + x + y + z)/z + (x + x*y + z + w*z)/(x*z));
        return n;
    }


   public Vector df9(Vector v) {
        Vector n = new Vector(4);
        double w = v.get(0);
        double x = v.get(1);
        double y = v.get(2);
        double z = v.get(3);
        n.set(0, (w + y + x*y + w*z)/(w*x*y) + ((1 + z)*(x + x*y + z + w*z))/(w*x*y*z) - ((w + y + x*y + w*z)*(x + x*y + z + w*z))/(Math.pow(w,2)*x*y*z));
        n.set(1,((1 + y)*(w + y + x*y + w*z))/(w*x*y*z) + (x + x*y + z + w*z)/(w*x*z) - ((w + y + x*y + w*z)*(x + x*y + z + w*z))/(w*Math.pow(x,2)*y*z));
        n.set(2,(w + y + x*y + w*z)/(w*y*z) + ((1 + x)*(x + x*y + z + w*z))/(w*x*y*z) - ((w + y + x*y + w*z)*(x + x*y + z + w*z))/(w*x*Math.pow(y,2)*z));
        n.set(3,(w + y + x*y + w*z)/(w*y*z) + ((1 + x)*(x + x*y + z + w*z))/(w*x*y*z) - ((w + y + x*y + w*z)*(x + x*y + z + w*z))/(w*x*Math.pow(y,2)*z));
        return n;
    }
	
	private interface Func {
		double f(Vector v);
	}
	
	private interface dFunc {
		Vector df(Vector v);
	}
	
	private Func[] funcs = new Func[] {
		new Func() {public double f(Vector v){return f1(v);}},
		new Func() {public double f(Vector v){return f2(v);}},
		new Func() {public double f(Vector v){return f3(v);}},
		new Func() {public double f(Vector v){return f4(v);}},
		new Func() {public double f(Vector v){return f5(v);}},
		new Func() {public double f(Vector v){return f6(v);}},
		new Func() {public double f(Vector v){return f7(v);}},
		new Func() {public double f(Vector v){return f8(v);}},
		new Func() {public double f(Vector v){return f9(v);}},
	};
	
	private dFunc[] dfuncs = new dFunc[] {
		new dFunc() {public Vector df(Vector v){return df1(v);}},
		new dFunc() {public Vector df(Vector v){return df2(v);}},
		new dFunc() {public Vector df(Vector v){return df3(v);}},
		new dFunc() {public Vector df(Vector v){return df4(v);}},
		new dFunc() {public Vector df(Vector v){return df5(v);}},
		new dFunc() {public Vector df(Vector v){return df6(v);}},
		new dFunc() {public Vector df(Vector v){return df7(v);}},
		new dFunc() {public Vector df(Vector v){return df8(v);}},
		new dFunc() {public Vector df(Vector v){return df9(v);}},
	};
	
	private int region(Vector v) {
		int i, min_index = 0;
		double val, min = funcs[0].f(v);
		for(i=1;i<funcs.length;i++) {
			val = funcs[i].f(v);
			if (val<min) {
				min = val;
				min_index = i;
			}
		}	
		return min_index;
	}
	
	
	public double F(Vector v) {
		return funcs[region(v)].f(v);
	}
	
	public Vector dF(Vector v) {
		return dfuncs[region(v)].df(v);
	}

	public double abs(double x) {
		return (x<0) ? -1*x : x;
	}
	
	//check if v is in the domain
	public boolean inRange(Vector v) {
		double w = v.get(0);
		double x = v.get(1);
		double y = v.get(2);
		double z = v.get(3);
		boolean a = (x+w>1)&&(x+1>w)&&(w+1>x);
		boolean b = (y+z>1)&&(y+1>z)&&(z+1>y);
		return a&&b;
	}
	
}