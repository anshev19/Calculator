package com.company;

public class IntsCalculator implements Ints {

    private Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double res = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        long roundedRes = Math.round(res);
        if (roundedRes > Integer.MAX_VALUE) {
            throw new RuntimeException("Integer type is unsuitable for the result value");
        }

        return (int) roundedRes;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double res = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        long roundedRes = Math.round(res);
        if (roundedRes > Integer.MAX_VALUE) {
            throw new RuntimeException("Integer type is unsuitable for the result value");
        }

        return (int) roundedRes;
    }

    @Override
    public int pow(int a, int b) {
        double res = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        long roundedRes = Math.round(res);
        if (roundedRes > Integer.MAX_VALUE) {
            throw new RuntimeException("Integer type is unsuitable for the result value");
        }

        return (int) roundedRes;
    }
}
