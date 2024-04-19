abstract class Myclass{
abstract void calculate(double x);
}

class Sub1 extends Myclass{

	void calculate(double x){
	System.out.println("Square"+(x*x));
	}
}

class Sub2 extends Myclass{

	void calculate(double x){
	System.out.println("Square"+Math.sqrt(x));
	}
}

class Sub3 extends Myclass{

	void calculate(double x){
	System.out.println("Square"+(x*x*x));
	}
}

class AbstractClasses{
	public static void main(String args[]){
	Sub1 sub1 = new Sub1(); 
	Sub1 sub2 = new Sub1();
	Sub1 sub3 = new Sub1();  
	
        sub1.calculate(3);
        sub2.calculate(4);
        sub3.calculate(5);
        
        Myclass ref;
        ref = sub1;
        ref.calculate(3);
        
	}
}
