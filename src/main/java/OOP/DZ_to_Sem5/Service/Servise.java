package OOP.DZ_to_Sem5.Service;

import OOP.DZ_to_Sem5.Model.MathResult;
import OOP.DZ_to_Sem5.Service.impls.MathOperations;

public class Servise implements MathOperations {
    public MathResult sum(int a, int b) {
        return new MathResult(a + b);
    }
    @Override
    public MathResult difference(int a, int b) {
        return new MathResult(a - b);
    }
    @Override
    public MathResult multiplication(int a, int b) {
        return new MathResult(a * b);
    }
    @Override
    public MathResult division(int a, int b) {
        return new MathResult(a / b);
    }
}
