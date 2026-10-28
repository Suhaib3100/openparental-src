package org.java_websocket_new.server;

import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket_new.d;
import org.java_websocket_new.e;
import org.java_websocket_new.g;
import org.java_websocket_new.server.c;

/* compiled from: DefaultWebSocketServerFactory.java */
/* loaded from: classes6.dex */
public class b implements c.a {
    @Override // org.java_websocket_new.f
    public /* bridge */ /* synthetic */ d a(e eVar, List list, Socket socket) {
        return a(eVar, (List<org.java_websocket_new.drafts.a>) list, socket);
    }

    @Override // org.java_websocket_new.server.c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SocketChannel c(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override // org.java_websocket_new.server.c.a, org.java_websocket_new.f
    public g a(e eVar, List<org.java_websocket_new.drafts.a> list, Socket socket) {
        return new g(eVar, list);
    }

    @Override // org.java_websocket_new.f
    public g b(e eVar, org.java_websocket_new.drafts.a aVar, Socket socket) {
        return new g(eVar, aVar);
    }
}
