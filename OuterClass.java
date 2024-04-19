class OuterClass{
int x = 10;
	private class Inner1{
	int x = 20;

	void display1(){
	System.out.println(OuterClass.this.x);
	System.out.println(this.x);
	}
	}
	
	public static void main(String args[]){
	OuterClass o = new OuterClass();
	Inner1 i = o.new Inner1();
	i.display1();
	//o.display1(); This will create an error.
	}
}
