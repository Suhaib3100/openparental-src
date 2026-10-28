package org.java_websocket_new.drafts;

import org.java_websocket_new.drafts.a;
import org.java_websocket_new.exceptions.InvalidHandshakeException;

/* compiled from: Draft_17.java */
/* loaded from: classes6.dex */
public class c extends b {
    @Override // org.java_websocket_new.drafts.b, org.java_websocket_new.drafts.a
    public a.b b(eg.a aVar) throws InvalidHandshakeException {
        return b.y(aVar) == 13 ? a.b.MATCHED : a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.b, org.java_websocket_new.drafts.a
    public a f() {
        return new c();
    }

    @Override // org.java_websocket_new.drafts.b, org.java_websocket_new.drafts.a
    public eg.b n(eg.b bVar) {
        super.n(bVar);
        bVar.b("Sec-WebSocket-Version", "13");
        return bVar;
    }
}
