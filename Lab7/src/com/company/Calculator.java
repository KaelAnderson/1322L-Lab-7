package com.company;

public class Calculator implements CalcOp{
    @Override
    public float add(float input1, float input2) {
        return (input1 + input2);
    }

    @Override
    public float subtract(float input1, float input2) {
        return (input1 - input2);
    }

    @Override
    public float multiply(float input1, float input2) {
        return (input1 * input2);
    }

    @Override
    public float divide(float input1, float input2) {
        return (input1 / input2);
    }
}
