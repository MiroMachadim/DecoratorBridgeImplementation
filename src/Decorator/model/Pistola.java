package Decorator.model;

import Decorator.interfaces.IArma;

public class Pistola implements IArma {
    @Override
    public String Nome(){
        return "Pistola";
    }

    @Override
    public int Municao() {
        return 15;
    }

    @Override
    public double VelocidadeTiro() {
        return 2;
    }

    @Override
    public int Dano() {
        return 5;
    }

    @Override
    public double Cooldown() {
        return 1.5;
    }

    @Override
    public int Recoil() {
        return 1;
    }

    @Override
    public int Preco() {
        return 1200;
    }

    @Override
    public int Peso() {
        return 1;
    }
}
