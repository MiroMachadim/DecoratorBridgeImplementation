package Bridge.abstracts;

import Bridge.Interfaces.INotification;
import Bridge.Model.Notificacoes;

public abstract class Messager {
    protected final INotification canal;

    public Messager(INotification canal) {
        this.canal = canal;
    }

    public abstract void verificar(Notificacoes noti);
}
