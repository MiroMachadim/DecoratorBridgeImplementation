package Decorator.decorators;

import Decorator.abstracts.UpgradeDecorator;
import Decorator.interfaces.IArma;

public class MiraDecorator extends UpgradeDecorator {
    public MiraDecorator(IArma arma) {
        super(arma);
    }

    @Override
    public String Nome() {
        return arma.Nome();
    }

    @Override
    public int Municao() {
        return arma.Municao();
    }

    @Override
    public double VelocidadeTiro() {
        return arma.VelocidadeTiro();
    }

    @Override
    public int Dano() {
        return arma.Dano() + 1;
    }

    @Override
    public double Cooldown() {
        return arma.Cooldown();
    }

    @Override
    public int Recoil() {
        return arma.Recoil() - 1;
    }

    @Override
    public int Preco() {
        return arma.Preco() + 200;
    }

    @Override
    public int Peso() {
        return arma.Peso() + 2;
    }
}
