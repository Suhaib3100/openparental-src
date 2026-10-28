package org.java_websocket_new;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket_new.d;
import org.java_websocket_new.drafts.a;
import org.java_websocket_new.exceptions.IncompleteHandshakeException;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.exceptions.WebsocketNotConnectedException;
import org.java_websocket_new.framing.d;
import org.java_websocket_new.server.c;

/* compiled from: WebSocketImpl.java */
/* loaded from: classes6.dex */
public class g implements d {

    /* renamed from: t, reason: collision with root package name */
    public static int f87003t = 16384;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f87004u = true;

    /* renamed from: v, reason: collision with root package name */
    public static final List<org.java_websocket_new.drafts.a> f87005v;

    /* renamed from: w, reason: collision with root package name */
    static final /* synthetic */ boolean f87006w = false;

    /* renamed from: b, reason: collision with root package name */
    public SelectionKey f87007b;

    /* renamed from: c, reason: collision with root package name */
    public ByteChannel f87008c;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f87009d;

    /* renamed from: e, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f87010e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c.b f87011f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f87012g;

    /* renamed from: h, reason: collision with root package name */
    private d.a f87013h;

    /* renamed from: i, reason: collision with root package name */
    private final h f87014i;

    /* renamed from: j, reason: collision with root package name */
    private List<org.java_websocket_new.drafts.a> f87015j;

    /* renamed from: k, reason: collision with root package name */
    private org.java_websocket_new.drafts.a f87016k;

    /* renamed from: l, reason: collision with root package name */
    private d.b f87017l;

    /* renamed from: m, reason: collision with root package name */
    private d.a f87018m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f87019n;

    /* renamed from: o, reason: collision with root package name */
    private eg.a f87020o;

    /* renamed from: p, reason: collision with root package name */
    private String f87021p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f87022q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f87023r;

    /* renamed from: s, reason: collision with root package name */
    private String f87024s;

    static {
        ArrayList arrayList = new ArrayList(4);
        f87005v = arrayList;
        arrayList.add(new org.java_websocket_new.drafts.c());
        arrayList.add(new org.java_websocket_new.drafts.b());
        arrayList.add(new org.java_websocket_new.drafts.e());
        arrayList.add(new org.java_websocket_new.drafts.d());
    }

    public g(h hVar, List<org.java_websocket_new.drafts.a> list) {
        this(hVar, (org.java_websocket_new.drafts.a) null);
        this.f87017l = d.b.SERVER;
        if (list == null || list.isEmpty()) {
            this.f87015j = f87005v;
        } else {
            this.f87015j = list;
        }
    }

    private void A(ByteBuffer byteBuffer) {
        if (f87004u) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append("}");
            printStream.println(sb.toString());
        }
        this.f87009d.add(byteBuffer);
        this.f87014i.x(this);
    }

    private void B(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            A(it.next());
        }
    }

    private void e(int i4, String str, boolean z4) {
        d.a aVar = this.f87013h;
        d.a aVar2 = d.a.CLOSING;
        if (aVar == aVar2 || aVar == d.a.CLOSED) {
            return;
        }
        if (aVar == d.a.OPEN) {
            if (i4 == 1006) {
                this.f87013h = aVar2;
                r(i4, str, false);
                return;
            }
            if (this.f87016k.l() != a.EnumC1347a.NONE) {
                try {
                    if (!z4) {
                        try {
                            this.f87014i.w(this, i4, str);
                        } catch (RuntimeException e4) {
                            this.f87014i.B(this, e4);
                        }
                    }
                    G(new org.java_websocket_new.framing.b(i4, str));
                } catch (InvalidDataException e5) {
                    this.f87014i.B(this, e5);
                    r(1006, "generated frame is invalid", false);
                }
            }
            r(i4, str, z4);
        } else if (i4 == -3) {
            r(-3, str, true);
        } else {
            r(-1, str, false);
        }
        if (i4 == 1002) {
            r(i4, str, z4);
        }
        this.f87013h = d.a.CLOSING;
        this.f87019n = null;
    }

    private void o(ByteBuffer byteBuffer) {
        int i4;
        String str;
        try {
        } catch (InvalidDataException e4) {
            this.f87014i.B(this, e4);
            g(e4);
            return;
        }
        for (org.java_websocket_new.framing.d dVar : this.f87016k.t(byteBuffer)) {
            if (f87004u) {
                System.out.println("matched frame: " + dVar);
            }
            d.a b5 = dVar.b();
            boolean f4 = dVar.f();
            if (b5 == d.a.CLOSING) {
                if (dVar instanceof org.java_websocket_new.framing.a) {
                    org.java_websocket_new.framing.a aVar = (org.java_websocket_new.framing.a) dVar;
                    i4 = aVar.g();
                    str = aVar.getMessage();
                } else {
                    i4 = 1005;
                    str = "";
                }
                if (this.f87013h == d.a.CLOSING) {
                    l(i4, str, true);
                } else if (this.f87016k.l() == a.EnumC1347a.TWOWAY) {
                    e(i4, str, true);
                } else {
                    r(i4, str, false);
                }
            } else if (b5 == d.a.PING) {
                this.f87014i.r(this, dVar);
            } else if (b5 == d.a.PONG) {
                this.f87014i.e(this, dVar);
            } else {
                if (f4 && b5 != d.a.CONTINUOUS) {
                    if (this.f87018m != null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                    }
                    if (b5 == d.a.TEXT) {
                        try {
                            this.f87014i.z(this, org.java_websocket_new.util.b.e(dVar.h()));
                        } catch (RuntimeException e5) {
                            this.f87014i.B(this, e5);
                        }
                    } else {
                        if (b5 != d.a.BINARY) {
                            throw new InvalidDataException(1002, "non control or continious frame expected");
                        }
                        try {
                            this.f87014i.n(this, dVar.h());
                        } catch (RuntimeException e6) {
                            this.f87014i.B(this, e6);
                        }
                    }
                    this.f87014i.B(this, e4);
                    g(e4);
                    return;
                }
                if (b5 != d.a.CONTINUOUS) {
                    if (this.f87018m != null) {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                    this.f87018m = b5;
                } else if (f4) {
                    if (this.f87018m == null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                    this.f87018m = null;
                } else if (this.f87018m == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                try {
                    this.f87014i.o(this, dVar);
                } catch (RuntimeException e7) {
                    this.f87014i.B(this, e7);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean p(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket_new.g.p(java.nio.ByteBuffer):boolean");
    }

    private a.b t(ByteBuffer byteBuffer) throws IncompleteHandshakeException {
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = org.java_websocket_new.drafts.a.f86951e;
        if (limit > bArr.length) {
            return a.b.NOT_MATCHED;
        }
        if (byteBuffer.limit() < bArr.length) {
            throw new IncompleteHandshakeException(bArr.length);
        }
        int i4 = 0;
        while (byteBuffer.hasRemaining()) {
            if (org.java_websocket_new.drafts.a.f86951e[i4] != byteBuffer.get()) {
                byteBuffer.reset();
                return a.b.NOT_MATCHED;
            }
            i4++;
        }
        return a.b.MATCHED;
    }

    private void w(eg.f fVar) {
        if (f87004u) {
            System.out.println("open using draft: ".concat(this.f87016k.getClass().getSimpleName()));
        }
        this.f87013h = d.a.OPEN;
        try {
            this.f87014i.m(this, fVar);
        } catch (RuntimeException e4) {
            this.f87014i.B(this, e4);
        }
    }

    private void x(Collection<org.java_websocket_new.framing.d> collection) {
        if (!isOpen()) {
            throw new WebsocketNotConnectedException();
        }
        Iterator<org.java_websocket_new.framing.d> it = collection.iterator();
        while (it.hasNext()) {
            G(it.next());
        }
    }

    @Override // org.java_websocket_new.d
    public boolean C() {
        return !this.f87009d.isEmpty();
    }

    @Override // org.java_websocket_new.d
    public InetSocketAddress D() {
        return this.f87014i.p(this);
    }

    @Override // org.java_websocket_new.d
    public void E(int i4, String str) {
        l(i4, str, false);
    }

    @Override // org.java_websocket_new.d
    public void G(org.java_websocket_new.framing.d dVar) {
        if (f87004u) {
            System.out.println("send frame: " + dVar);
        }
        A(this.f87016k.g(dVar));
    }

    @Override // org.java_websocket_new.d
    public void a(String str) throws WebsocketNotConnectedException {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        x(this.f87016k.h(str, this.f87017l == d.b.CLIENT));
    }

    @Override // org.java_websocket_new.d
    public void b(int i4, String str) {
        e(i4, str, false);
    }

    @Override // org.java_websocket_new.d
    public void c(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        j(ByteBuffer.wrap(bArr));
    }

    @Override // org.java_websocket_new.d
    public void close() {
        v(1000);
    }

    @Override // org.java_websocket_new.d
    public String d() {
        return this.f87024s;
    }

    @Override // org.java_websocket_new.d
    public boolean f() {
        return this.f87013h == d.a.CLOSING;
    }

    public void g(InvalidDataException invalidDataException) {
        e(invalidDataException.a(), invalidDataException.getMessage(), false);
    }

    public void h() {
        if (this.f87023r == null) {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        }
        l(this.f87022q.intValue(), this.f87021p, this.f87023r.booleanValue());
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // org.java_websocket_new.d
    public org.java_websocket_new.drafts.a i() {
        return this.f87016k;
    }

    @Override // org.java_websocket_new.d
    public boolean isClosed() {
        return this.f87013h == d.a.CLOSED;
    }

    @Override // org.java_websocket_new.d
    public boolean isConnecting() {
        return this.f87013h == d.a.CONNECTING;
    }

    @Override // org.java_websocket_new.d
    public boolean isOpen() {
        return this.f87013h == d.a.OPEN;
    }

    @Override // org.java_websocket_new.d
    public void j(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        x(this.f87016k.i(byteBuffer, this.f87017l == d.b.CLIENT));
    }

    @Override // org.java_websocket_new.d
    public boolean k() {
        return this.f87012g;
    }

    protected synchronized void l(int i4, String str, boolean z4) {
        try {
            if (this.f87013h == d.a.CLOSED) {
                return;
            }
            SelectionKey selectionKey = this.f87007b;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f87008c;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e4) {
                    this.f87014i.B(this, e4);
                }
            }
            try {
                this.f87014i.q(this, i4, str, z4);
            } catch (RuntimeException e5) {
                this.f87014i.B(this, e5);
            }
            org.java_websocket_new.drafts.a aVar = this.f87016k;
            if (aVar != null) {
                aVar.r();
            }
            this.f87020o = null;
            this.f87013h = d.a.CLOSED;
            this.f87009d.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    protected void m(int i4, boolean z4) {
        l(i4, "", z4);
    }

    public void n(ByteBuffer byteBuffer) {
        if (f87004u) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
            sb.append("}");
            printStream.println(sb.toString());
        }
        if (this.f87013h != d.a.NOT_YET_CONNECTED) {
            o(byteBuffer);
            return;
        }
        if (p(byteBuffer)) {
            if (byteBuffer.hasRemaining()) {
                o(byteBuffer);
            } else if (this.f87019n.hasRemaining()) {
                o(this.f87019n);
            }
        }
    }

    public void q() {
        if (u() == d.a.NOT_YET_CONNECTED) {
            m(-1, true);
            return;
        }
        if (this.f87012g) {
            l(this.f87022q.intValue(), this.f87021p, this.f87023r.booleanValue());
            return;
        }
        if (this.f87016k.l() == a.EnumC1347a.NONE) {
            m(1000, true);
            return;
        }
        if (this.f87016k.l() != a.EnumC1347a.ONEWAY) {
            m(1006, true);
        } else if (this.f87017l == d.b.SERVER) {
            m(1006, true);
        } else {
            m(1000, true);
        }
    }

    protected synchronized void r(int i4, String str, boolean z4) {
        if (this.f87012g) {
            return;
        }
        this.f87022q = Integer.valueOf(i4);
        this.f87021p = str;
        this.f87023r = Boolean.valueOf(z4);
        this.f87012g = true;
        this.f87014i.x(this);
        try {
            this.f87014i.h(this, i4, str, z4);
        } catch (RuntimeException e4) {
            this.f87014i.B(this, e4);
        }
        org.java_websocket_new.drafts.a aVar = this.f87016k;
        if (aVar != null) {
            aVar.r();
        }
        this.f87020o = null;
    }

    @Override // org.java_websocket_new.d
    public InetSocketAddress s() {
        return this.f87014i.F(this);
    }

    public String toString() {
        return super.toString();
    }

    @Override // org.java_websocket_new.d
    public d.a u() {
        return this.f87013h;
    }

    @Override // org.java_websocket_new.d
    public void v(int i4) {
        e(i4, "", false);
    }

    @Override // org.java_websocket_new.d
    public void y(d.a aVar, ByteBuffer byteBuffer, boolean z4) {
        x(this.f87016k.e(aVar, byteBuffer, z4));
    }

    public void z(eg.b bVar) throws InvalidHandshakeException {
        this.f87020o = this.f87016k.n(bVar);
        this.f87024s = bVar.d();
        try {
            this.f87014i.t(this, this.f87020o);
            B(this.f87016k.j(this.f87020o, this.f87017l));
        } catch (RuntimeException e4) {
            this.f87014i.B(this, e4);
            throw new InvalidHandshakeException("rejected because of" + e4);
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    public g(h hVar, org.java_websocket_new.drafts.a aVar) {
        this.f87012g = false;
        this.f87013h = d.a.NOT_YET_CONNECTED;
        this.f87016k = null;
        this.f87018m = null;
        this.f87019n = ByteBuffer.allocate(0);
        this.f87020o = null;
        this.f87021p = null;
        this.f87022q = null;
        this.f87023r = null;
        this.f87024s = null;
        if (hVar != null && (aVar != null || this.f87017l != d.b.SERVER)) {
            this.f87009d = new LinkedBlockingQueue();
            this.f87010e = new LinkedBlockingQueue();
            this.f87014i = hVar;
            this.f87017l = d.b.CLIENT;
            if (aVar != null) {
                this.f87016k = aVar.f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    @Deprecated
    public g(h hVar, org.java_websocket_new.drafts.a aVar, Socket socket) {
        this(hVar, aVar);
    }

    @Deprecated
    public g(h hVar, List<org.java_websocket_new.drafts.a> list, Socket socket) {
        this(hVar, list);
    }
}
