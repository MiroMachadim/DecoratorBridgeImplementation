package Bridge.Model;

import Bridge.Interfaces.INotification;
import Bridge.abstracts.Messager;

public class SMS extends Messager {
    private String _msg;
    public SMS(String msg,INotification canal) {
        this._msg = msg;
        super(canal);
    }

    @Override
    public void verificar(Notificacoes noti)
    {
       canal.notificar(noti,_msg);
    }

    public void setNum(String msg){
        this._msg = msg;
    }
}
