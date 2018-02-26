package sef.ATestTask.SecondActivity;
// Complete Code

public class SecondActivity {

	public static void main(String[] args) {

		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		Calculator calc;
		System.out.println(calc.sum(x=10.2, y=5));
		System.out.println(calc.divide(x=100, y=33));




	}

	public class Calculator(){

	}public double sum (double x, double y){
		return x+y;
	}public double divide (double x, double y){
		return x/y;
	}



}public class CalculatorTest{
	public void checkSum(){
		Calculator myCalculator = new Calculator();
		assertEquals(10.2, myCalculator.sum(3.2,7));
		assertEquals(10.2, myCalculator.sum(-3.2,13));

		double x = 100 / 33;
		assertEquals(x, myCalculator.divide(100,33));

	}

}

}
