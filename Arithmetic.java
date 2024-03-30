
package Arithmetic;

public class Arithmetic<Number1 extends Number, Number2 extends Number> {
    Number1 n1;
    Number2 n2;
    Number result;
    public Arithmetic(Number1 n1, Number2 n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Number getNum1() {
        return n1;
    }

    public Number getNum2() {
        return n2;
    }



    public Number add() {
        return n1.doubleValue() + n2.doubleValue();
    }

    public Number subtract() {
        return n1.doubleValue() - n2.doubleValue();
    }

    public Number multiply() {
        return n1.doubleValue() * n2.doubleValue();
    }

    public Number divide() {
        if(n2.equals(0)) {
            throw new ArithmeticException("Illegal divisor is found. Number must not be zero(0).");
        }
        return n1.doubleValue() / n2.doubleValue();
    }

    public Number getMin() {
        if(n1.doubleValue() < n2.doubleValue()) {
            return n1;
        }
        return n2;
    }

    public Number getMax() {
        if(n1.doubleValue() > n2.doubleValue()) {
            return n1;
        }
        return n2;
    }

}