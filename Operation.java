package session3.assignment4;

public class Operation {
	
	public double operate(String opCode, double number1, double number2){
		double result = 0.0;
		
		switch(opCode){
		
		    case "+" :
		    	result = number1 + number2;
		    	break;
		    case "-" :
		    	result = number1 - number2;
		    	break;
		    case "*" :
		    	result = number1 * number2;
		    	break;
		    case "/" :
		    	result = number1 / number2;
		    	break;
		    default :
		    	System.out.println("Please enter valid operation code +, -, * or /");
		    	
		    	
		}
		
		return result;
		
	}

}
