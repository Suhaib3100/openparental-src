package org.java_websocket_new;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import org.java_websocket_new.exceptions.InvalidDataException;

/* compiled from: WebSocketListener.java */
/* loaded from: classes6.dex */
public interface h {
    eg.i A(d dVar, org.java_websocket_new.drafts.a aVar, eg.a aVar2) throws InvalidDataException;

    void B(d dVar, Exception exc);

    InetSocketAddress F(d dVar);

    void e(d dVar, org.java_websocket_new.framing.d dVar2);

    void g(d dVar, eg.a aVar, eg.h hVar) throws InvalidDataException;

    void h(d dVar, int i4, String str, boolean z4);

    String l(d dVar) throws InvalidDataException;

    void m(d dVar, eg.f fVar);

    void n(d dVar, ByteBuffer byteBuffer);

    void o(d dVar, org.java_websocket_new.framing.d dVar2);

    InetSocketAddress p(d dVar);

    void q(d dVar, int i4, String str, boolean z4);

    void r(d dVar, org.java_websocket_new.framing.d dVar2);

    void t(d dVar, eg.a aVar) throws InvalidDataException;

    void w(d dVar, int i4, String str);

    void x(d dVar);

    void z(d dVar, String str);
}
