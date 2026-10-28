package org.java_websocket_new;

import java.net.InetSocketAddress;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.framing.d;

/* compiled from: WebSocketAdapter.java */
/* loaded from: classes6.dex */
public abstract class e implements h {
    @Override // org.java_websocket_new.h
    public eg.i A(d dVar, org.java_websocket_new.drafts.a aVar, eg.a aVar2) throws InvalidDataException {
        return new eg.e();
    }

    @Override // org.java_websocket_new.h
    public void e(d dVar, org.java_websocket_new.framing.d dVar2) {
    }

    @Override // org.java_websocket_new.h
    public void g(d dVar, eg.a aVar, eg.h hVar) throws InvalidDataException {
    }

    @Override // org.java_websocket_new.h
    public String l(d dVar) throws InvalidDataException {
        InetSocketAddress s4 = dVar.s();
        if (s4 == null) {
            throw new InvalidHandshakeException("socket not bound");
        }
        StringBuffer stringBuffer = new StringBuffer(90);
        stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
        stringBuffer.append(s4.getPort());
        stringBuffer.append("\" /></cross-domain-policy>\u0000");
        return stringBuffer.toString();
    }

    @Override // org.java_websocket_new.h
    public void o(d dVar, org.java_websocket_new.framing.d dVar2) {
    }

    @Override // org.java_websocket_new.h
    public void r(d dVar, org.java_websocket_new.framing.d dVar2) {
        org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e(dVar2);
        eVar.c(d.a.PONG);
        dVar.G(eVar);
    }

    @Override // org.java_websocket_new.h
    public void t(d dVar, eg.a aVar) throws InvalidDataException {
    }
}
