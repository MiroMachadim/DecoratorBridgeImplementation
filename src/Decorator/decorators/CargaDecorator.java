package Decorator.decorators;

import Decorator.abstracts.UpgradeDecorator;
import Decorator.interfaces.IArma;

public class CargaDecorator extends UpgradeDecorator {
    public CargaDecorator(IArma arma) {
        super(arma);
    }

    @Override
    public String Nome() {
        return arma.Nome() + " Rapido";
    }

    @Override
    public int Municao() {
        return arma.Municao();
    }

    @Override
    public double VelocidadeTiro() {
        return arma.VelocidadeTiro() + 2;
    }

    @Override
    public int Dano() {
        return arma.Dano();
    }

    @Override
    public double Cooldown() {
        return arma.Cooldown() - 0.5;
    }

    @Override
    public int Recoil() {
        return arma.Recoil();
    }

    @Override
    public int Preco() {
        return arma.Preco();
    }

    @Override
    public int Peso() {
        return arma.Peso() - 1;
    }
}
