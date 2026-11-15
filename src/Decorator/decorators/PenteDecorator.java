package Decorator.decorators;

import Decorator.abstracts.UpgradeDecorator;
import Decorator.interfaces.IArma;

public class PenteDecorator extends UpgradeDecorator {

    public PenteDecorator(IArma arma) {
        super(arma);
    }

    @Override
    public String Nome() {
        return arma.Nome() + " estendido";
    }

    @Override
    public int Municao() {
        return arma.Municao() + 15;
    }

    @Override
    public double VelocidadeTiro() {
        return arma.VelocidadeTiro();
    }

    @Override
    public int Dano() {
        return arma.Dano();
    }

    @Override
    public double Cooldown() {
        return arma.Cooldown();
    }

    @Override
    public int Recoil() {
        return arma.Recoil();
    }

    @Override
    public int Preco() {
        return arma.Preco() + 150;
    }

    @Override
    public int Peso() {
        return arma.Peso() + 1;
    }

    public boolean VerificarCompatibilidade(){
        if (arma.Nome().equals("bazuca")){
            return false;
        } else {
            return true;
        }
    }
}
