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
        return 0
    }

    @Override
    double sub(double x, double y) {
        return 0
    }

    @Override
    double div (double x, double y){
        return 0
    }

    @Override
    double mult(double x, double y){
        return 0
    }

}
