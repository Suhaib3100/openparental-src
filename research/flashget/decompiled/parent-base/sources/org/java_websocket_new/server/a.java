package org.java_websocket_new.server;

import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.java_websocket_new.d;
import org.java_websocket_new.e;
import org.java_websocket_new.g;
import org.java_websocket_new.server.c;

/* compiled from: DefaultSSLWebSocketServerFactory.java */
/* loaded from: classes6.dex */
public class a implements c.a {

    /* renamed from: a, reason: collision with root package name */
    protected SSLContext f87025a;

    /* renamed from: b, reason: collision with root package name */
    protected ExecutorService f87026b;

    public a(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // org.java_websocket_new.f
    public /* bridge */ /* synthetic */ d a(e eVar, List list, Socket socket) {
        return a(eVar, (List<org.java_websocket_new.drafts.a>) list, socket);
    }

    @Override // org.java_websocket_new.server.c.a
    public ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.f87025a.createSSLEngine();
        createSSLEngine.setUseClientMode(false);
        return new org.java_websocket_new.b(socketChannel, createSSLEngine, this.f87026b, selectionKey);
    }

    public a(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f87025a = sSLContext;
        this.f87026b = executorService;
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
