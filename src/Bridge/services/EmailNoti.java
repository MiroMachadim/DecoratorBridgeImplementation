package Bridge.services;

import Bridge.Interfaces.INotification;
import Bridge.Model.Notificacoes;

public class EmailNoti implements INotification {
    private final String _email;

    public EmailNoti(String email) {
        this._email = email;
    }

    @Override
    public void notificar(Notificacoes noti, String necessidade) {
       noti.popup(_email,necessidade);
    }
}
