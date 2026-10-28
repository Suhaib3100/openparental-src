package org.java_websocket_new.client;

import eg.f;
import eg.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.java_websocket_new.d;
import org.java_websocket_new.drafts.c;
import org.java_websocket_new.e;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.framing.d;
import org.java_websocket_new.g;

/* compiled from: WebSocketClient.java */
/* loaded from: classes6.dex */
public abstract class b extends e implements Runnable, d {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f86935n = false;

    /* renamed from: b, reason: collision with root package name */
    protected URI f86936b;

    /* renamed from: c, reason: collision with root package name */
    private g f86937c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f86938d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f86939e;

    /* renamed from: f, reason: collision with root package name */
    private OutputStream f86940f;

    /* renamed from: g, reason: collision with root package name */
    private Proxy f86941g;

    /* renamed from: h, reason: collision with root package name */
    private Thread f86942h;

    /* renamed from: i, reason: collision with root package name */
    private org.java_websocket_new.drafts.a f86943i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, String> f86944j;

    /* renamed from: k, reason: collision with root package name */
    private CountDownLatch f86945k;

    /* renamed from: l, reason: collision with root package name */
    private CountDownLatch f86946l;

    /* renamed from: m, reason: collision with root package name */
    private int f86947m;

    /* compiled from: WebSocketClient.java */
    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = b.this.f86937c.f87009d.take();
                    b.this.f86940f.write(take.array(), 0, take.limit());
                    b.this.f86940f.flush();
                } catch (IOException unused) {
                    b.this.f86937c.q();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }

        /* synthetic */ a(b bVar, a aVar) {
            this();
        }
    }

    public b(URI uri, org.java_websocket_new.drafts.a aVar, Map<String, String> map, int i4) {
        this.f86936b = null;
        this.f86937c = null;
        this.f86938d = null;
        this.f86941g = Proxy.NO_PROXY;
        this.f86945k = new CountDownLatch(1);
        this.f86946l = new CountDownLatch(1);
        this.f86947m = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (aVar == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.f86936b = uri;
        this.f86943i = aVar;
        this.f86944j = map;
        this.f86947m = i4;
        this.f86937c = new g(this, aVar);
    }

    private int P() {
        int port = this.f86936b.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f86936b.getScheme();
        if (scheme.equals("wss")) {
            return d.F2;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme".concat(scheme));
    }

    private void b0() throws InvalidHandshakeException {
        String path = this.f86936b.getPath();
        String query = this.f86936b.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = android.support.v4.media.d.a(path, "?", query);
        }
        int P = P();
        StringBuilder sb = new StringBuilder(String.valueOf(this.f86936b.getHost()));
        sb.append(P != 80 ? android.support.v4.media.a.a(":", P) : "");
        String sb2 = sb.toString();
        eg.d dVar = new eg.d();
        dVar.h(path);
        dVar.b("Host", sb2);
        Map<String, String> map = this.f86944j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dVar.b(entry.getKey(), entry.getValue());
            }
        }
        this.f86937c.z(dVar);
    }

    @Override // org.java_websocket_new.h
    public final void B(d dVar, Exception exc) {
        V(exc);
    }

    @Override // org.java_websocket_new.d
    public boolean C() {
        return this.f86937c.C();
    }

    @Override // org.java_websocket_new.d
    public InetSocketAddress D() {
        return this.f86937c.D();
    }

    @Override // org.java_websocket_new.d
    public void E(int i4, String str) {
        this.f86937c.E(i4, str);
    }

    @Override // org.java_websocket_new.h
    public InetSocketAddress F(d dVar) {
        Socket socket = this.f86938d;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket_new.d
    public void G(org.java_websocket_new.framing.d dVar) {
        this.f86937c.G(dVar);
    }

    public void L() throws InterruptedException {
        close();
        this.f86946l.await();
    }

    public void M() {
        if (this.f86942h != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f86942h = thread;
        thread.start();
    }

    public boolean N() throws InterruptedException {
        M();
        this.f86945k.await();
        return this.f86937c.isOpen();
    }

    public d O() {
        return this.f86937c;
    }

    public URI Q() {
        return this.f86936b;
    }

    public abstract void R(int i4, String str, boolean z4);

    public void T(int i4, String str) {
    }

    public void U(int i4, String str, boolean z4) {
    }

    public abstract void V(Exception exc);

    public void W(org.java_websocket_new.framing.d dVar) {
    }

    public abstract void X(String str);

    public void Z(ByteBuffer byteBuffer) {
    }

    @Override // org.java_websocket_new.d
    public void a(String str) throws NotYetConnectedException {
        this.f86937c.a(str);
    }

    public abstract void a0(h hVar);

    @Override // org.java_websocket_new.d
    public void b(int i4, String str) {
        this.f86937c.b(i4, str);
    }

    @Override // org.java_websocket_new.d
    public void c(byte[] bArr) throws NotYetConnectedException {
        this.f86937c.c(bArr);
    }

    @Override // org.java_websocket_new.d
    public void close() {
        if (this.f86942h != null) {
            this.f86937c.v(1000);
        }
    }

    @Override // org.java_websocket_new.d
    public String d() {
        return this.f86936b.getPath();
    }

    public void d0(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.f86941g = proxy;
    }

    public void e0(Socket socket) {
        if (this.f86938d != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.f86938d = socket;
    }

    @Override // org.java_websocket_new.d
    public boolean f() {
        return this.f86937c.f();
    }

    @Override // org.java_websocket_new.h
    public void h(d dVar, int i4, String str, boolean z4) {
        U(i4, str, z4);
    }

    @Override // org.java_websocket_new.d
    public org.java_websocket_new.drafts.a i() {
        return this.f86943i;
    }

    @Override // org.java_websocket_new.d
    public boolean isClosed() {
        return this.f86937c.isClosed();
    }

    @Override // org.java_websocket_new.d
    public boolean isConnecting() {
        return this.f86937c.isConnecting();
    }

    @Override // org.java_websocket_new.d
    public boolean isOpen() {
        return this.f86937c.isOpen();
    }

    @Override // org.java_websocket_new.d
    public void j(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        this.f86937c.j(byteBuffer);
    }

    @Override // org.java_websocket_new.d
    public boolean k() {
        return this.f86937c.k();
    }

    @Override // org.java_websocket_new.h
    public final void m(d dVar, f fVar) {
        this.f86945k.countDown();
        a0((h) fVar);
    }

    @Override // org.java_websocket_new.h
    public final void n(d dVar, ByteBuffer byteBuffer) {
        Z(byteBuffer);
    }

    @Override // org.java_websocket_new.e, org.java_websocket_new.h
    public void o(d dVar, org.java_websocket_new.framing.d dVar2) {
        W(dVar2);
    }

    @Override // org.java_websocket_new.h
    public InetSocketAddress p(d dVar) {
        Socket socket = this.f86938d;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket_new.h
    public final void q(d dVar, int i4, String str, boolean z4) {
        this.f86945k.countDown();
        this.f86946l.countDown();
        Thread thread = this.f86942h;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.f86938d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e4) {
            V(e4);
        }
        R(i4, str, z4);
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        try {
            Socket socket = this.f86938d;
            if (socket == null) {
                this.f86938d = new Socket(this.f86941g);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f86938d.isBound()) {
                this.f86938d.connect(new InetSocketAddress(this.f86936b.getHost(), P()), this.f86947m);
            }
            this.f86939e = this.f86938d.getInputStream();
            this.f86940f = this.f86938d.getOutputStream();
            b0();
            Thread thread = new Thread(new a(this, null));
            this.f86942h = thread;
            thread.start();
            byte[] bArr = new byte[g.f87003t];
            while (!isClosed() && (read = this.f86939e.read(bArr)) != -1) {
                try {
                    this.f86937c.n(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f86937c.q();
                    return;
                } catch (RuntimeException e4) {
                    V(e4);
                    this.f86937c.E(1006, e4.getMessage());
                    return;
                }
            }
            this.f86937c.q();
        } catch (Exception e5) {
            V(e5);
            this.f86937c.E(-1, e5.getMessage());
        }
    }

    @Override // org.java_websocket_new.d
    public InetSocketAddress s() {
        return this.f86937c.s();
    }

    @Override // org.java_websocket_new.d
    public d.a u() {
        return this.f86937c.u();
    }

    @Override // org.java_websocket_new.d
    public void v(int i4) {
        this.f86937c.close();
    }

    @Override // org.java_websocket_new.h
    public void w(d dVar, int i4, String str) {
        T(i4, str);
    }

    @Override // org.java_websocket_new.h
    public final void x(d dVar) {
    }

    @Override // org.java_websocket_new.d
    public void y(d.a aVar, ByteBuffer byteBuffer, boolean z4) {
        this.f86937c.y(aVar, byteBuffer, z4);
    }

    @Override // org.java_websocket_new.h
    public final void z(org.java_websocket_new.d dVar, String str) {
        X(str);
    }

    public b(URI uri) {
        this(uri, new c());
    }

    public b(URI uri, org.java_websocket_new.drafts.a aVar) {
        this(uri, aVar, null, 0);
    }
}
