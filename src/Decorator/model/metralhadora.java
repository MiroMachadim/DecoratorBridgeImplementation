package Decorator.model;

import Decorator.interfaces.IArma;

public class metralhadora implements IArma {
    @Override
    public String Nome(){
        return "metralhadora";
    }

    @Override
    public int Municao() {
        return 60;
    }

    @Override
    public double VelocidadeTiro() {
        return 1.5;
    }

    @Override
    public int Dano() {
        return 2;
    }

    @Override
    public double Cooldown() {
        return 0.3;
    }

    @Override
    public int Recoil() {
        return 3;
    }

    @Override
    public int Preco() {
        return 2000;
    }

    @Override
    public int Peso() {
        return 3;
    }
}
