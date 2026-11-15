package Decorator.abstracts;

import Decorator.interfaces.IArma;

public abstract class UpgradeDecorator implements IArma {

    protected final IArma arma;

    public UpgradeDecorator(IArma arma) {
        this.arma = arma;
    }
}
