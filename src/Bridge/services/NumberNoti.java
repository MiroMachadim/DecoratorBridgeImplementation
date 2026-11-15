package Bridge.services;

import Bridge.Interfaces.INotification;
import Bridge.Model.Notificacoes;

public class NumberNoti implements INotification {

    private final String _num;

    public NumberNoti(String num){
        this._num = num;
    }

    @Override
    public void notificar(Notificacoes noti, String msg) {
        noti.popup(_num,msg);
    }
}
