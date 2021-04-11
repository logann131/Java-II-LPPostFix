/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment
 */ 
import java.util.*;

public class PostFix
{
    private Stack<Double> stack; //null
    private String expression;  //null

    // default constructor
    public PostFix()
    {
        //automatically calls a onstructor in this class
        //that matches the  parameters
        this("");
    }

    // TODO: Parameterized constructor
    // @param exp - the PostFix expression that needs to be solved
    public PostFix(String exp)
    {
        this.stack = new Stack<>();
        expression = exp;
    }

    // TODO: This method receives two numbers and a math operator (*,-,+,/)
    // @param one - first number
    // @param two - second number
    // @param char - math operator * - + /
    // @return the calculated amount
    public double calc(double one, double two, char op)
    {
        double answer = 0.0;

        switch(op) {
            case '*': answer = one * two;
                break;

            case '+': answer = one + two;
                break;

            case '-': answer = one - two;
                break;

            case '/': answer = one / two;
                break;

        }

        return answer;
    }

    // TODO: This method performs all the math operations in the PostFix expression and
    // returns a String containing the original expression and the calculated answer
    public String solve() {
        //parse the expression into individual values (split)
        //split returns a array of String

        String[] items = expression.split(" ");
        //Debug Statement
//        System.out.println(Arrays.toString(items));

        if (items.length > 1) {
            //for each or traditional
            // for (type name : arrays)
            for (String item : items) {
//                if item is actually a digit, push it on stack
                if (Character.isDigit(item.charAt(0))) {
                    stack.push(Double.parseDouble(item));
                } else { //the value is an operator
                    double num2 = stack.pop();
                    double num1 =  stack.pop();
                    double answer = calc(num1, num2, item.charAt(0));
                    stack.push(answer);
                }
            } // end of the for each

            return expression + " = " +stack.peek();
        }
        return "No calculations performed, no items";

    }

    public String toString()
    {
        return "Expression: " +expression+", Stack: " + stack+"\n";
    }
}
