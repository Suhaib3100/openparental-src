package org.java_websocket_new;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: SSLSocketChannel2.java */
/* loaded from: classes6.dex */
public class b implements ByteChannel, i {

    /* renamed from: m, reason: collision with root package name */
    protected static ByteBuffer f86921m = ByteBuffer.allocate(0);

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f86922n = false;

    /* renamed from: b, reason: collision with root package name */
    protected ExecutorService f86923b;

    /* renamed from: c, reason: collision with root package name */
    protected List<Future<?>> f86924c;

    /* renamed from: d, reason: collision with root package name */
    protected ByteBuffer f86925d;

    /* renamed from: e, reason: collision with root package name */
    protected ByteBuffer f86926e;

    /* renamed from: f, reason: collision with root package name */
    protected ByteBuffer f86927f;

    /* renamed from: g, reason: collision with root package name */
    protected SocketChannel f86928g;

    /* renamed from: h, reason: collision with root package name */
    protected SelectionKey f86929h;

    /* renamed from: i, reason: collision with root package name */
    protected SSLEngine f86930i;

    /* renamed from: j, reason: collision with root package name */
    protected SSLEngineResult f86931j;

    /* renamed from: k, reason: collision with root package name */
    protected SSLEngineResult f86932k;

    /* renamed from: l, reason: collision with root package name */
    protected int f86933l = 0;

    public b(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f86928g = socketChannel;
        this.f86930i = sSLEngine;
        this.f86923b = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f86932k = sSLEngineResult;
        this.f86931j = sSLEngineResult;
        this.f86924c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f86929h = selectionKey;
        }
        e(sSLEngine.getSession());
        this.f86928g.write(q(f86921m));
        k();
    }

    private void d(Future<?> future) {
        boolean z4 = false;
        while (true) {
            try {
                try {
                    future.get();
                    break;
                } catch (ExecutionException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private boolean h() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f86930i.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private synchronized void k() throws IOException {
        try {
            if (this.f86930i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                return;
            }
            if (!this.f86924c.isEmpty()) {
                Iterator<Future<?>> it = this.f86924c.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (!next.isDone()) {
                        if (g0()) {
                            d(next);
                        }
                        return;
                    }
                    it.remove();
                }
            }
            if (this.f86930i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!g0() || this.f86931j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f86927f.compact();
                    if (this.f86928g.read(this.f86927f) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f86927f.flip();
                }
                this.f86925d.compact();
                o();
                if (this.f86931j.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    e(this.f86930i.getSession());
                    return;
                }
            }
            c();
            if (this.f86924c.isEmpty() || this.f86930i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.f86928g.write(q(f86921m));
                if (this.f86932k.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    e(this.f86930i.getSession());
                    return;
                }
            }
            this.f86933l = 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    private int l(ByteBuffer byteBuffer) throws SSLException {
        if (this.f86925d.hasRemaining()) {
            return n(this.f86925d, byteBuffer);
        }
        if (!this.f86925d.hasRemaining()) {
            this.f86925d.clear();
        }
        if (!this.f86927f.hasRemaining()) {
            return 0;
        }
        o();
        int n4 = n(this.f86925d, byteBuffer);
        if (this.f86931j.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (n4 > 0) {
            return n4;
        }
        return 0;
    }

    private int n(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining <= remaining2) {
            byteBuffer2.put(byteBuffer);
            return remaining;
        }
        int min = Math.min(remaining, remaining2);
        for (int i4 = 0; i4 < min; i4++) {
            byteBuffer2.put(byteBuffer.get());
        }
        return min;
    }

    private synchronized ByteBuffer o() throws SSLException {
        while (true) {
            try {
                int remaining = this.f86925d.remaining();
                SSLEngineResult unwrap = this.f86930i.unwrap(this.f86927f, this.f86925d);
                this.f86931j = unwrap;
                if (unwrap.getStatus() != SSLEngineResult.Status.OK || (remaining == this.f86925d.remaining() && this.f86930i.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                    break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f86925d.flip();
        return this.f86925d;
    }

    private synchronized ByteBuffer q(ByteBuffer byteBuffer) throws SSLException {
        this.f86926e.compact();
        this.f86932k = this.f86930i.wrap(byteBuffer, this.f86926e);
        this.f86926e.flip();
        return this.f86926e;
    }

    public SelectableChannel a(boolean z4) throws IOException {
        return this.f86928g.configureBlocking(z4);
    }

    public boolean b(SocketAddress socketAddress) throws IOException {
        return this.f86928g.connect(socketAddress);
    }

    protected void c() {
        while (true) {
            Runnable delegatedTask = this.f86930i.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f86924c.add(this.f86923b.submit(delegatedTask));
            }
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86930i.closeOutbound();
        this.f86930i.getSession().invalidate();
        if (this.f86928g.isOpen()) {
            this.f86928g.write(q(f86921m));
        }
        this.f86928g.close();
        this.f86923b.shutdownNow();
    }

    protected void e(SSLSession sSLSession) {
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f86925d;
        if (byteBuffer == null) {
            this.f86925d = ByteBuffer.allocate(max);
            this.f86926e = ByteBuffer.allocate(packetBufferSize);
            this.f86927f = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.f86925d = ByteBuffer.allocate(max);
            }
            if (this.f86926e.capacity() != packetBufferSize) {
                this.f86926e = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f86927f.capacity() != packetBufferSize) {
                this.f86927f = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.f86925d.rewind();
        this.f86925d.flip();
        this.f86927f.rewind();
        this.f86927f.flip();
        this.f86926e.rewind();
        this.f86926e.flip();
        this.f86933l++;
    }

    public boolean f() throws IOException {
        return this.f86928g.finishConnect();
    }

    public boolean g() {
        return this.f86928g.isConnected();
    }

    @Override // org.java_websocket_new.i
    public boolean g0() {
        return this.f86928g.isBlocking();
    }

    public boolean i() {
        return this.f86930i.isInboundDone();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f86928g.isOpen();
    }

    public Socket m() {
        return this.f86928g.socket();
    }

    @Override // org.java_websocket_new.i
    public void p1() throws IOException {
        write(this.f86926e);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!h()) {
            if (g0()) {
                while (!h()) {
                    k();
                }
            } else {
                k();
                if (!h()) {
                    return 0;
                }
            }
        }
        int l4 = l(byteBuffer);
        if (l4 != 0) {
            return l4;
        }
        this.f86925d.clear();
        if (this.f86927f.hasRemaining()) {
            this.f86927f.compact();
        } else {
            this.f86927f.clear();
        }
        if ((g0() || this.f86931j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f86928g.read(this.f86927f) == -1) {
            return -1;
        }
        this.f86927f.flip();
        o();
        int n4 = n(this.f86925d, byteBuffer);
        return (n4 == 0 && g0()) ? read(byteBuffer) : n4;
    }

    @Override // org.java_websocket_new.i
    public int s1(ByteBuffer byteBuffer) throws SSLException {
        return l(byteBuffer);
    }

    @Override // org.java_websocket_new.i
    public boolean u1() {
        return this.f86926e.hasRemaining() || !h();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!h()) {
            k();
            return 0;
        }
        int write = this.f86928g.write(q(byteBuffer));
        if (this.f86932k.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // org.java_websocket_new.i
    public boolean x1() {
        if (this.f86925d.hasRemaining()) {
            return true;
        }
        return (!this.f86927f.hasRemaining() || this.f86931j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f86931j.getStatus() == SSLEngineResult.Status.CLOSED) ? false : true;
    }
}
