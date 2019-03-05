package MainExecution;



import com.encap.A;
import com.encap.B;
import com.encap.MathFunctionDouble;
import com.encap.MathFunctionFloat;
import com.inheritance.Neem;
import com.inheritance.inface.Naga;   

public class MainExecution {
	public static void main(String[] args) {
		Naga na=new Naga();
		na.salary();
		na.position();
		na.mycity();
		System.out.println(" empID :"+Naga .empId);
		
		Neem n1=new Neem();
		n1.add();
		n1.div();
		
		
		A m1=new A();
		m1.setI(45);
		m1.setJ(24);
		int i=m1.getI();
		int j=m1.getJ();
		m1.addresults(i, j);
		
		B m=new B();
		m.setI(59);
		m.setJ(945);
		int i1=m.getI();
		int j1=m.getJ();
		m.addresult(i1, j1);
		m.subresult(i1, j1);
		
		MathFunctionDouble md = new MathFunctionDouble();
		md.setNum1(54.5);

		md.setNum2(84.45);
		double d1 = md.getNum1();
		double d2 = md.getNum2();

		md.addresult(d1, d2);
		md.subresult(d1, d2);
		
	//	double dfloor=Math.floor(14.4);
		System.out.println(" math floor is "+Math.floor(14.4));

	}
}
