/**
 * 
 */
package Arithmetic_Calculator;

/**
 * @author libelef
 *
 */
import java.util.*;
public class ArithmeticCalculator {

	/**
	 * 
	 */
	
	private double n1;
	private double n2;
	private double result;
	private byte option;
	private double num;
	
	public ArithmeticCalculator() {
		// TODO Auto-generated constructor stub
		
		
	}


	/**
	 * @param args
	 */
	
	public double getN1() {
		return n1;
		
	}
	public double getN2() {
		return n2;
	}
	public byte getOption() {
		return option;
	}
	public double getNum() {
		return num;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public void setOption(byte option) {
		this.option = option;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	

	
	//Method to addition operation 
	public void addition(double n1, double n2) {
		double sum = n1+n2;
		System.out.println("Value 1: "+n1+""
				+ "Value 2: "+n2+"\noperation: Addition \nResult: "+sum);
	}
	
	//Method to subtraction  operation 
		public void subtraction(double n1, double n2) {
			try {
				double sub = n1-n2;
				System.out.println("Value 1: "+n1+""
						+ "Value 2: "+n2+"\noperation: Subtraction \nResult: "+sub);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Error occured. Please try again \nCause:"+e.getCause()+""
						+ "\nMessage: "+e.getMessage());menu();
			}

		}
		
		//Method to multiplication  operation 
				public void multiplication(double n1, double n2) {
					try {
						double multi = n1*n2;
						System.out.println("Value 1: "+n1+""
								+ "Value 2: "+n2+"\noperation: Multiplication \nResult: "+multi);
					} catch (ArithmeticException e) {
						// TODO: handle exception
						System.out.println("Error occured. Please try again \nCause:"+e.getCause()+""
								+ "\nMessage: "+e.getMessage());menu();
					}
				}
				
				//Method to division  operation 
				public void division(double n1, double n2) {
					try {
						double div = n1/n2;
						System.out.println("Value 1: "+n1+""
								+ "Value 2: "+n2+"\noperation: Division \nResult: "+div);
					} catch (ArithmeticException e) {
						// TODO: handle exception
						System.out.println("Error occured. Please try again \nCause:"+e.getCause()+""
								+ "\nMessage: "+e.getMessage());menu();
					}
				}
				
				public void subMenuCont() {
					System.out.println("\n*************************"
							+ "\\nSelect an option: \n1. Conitue \n0. Exit");
					try {
						Scanner scan = new Scanner(System.in);
						byte option = Byte.parseByte(scan.next());
						switch (option) {
						case 1: {
							menu();break;
						}
						case 0: {
							System.out.println("Exiting... Thank you!");break;
						}
						default:
							menu();
						}
						
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Invalid input. Please try again \nCause:"+e.getCause()+""
								+ "\nMessage: "+e.getMessage());subMenuCont();
					}
						
				}
				
				public void menu() {
					ArithmeticCalculator ac = new ArithmeticCalculator();
					System.out.println("Welcome to Arithmetic Calculator "
							+ "\ndev by Francisco Libele"
							+ "\n****************************\n");
					System.out.println("Please enter first   number: ");
					setN1(ac.inputVal());
					System.out.println("Please enter second   number: ");
					setN2(ac.inputVal());
					System.out.println("\nPlease select operaton"
							+ "\n1. Addition"
							+ "\n2. Subtraction"
							+ "\n3. Multiplication"
							+ "\n4. Division"
							+ "\n0. Exit");
					
					Scanner scan = new Scanner(System.in);
					this.option = Byte.parseByte(scan.next());
					
					switch (this.option) {
					case 1: {
						addition(getN1(), getN2());subMenuCont();
					}
					case 2: {
						subtraction(getN1(), getN2());subMenuCont();
					}
					case 3: {
						multiplication(getN1(), getN2());subMenuCont();
					}
					case 4: {
						division(getN1(), getN2());subMenuCont();
					}
					case 0: {
						System.out.println("Exiting...Thank you! "
								+ "\nDeveloped by by Francisco Libele");break;
					}
					default:
						//throw new IllegalArgumentException("Unexpected value: " + key);
						menu();break;
					}
					
				
					
				}
				
				public double  inputVal() {
		
					//Entering the first value
		
						System.out.println("Enter first number: ");
						Scanner scan = new Scanner(System.in);
						try {
							setNum(Double.parseDouble(scan.next()));
						//	System.out.println("Test: "+getN1());
							//control = 1;
						
						} catch (NumberFormatException e) {
							// TODO: handle exception
							System.out.println("Invalid value. Please try again. "
									+ "\nCaus: "+e.getCause()+"\n messsage: "+e.getMessage());inputVal();
						}
						return getNum();

				}
				
				
				
			
	
	
	
	public static void main(String[] args) {
		ArithmeticCalculator ac = new ArithmeticCalculator();
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		ac.menu();

		
		
	}
	


}
