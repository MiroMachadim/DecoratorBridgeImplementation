package Decorator.model;

import Decorator.interfaces.IArma;

public class bazuka implements IArma {
    @Override
    public String Nome(){
        return "bazuca";
    }

    @Override
    public int Municao() {
        return 1;
    }

    @Override
    public double VelocidadeTiro() {
        return 0.5;
    }

    @Override
    public int Dano() {
        return 500;
    }

    @Override
    public double Cooldown() {
        return 7;
    }

    @Override
    public int Recoil() {
        return 40;
    }

    @Override
    public int Preco() {
        return 10000;
    }

    @Override
    public int Peso() {
        return 10;
    }
}
