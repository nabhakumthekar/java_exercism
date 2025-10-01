class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if(operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        switch(operation) {
            case "+": int sum = operand1 + operand2;
                        return operand1 + " " + operation + " " + operand2 + " = " + sum;
            case "*":  int mul = operand1 * operand2;
                        return operand1 + " " + operation + " " + operand2 + " = " + mul;
            case "/": 
                try {
                    int quotient = operand1 / operand2;
                    return operand1 + " / " + operand2 + " = " + quotient;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            default: throw new IllegalOperationException(
                    "Operation '" + operation + "' does not exist"
                );
        }

    }
}
