package Bridge.Model;

import Bridge.Interfaces.INotification;
import Bridge.abstracts.Messager;

public class Whatsapp extends Messager {
    private String _msg;

    public Whatsapp(INotification canal) {
        super(canal);
    }

    @Override
    public void verificar(Notificacoes noti) {
        canal.notificar(noti,this._msg);
    }

    public void setMsg(String msg){
        this._msg = msg;
    }
}
