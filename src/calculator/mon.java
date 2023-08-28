package calculator;
import java.util.Objects;
import java.util.Scanner;


// CalculationInputsDTO.java

class CalculationInputsDTO {
    private final int data1;
    private final int data2;
    private final String operand;
    private int result;

    public int getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public CalculationInputsDTO(int data1, int data2, String operand) {
        this.data1 = data1;
        this.data2 = data2;
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "calculation of {" +
                "data1=" + data1 +
                ", data2=" + data2 +
                ", operand='" + operand + '\'' +
                ", result=" + result +
                '}';
    }
}

// CalculatorI.java

interface CalculatorI {
    void add(CalculationInputsDTO callingInputs);
    void sub(CalculationInputsDTO callingInputs);
    void mul(CalculationInputsDTO callingInputs);
    void div(CalculationInputsDTO callingInputs);
}

// BasicCalculatorImpl.java

class BasicCalculatorImpl implements CalculatorI {
    @Override
    public void add(CalculationInputsDTO callingInputs) {
        callingInputs.setResult(callingInputs.getData1() + callingInputs.getData2());
    }

    @Override
    public void sub(CalculationInputsDTO callingInputs) {
        callingInputs.setResult(callingInputs.getData1() - callingInputs.getData2());
    }

    @Override
    public void mul(CalculationInputsDTO callingInputs) {
        callingInputs.setResult(callingInputs.getData1() * callingInputs.getData2());
    }

    @Override
    public void div(CalculationInputsDTO callingInputs) {
        callingInputs.setResult(callingInputs.getData1() / callingInputs.getData2());
    }
}

// CalculatorApplication.java



class CalculatorApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Operand");
        String s = sc.nextLine();

        CalculationInputsDTO callingInputs = new CalculationInputsDTO(a, b, s);

        CalculatorI operation = new BasicCalculatorImpl();

        if (Objects.equals(s, "+") || Objects.equals(s, "-") || Objects.equals(s, "*") || Objects.equals(s, "/")) {
            switch (s) {
                case "-":
                    operation.sub(callingInputs);
                    break;
                case "+":
                    operation.add(callingInputs);
                    break;
                case "*":
                    operation.mul(callingInputs);
                    break;
                case "/":
                    operation.div(callingInputs);
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
        System.out.println(callingInputs);
    }
}