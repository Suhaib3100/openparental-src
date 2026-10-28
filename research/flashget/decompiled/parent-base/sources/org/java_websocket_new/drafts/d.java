package org.java_websocket_new.drafts;

import eg.h;
import eg.i;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket_new.drafts.a;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.exceptions.LimitExedeedException;
import org.java_websocket_new.exceptions.NotSendableException;
import org.java_websocket_new.framing.d;

/* compiled from: Draft_75.java */
/* loaded from: classes6.dex */
public class d extends a {

    /* renamed from: j, reason: collision with root package name */
    public static final byte f86961j = 13;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f86962k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f86963l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f86964m = -1;

    /* renamed from: h, reason: collision with root package name */
    protected ByteBuffer f86967h;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f86965f = false;

    /* renamed from: g, reason: collision with root package name */
    protected List<org.java_websocket_new.framing.d> f86966g = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    private final Random f86968i = new Random();

    @Override // org.java_websocket_new.drafts.a
    public a.b a(eg.a aVar, h hVar) {
        return (aVar.k("WebSocket-Origin").equals(hVar.k("Origin")) && c(hVar)) ? a.b.MATCHED : a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.a
    public a.b b(eg.a aVar) {
        return (aVar.e("Origin") && c(aVar)) ? a.b.MATCHED : a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.a
    public a f() {
        return new d();
    }

    @Override // org.java_websocket_new.drafts.a
    public ByteBuffer g(org.java_websocket_new.framing.d dVar) {
        if (dVar.b() != d.a.TEXT) {
            throw new RuntimeException("only text frames supported");
        }
        ByteBuffer h4 = dVar.h();
        ByteBuffer allocate = ByteBuffer.allocate(h4.remaining() + 2);
        allocate.put((byte) 0);
        h4.mark();
        allocate.put(h4);
        h4.reset();
        allocate.put((byte) -1);
        allocate.flip();
        return allocate;
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> h(String str, boolean z4) {
        org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e();
        try {
            eVar.i(ByteBuffer.wrap(org.java_websocket_new.util.b.g(str)));
            eVar.d(true);
            eVar.c(d.a.TEXT);
            eVar.e(z4);
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e4) {
            throw new NotSendableException(e4);
        }
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> i(ByteBuffer byteBuffer, boolean z4) {
        throw new RuntimeException("not yet implemented");
    }

    @Override // org.java_websocket_new.drafts.a
    public a.EnumC1347a l() {
        return a.EnumC1347a.NONE;
    }

    @Override // org.java_websocket_new.drafts.a
    public eg.b n(eg.b bVar) throws InvalidHandshakeException {
        bVar.b("Upgrade", "WebSocket");
        bVar.b("Connection", "Upgrade");
        if (!bVar.e("Origin")) {
            bVar.b("Origin", "random" + this.f86968i.nextInt());
        }
        return bVar;
    }

    @Override // org.java_websocket_new.drafts.a
    public eg.c o(eg.a aVar, i iVar) throws InvalidHandshakeException {
        iVar.i("Web Socket Protocol Handshake");
        iVar.b("Upgrade", "WebSocket");
        iVar.b("Connection", aVar.k("Connection"));
        iVar.b("WebSocket-Origin", aVar.k("Origin"));
        iVar.b("WebSocket-Location", "ws://" + aVar.k("Host") + aVar.d());
        return iVar;
    }

    @Override // org.java_websocket_new.drafts.a
    public void r() {
        this.f86965f = false;
        this.f86967h = null;
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> t(ByteBuffer byteBuffer) throws InvalidDataException {
        List<org.java_websocket_new.framing.d> y4 = y(byteBuffer);
        if (y4 != null) {
            return y4;
        }
        throw new InvalidDataException(1002);
    }

    public ByteBuffer w() {
        return ByteBuffer.allocate(a.f86950d);
    }

    public ByteBuffer x(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        byteBuffer.flip();
        ByteBuffer allocate = ByteBuffer.allocate(d(byteBuffer.capacity() * 2));
        allocate.put(byteBuffer);
        return allocate;
    }

    protected List<org.java_websocket_new.framing.d> y(ByteBuffer byteBuffer) throws InvalidDataException {
        while (byteBuffer.hasRemaining()) {
            byte b5 = byteBuffer.get();
            if (b5 == 0) {
                if (this.f86965f) {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
                this.f86965f = true;
            } else if (b5 == -1) {
                if (!this.f86965f) {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
                ByteBuffer byteBuffer2 = this.f86967h;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e();
                    eVar.i(this.f86967h);
                    eVar.d(true);
                    eVar.c(d.a.TEXT);
                    this.f86966g.add(eVar);
                    this.f86967h = null;
                    byteBuffer.mark();
                }
                this.f86965f = false;
            } else {
                if (!this.f86965f) {
                    return null;
                }
                ByteBuffer byteBuffer3 = this.f86967h;
                if (byteBuffer3 == null) {
                    this.f86967h = w();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.f86967h = x(this.f86967h);
                }
                this.f86967h.put(b5);
            }
        }
        List<org.java_websocket_new.framing.d> list = this.f86966g;
        this.f86966g = new LinkedList();
        return list;
    }
}
