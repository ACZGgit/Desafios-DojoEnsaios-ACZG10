package ensaio1Calculadora.services

import ensaio1Calculadora.interfaces.ICalculadora


class CalculadoraCientificaService implements ICalculadora{

    private double lastResult;


    CalculadoraCientificaService(){
        this.lastResult = 0
    }

    double getLastResult(){

    }

    private void setLastResult(double lastResult){
    }

    @Override
    double sum(double x, double y){
        lastResult =  x + y
        return lastResult
    }

    @Override
    double sub(double x, double y) {
        lastResult =  x - y
        return lastResult
    }

    @Override
    double div (double x, double y){
        if (y == 0){
            throw new ArithmeticException ("Valor 0 não permitido")
        }
        lastResult =  x / y
        return lastResult
    }

    @Override
    double mult(double x, double y){
        lastResult = x * y
        return lastResult
    }

    double raiz(double x) {
        if (x < 0) {
            throw new ArithmeticException("Valor não pode ser negativo")
        }

        lastResult = Math.sqrt(x)
        return lastResult
    }

    double pot(double x, int y) {
        if (y < 0) {
            throw new ArithmeticException("Valor não pode ser negativo")
        }

        lastResult = Math.pow(x, y)
        return lastResult
    }

}
