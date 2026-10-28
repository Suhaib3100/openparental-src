package org.java_websocket_new.server;

import androidx.content.preferences.protobuf.n;
import eg.i;
import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket_new.d;
import org.java_websocket_new.e;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.f;
import org.java_websocket_new.g;

/* compiled from: WebSocketServer.java */
/* loaded from: classes6.dex */
public abstract class c extends e implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static int f87027o = Runtime.getRuntime().availableProcessors();

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f87028p = false;

    /* renamed from: b, reason: collision with root package name */
    private final Collection<d> f87029b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f87030c;

    /* renamed from: d, reason: collision with root package name */
    private ServerSocketChannel f87031d;

    /* renamed from: e, reason: collision with root package name */
    private Selector f87032e;

    /* renamed from: f, reason: collision with root package name */
    private List<org.java_websocket_new.drafts.a> f87033f;

    /* renamed from: g, reason: collision with root package name */
    private Thread f87034g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f87035h;

    /* renamed from: i, reason: collision with root package name */
    private List<b> f87036i;

    /* renamed from: j, reason: collision with root package name */
    private List<g> f87037j;

    /* renamed from: k, reason: collision with root package name */
    private BlockingQueue<ByteBuffer> f87038k;

    /* renamed from: l, reason: collision with root package name */
    private int f87039l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f87040m;

    /* renamed from: n, reason: collision with root package name */
    private a f87041n;

    /* compiled from: WebSocketServer.java */
    public interface a extends f {
        @Override // org.java_websocket_new.f
        g a(e eVar, List<org.java_websocket_new.drafts.a> list, Socket socket);

        @Override // org.java_websocket_new.f
        g b(e eVar, org.java_websocket_new.drafts.a aVar, Socket socket);

        ByteChannel c(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;
    }

    /* compiled from: WebSocketServer.java */
    public class b extends Thread {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f87042d = false;

        /* renamed from: b, reason: collision with root package name */
        private BlockingQueue<g> f87043b = new LinkedBlockingQueue();

        /* compiled from: WebSocketServer.java */
        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, th);
            }
        }

        public b() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new a());
        }

        public void a(g gVar) throws InterruptedException {
            this.f87043b.put(gVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g gVar;
            RuntimeException e4;
            c cVar;
            g gVar2 = null;
            while (true) {
                try {
                    try {
                        gVar = this.f87043b.take();
                    } catch (InterruptedException unused) {
                        return;
                    }
                } catch (RuntimeException e5) {
                    gVar = gVar2;
                    e4 = e5;
                }
                try {
                    ByteBuffer poll = gVar.f87010e.poll();
                    try {
                        try {
                            gVar.n(poll);
                            cVar = c.this;
                        } catch (Exception e6) {
                            System.err.println("Error while reading from remote connection: " + e6);
                            cVar = c.this;
                        }
                        cVar.j0(poll);
                        gVar2 = gVar;
                    } catch (Throwable th) {
                        c.this.j0(poll);
                        throw th;
                    }
                } catch (RuntimeException e7) {
                    e4 = e7;
                    c.this.W(gVar, e4);
                    return;
                }
            }
        }
    }

    public c(InetSocketAddress inetSocketAddress, int i4, List<org.java_websocket_new.drafts.a> list, Collection<d> collection) {
        this.f87035h = new AtomicBoolean(false);
        this.f87039l = 0;
        this.f87040m = new AtomicInteger(0);
        this.f87041n = new org.java_websocket_new.server.b();
        if (inetSocketAddress == null || i4 < 1 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null) {
            this.f87033f = Collections.emptyList();
        } else {
            this.f87033f = list;
        }
        this.f87030c = inetSocketAddress;
        this.f87029b = collection;
        this.f87037j = new LinkedList();
        this.f87036i = new ArrayList(i4);
        this.f87038k = new LinkedBlockingQueue();
        for (int i5 = 0; i5 < i4; i5++) {
            b bVar = new b();
            this.f87036i.add(bVar);
            bVar.start();
        }
    }

    private Socket U(d dVar) {
        return ((SocketChannel) ((g) dVar).f87007b.channel()).socket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(d dVar, Exception exc) {
        e0(dVar, exc);
        try {
            q0();
        } catch (IOException e4) {
            e0(null, e4);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            e0(null, e5);
        }
    }

    private void X(SelectionKey selectionKey, d dVar, IOException iOException) {
        SelectableChannel channel;
        if (dVar != null) {
            dVar.E(1006, iOException.getMessage());
            return;
        }
        if (selectionKey == null || (channel = selectionKey.channel()) == null || !channel.isOpen()) {
            return;
        }
        try {
            channel.close();
        } catch (IOException unused) {
        }
        if (g.f87004u) {
            System.out.println("Connection closed because of" + iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f87038k.size() > this.f87040m.intValue()) {
            return;
        }
        this.f87038k.put(byteBuffer);
    }

    private void k0(g gVar) throws InterruptedException {
        if (gVar.f87011f == null) {
            List<b> list = this.f87036i;
            gVar.f87011f = list.get(this.f87039l % list.size());
            this.f87039l++;
        }
        gVar.f87011f.a(gVar);
    }

    private ByteBuffer s0() throws InterruptedException {
        return this.f87038k.take();
    }

    @Override // org.java_websocket_new.e, org.java_websocket_new.h
    public i A(d dVar, org.java_websocket_new.drafts.a aVar, eg.a aVar2) throws InvalidDataException {
        return new eg.e();
    }

    @Override // org.java_websocket_new.h
    public final void B(d dVar, Exception exc) {
        e0(dVar, exc);
    }

    @Override // org.java_websocket_new.h
    public InetSocketAddress F(d dVar) {
        return (InetSocketAddress) U(dVar).getLocalSocketAddress();
    }

    protected boolean L(d dVar) {
        boolean add;
        if (this.f87035h.get()) {
            dVar.v(1001);
            return true;
        }
        synchronized (this.f87029b) {
            add = this.f87029b.add(dVar);
        }
        return add;
    }

    protected void M(d dVar) throws InterruptedException {
        if (this.f87040m.get() >= n.a(this.f87036i, 2, 1)) {
            return;
        }
        this.f87040m.incrementAndGet();
        this.f87038k.put(O());
    }

    public Collection<d> N() {
        return this.f87029b;
    }

    public ByteBuffer O() {
        return ByteBuffer.allocate(g.f87003t);
    }

    public InetSocketAddress P() {
        return this.f87030c;
    }

    public List<org.java_websocket_new.drafts.a> Q() {
        return Collections.unmodifiableList(this.f87033f);
    }

    protected String R() {
        return "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"" + T() + "\" /></cross-domain-policy>";
    }

    public int T() {
        ServerSocketChannel serverSocketChannel;
        int port = P().getPort();
        return (port != 0 || (serverSocketChannel = this.f87031d) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    public final f V() {
        return this.f87041n;
    }

    public abstract void Z(d dVar, int i4, String str, boolean z4);

    public void a0(d dVar, int i4, String str) {
    }

    public void b0(d dVar, int i4, String str, boolean z4) {
    }

    protected boolean d0(SelectionKey selectionKey) {
        return true;
    }

    public abstract void e0(d dVar, Exception exc);

    public void f0(d dVar, org.java_websocket_new.framing.d dVar2) {
    }

    public abstract void g0(d dVar, String str);

    @Override // org.java_websocket_new.h
    public void h(d dVar, int i4, String str, boolean z4) {
        b0(dVar, i4, str, z4);
    }

    public void h0(d dVar, ByteBuffer byteBuffer) {
    }

    public abstract void i0(d dVar, eg.a aVar);

    protected void l0(d dVar) throws InterruptedException {
    }

    @Override // org.java_websocket_new.h
    public final void m(d dVar, eg.f fVar) {
        if (L(dVar)) {
            i0(dVar, (eg.a) fVar);
        }
    }

    protected boolean m0(d dVar) {
        boolean remove;
        synchronized (this.f87029b) {
            remove = this.f87029b.remove(dVar);
        }
        if (this.f87035h.get() && this.f87029b.size() == 0) {
            this.f87034g.interrupt();
        }
        return remove;
    }

    @Override // org.java_websocket_new.h
    public final void n(d dVar, ByteBuffer byteBuffer) {
        h0(dVar, byteBuffer);
    }

    public final void n0(a aVar) {
        this.f87041n = aVar;
    }

    @Override // org.java_websocket_new.e, org.java_websocket_new.h
    @Deprecated
    public void o(d dVar, org.java_websocket_new.framing.d dVar2) {
        f0(dVar, dVar2);
    }

    @Override // org.java_websocket_new.h
    public InetSocketAddress p(d dVar) {
        return (InetSocketAddress) U(dVar).getRemoteSocketAddress();
    }

    public void p0() {
        if (this.f87034g != null) {
            throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
        }
        new Thread(this).start();
    }

    @Override // org.java_websocket_new.h
    public final void q(d dVar, int i4, String str, boolean z4) {
        this.f87032e.wakeup();
        try {
            if (m0(dVar)) {
                Z(dVar, i4, str, z4);
            }
            try {
                l0(dVar);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                l0(dVar);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public void q0() throws IOException, InterruptedException {
        r0(0);
    }

    public void r0(int i4) throws InterruptedException {
        ArrayList arrayList;
        if (this.f87035h.compareAndSet(false, true)) {
            synchronized (this.f87029b) {
                arrayList = new ArrayList(this.f87029b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).v(1001);
            }
            synchronized (this) {
                try {
                    Thread thread = this.f87034g;
                    if (thread != null && thread != Thread.currentThread()) {
                        this.f87032e.wakeup();
                        this.f87034g.interrupt();
                        this.f87034g.join(i4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd A[Catch: all -> 0x00ca, RuntimeException -> 0x00cd, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x00cd, blocks: (B:17:0x005e, B:20:0x008e, B:25:0x009f, B:90:0x00a5, B:92:0x00ae, B:94:0x00b6, B:96:0x00be, B:98:0x00c4, B:99:0x00d2, B:101:0x00d8, B:104:0x00e1, B:109:0x00e6, B:110:0x00e9, B:70:0x01dd, B:71:0x01e0, B:27:0x00f3, B:29:0x00f9, B:34:0x0100, B:36:0x0107, B:38:0x010d, B:40:0x0114, B:42:0x0142, B:44:0x0148, B:46:0x014e, B:48:0x0152, B:50:0x015a, B:52:0x0160, B:54:0x0171, B:56:0x0179, B:58:0x0181, B:59:0x0185, B:63:0x018a, B:64:0x018d, B:74:0x0192, B:76:0x0198, B:77:0x019e, B:79:0x01a6, B:81:0x01ac), top: B:16:0x005e, outer: #6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket_new.server.c.run():void");
    }

    @Override // org.java_websocket_new.h
    public void w(d dVar, int i4, String str) {
        a0(dVar, i4, str);
    }

    @Override // org.java_websocket_new.h
    public final void x(d dVar) {
        g gVar = (g) dVar;
        try {
            gVar.f87007b.interestOps(5);
        } catch (CancelledKeyException unused) {
            gVar.f87009d.clear();
        }
        this.f87032e.wakeup();
    }

    @Override // org.java_websocket_new.h
    public final void z(d dVar, String str) {
        g0(dVar, str);
    }

    public c() throws UnknownHostException {
        this(new InetSocketAddress(80), f87027o, null);
    }

    public c(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f87027o, null);
    }

    public c(InetSocketAddress inetSocketAddress, int i4) {
        this(inetSocketAddress, i4, null);
    }

    public c(InetSocketAddress inetSocketAddress, List<org.java_websocket_new.drafts.a> list) {
        this(inetSocketAddress, f87027o, list);
    }

    public c(InetSocketAddress inetSocketAddress, int i4, List<org.java_websocket_new.drafts.a> list) {
        this(inetSocketAddress, i4, list, new HashSet());
    }
}
