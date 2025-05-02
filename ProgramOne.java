import java.util.Scanner;
class ProgramOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calculate = new Calculator(a,b);
        double result = calculate.calculation(operation);

        System.out.println("Result: "+ result);
    }
}

class Calculator{
    double a;
    double b;

    Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double calculation(String operation){
        switch(operation){
            case "add":
                return a+b;
            case "subtract":
                return a-b;
            case "multiply":
                return a*b;
            case "divide":
                return a/b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
    
}