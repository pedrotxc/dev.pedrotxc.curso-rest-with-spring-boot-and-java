package dev.pedrotxc.rest_with_spring_boot_and_java.service;

import dev.pedrotxc.rest_with_spring_boot_and_java.exception.UnsupportedMathOperationException;
import dev.pedrotxc.rest_with_spring_boot_and_java.util.MathUtil;

public class MathService {

    public Double sum(String numberOne, String numberTwo) {

        if (!MathUtil.isNumeric(numberOne) || !MathUtil.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return MathUtil.convertToDouble(numberOne) + MathUtil.convertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo) {

        if (!MathUtil.isNumeric(numberOne) || !MathUtil.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return MathUtil.convertToDouble(numberOne) - MathUtil.convertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) {

        if (!MathUtil.isNumeric(numberOne) || !MathUtil.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return MathUtil.convertToDouble(numberOne) * MathUtil.convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) {

        if (!MathUtil.isNumeric(numberOne) || !MathUtil.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return MathUtil.convertToDouble(numberOne) / MathUtil.convertToDouble(numberTwo);
    }

    public Double mean(String numberOne, String numberTwo) {

        if (!MathUtil.isNumeric(numberOne) || !MathUtil.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return (MathUtil.convertToDouble(numberOne) / MathUtil.convertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String number) {

        if (!MathUtil.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return Math.sqrt(MathUtil.convertToDouble(number));
    }
}
