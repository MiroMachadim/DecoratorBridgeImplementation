package Decorator.decorators;

import Decorator.abstracts.UpgradeDecorator;
import Decorator.interfaces.IArma;

public class SilenciadorDecorator extends UpgradeDecorator {

    public SilenciadorDecorator(IArma arma){
        super(arma);
    }

    @Override
    public String Nome(){
        return arma.Nome() + " silenciosa";
    }

    @Override
    public int Municao() {
        return arma.Municao();
    }

    @Override
    public double VelocidadeTiro() {
        return arma.VelocidadeTiro() - 0.3;
    }

    @Override
    public int Dano() {
        return arma.Dano() - 1;
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
        return arma.Preco() + 100;
    }

    @Override
    public int Peso() {
        return arma.Peso() + 1;
    }

    // verificação de compatibilidade é feito antes de se colocar o decorator
    private boolean verificarCompatibilidade(){
        if (arma.Nome().equals("bazuca")){
            return false;
        } else {
            return true;
        }
    }

}
