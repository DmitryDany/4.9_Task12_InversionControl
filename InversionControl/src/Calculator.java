public class Calculator {
    Operation operation;
    public Calculator(Operation operation){
        this.operation = operation;
    }
    public void calc(String c, double a, double b){
        System.out.println(operation.getText(c) + operation.getResult(a,b));
    }
}
